/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Cliente;    
import java.sql.Connection;
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
public class ClienteDAO implements GenericDAO<Cliente> {

    private Connection conn;

    public ClienteDAO() {
    }

    @Override
    public boolean insert(Cliente cliente) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "INSERT INTO Cliente(nomeCliente,CPF,telefone,email,idade,endereco,usuario,senha) VALUES(?,?,?,?,?,?,?,?)";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, cliente.getNomeCliente());
                ps.setString(2, cliente.getCPF());
                ps.setString(3, cliente.getTelefone());
                ps.setString(4, cliente.getEmail());
                ps.setInt(5, cliente.getIdade());
                ps.setString(6, cliente.getEndereco());
                ps.setString(7, cliente.getUsuario());
                ps.setString(8, cliente.getSenha());
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
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    }

    @Override
    public List<Cliente> read() {
        List<Cliente> Clientes = new ArrayList<>();
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "SELECT * FROM Cliente";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);

            //Passo 4 - tratar os resultados
            //Criar lista de clientes
            try ( //Passo 3 - Executar o statement (query)
                    ResultSet rs = ps.executeQuery()) {
                //Passo 4 - tratar os resultados                
                while (rs.next()) {
                    //Next, proximo cliente
                    Cliente u = new Cliente();

                    u.setNomeCliente(rs.getString("nomeCliente"));
                    u.setCPF(rs.getString("CPF"));
                    u.setTelefone(rs.getString("telefone"));
                    u.setEmail(rs.getString("email"));
                    u.setIdade(rs.getInt("idade"));
                    u.setEndereco(rs.getString("endereco"));
                    u.setUsuario(rs.getString("usuario"));
                    u.setSenha(rs.getString("senha"));                    
                    u.setId_Cliente(rs.getInt("id_Cliente"));
                    Clientes.add(u);
                }
                //Passo 5 - fechar tudo
            }
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Clientes;
    }

    @Override
    public boolean update(Cliente cliente) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "UPDATE Cliente SET nomeCliente=?, CPF=?, telefone=?, email=?, idade=?, endereco=?, usuario=?, senha=? WHERE id_Cliente=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNomeCliente());
            ps.setString(2, cliente.getCPF());
            ps.setString(3, cliente.getTelefone());
            ps.setString(4, cliente.getEmail());
            ps.setInt(5, cliente.getIdade());            
            ps.setString(6, cliente.getEndereco());
            ps.setString(7, cliente.getUsuario());
            ps.setString(8, cliente.getSenha());          
            ps.setInt(9, cliente.getId_Cliente());
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
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;
    }

    @Override
    public boolean delete(Cliente cliente) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "DELETE FROM Cliente WHERE id_Cliente=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getId_Cliente());
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
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    }
}
