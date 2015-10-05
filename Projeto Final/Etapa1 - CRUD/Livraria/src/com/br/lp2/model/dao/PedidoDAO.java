/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Pedido;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruna
 */
public class PedidoDAO implements GenericDAO<Pedido> {

    private Connection conn;

    public PedidoDAO() {
    }

    @Override
    public boolean insert(Pedido pedido) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "INSERT INTO Pedido (qntItemPedido,horaPedido,dataPedido,enderecoEntrega) VALUES(?,?,?,?)";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setInt(1, pedido.getQntItemPedido());
                ps.setTime(2, pedido.getHoraPedido());
                ps.setDate(3, pedido.getDataPedido());
                ps.setString(4, pedido.getEnderecoEntrega());
                //Passo 3 - Executar o statement (query)
                int resp = ps.executeUpdate();
                //Quantidade de linhas afetadas.
                //Passo 4 - tratar os resultados
                if (resp > 0) {
                    resposta = true;
                }
                //Passo 5 - fechar tudo
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    }

    @Override
    public List<Pedido> read() {
        List<Pedido> Pedidos = new ArrayList<>();
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "SELECT * FROM Pedido";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);

            //Passo 4 - tratar os resultados
            //Criar lista de pedidos
            try ( //Passo 3 - Executar o statement (query)
                    ResultSet rs = ps.executeQuery()) {
                //Passo 4 - tratar os resultados                
                while (rs.next()) {
                    //Next, proximo pedido
                    Pedido u = new Pedido();

                    u.setQntItemPedido(rs.getInt("qntItemPedido"));
                    u.setHoraPedido(rs.getTime("horaPedido"));
                    u.setDataPedido(rs.getDate("dataPedido"));
                    u.setEnderecoEntrega(rs.getString("enderecoEntrega"));
                    u.setId_Pedido(rs.getInt("id_Pedido"));
                    Pedidos.add(u);

                }
                //Passo 5 - fechar tudo
            }
            ps.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return Pedidos;
    }

    @Override
    public boolean update(Pedido pedido) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "UPDATE Pedido SET qntItemPedido=?, horaPedido=?, dataPedido=?, enderecoEntrega=? WHERE id_Pedido=?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getQntItemPedido());
            ps.setTime(2, pedido.getHoraPedido());
            ps.setDate(3, (Date) pedido.getDataPedido());
            ps.setString(4, pedido.getEnderecoEntrega());
            ps.setInt(5, pedido.getId_Pedido());
            //Passo 3 - executar o statement (query)
            int resp = ps.executeUpdate();
            //Quantidade de linhas afetadas. 
            //Passo 4 - tratar os resultados
            if (resp > 0) {
                resposta = true;
            }

            //Passo 5 - fechar tudo
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;
    }

    @Override
    public boolean delete(Pedido pedido) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "DELETE FROM Pedido WHERE id_Pedido=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pedido.getId_Pedido());
            //Passo 3 - executar o statement (query)
            int resp = ps.executeUpdate();
            //Quantidade de linhas afetadas. 
            //Passo 4 - tratar os resultados
            if (resp > 0) {
                resposta = true;
            }

            //Passo 5 - fechar tudo
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    }
}
