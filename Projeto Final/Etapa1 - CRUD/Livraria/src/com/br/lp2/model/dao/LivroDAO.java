/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Livro;
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
public class LivroDAO implements GenericDAO<Livro> {

    private Connection conn;

    public LivroDAO() {
    }

    @Override
    public boolean insert(Livro livro) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "INSERT INTO livro(titulo,autor,editora,genero,numeroSerie,ano,edicao) VALUES(?,?,?,?,?,?,?)";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, livro.getTitulo());
                ps.setString(2, livro.getAutor());
                ps.setString(3, livro.getEditora());
                ps.setString(4, livro.getGenero());
                ps.setInt(5, livro.getNumeroSerie());
                ps.setInt(6, livro.getAno());
                ps.setInt(7, livro.getEdicao());
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
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    }

    @Override
    public List<Livro> read() {
        List<Livro> livros = new ArrayList<>();
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "SELECT * FROM livro";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);

            //Passo 4 - tratar os resultados
            //Criar lista de livros
            try ( //Passo 3 - Executar o statement (query)
                    ResultSet rs = ps.executeQuery()) {
                //Passo 4 - tratar os resultados                
                while (rs.next()) {
                    //Next, proximo cadastro cliente
                    Livro u = new Livro();

                    u.setTitulo(rs.getString("titulo"));
                    u.setAutor(rs.getString("autor"));
                    u.setEditora(rs.getString("editora"));
                    u.setGenero(rs.getString("genero"));
                    u.setNumeroSerie(rs.getInt("numeroserie"));
                    u.setAno(rs.getInt("ano"));
                    u.setEdicao(rs.getInt("edicao"));
                    u.setId_livro(rs.getInt("id_livro"));
                    livros.add(u);
                }
                //Passo 5 - fechar tudo
            }
            ps.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return livros;
    }

    @Override
    public boolean update(Livro livro) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "UPDATE livro SET titulo=?, autor=?, editora=?, genero=?, numeroSerie=?, ano=?, edicao=? WHERE id_livro=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getAutor());
            ps.setString(3, livro.getEditora());
            ps.setString(4, livro.getGenero());
            ps.setInt(5, livro.getNumeroSerie());
            ps.setInt(6, livro.getAno());
            ps.setInt(7, livro.getEdicao());
            ps.setInt(8, livro.getId_livro());
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
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resposta;
    }

    @Override
    public boolean delete(Livro livro) {
        boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "DELETE FROM livro WHERE id_livro=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, livro.getId_livro());
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
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
    }

}
