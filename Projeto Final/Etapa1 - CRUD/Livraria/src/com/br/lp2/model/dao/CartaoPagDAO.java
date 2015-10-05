/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.CartaoPag;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruna
 */
public class CartaoPagDAO implements GenericDAO<CartaoPag>{
    private Connection conn;

    public CartaoPagDAO() {
    }

    @Override
    public boolean insert(CartaoPag cartaoPag) {
             boolean resposta = false;
        //Passo 1 - Criar Conexao
        conn = ConnectionFactory.getConnection();

        //Passo 2 - Criar a query e o statement
        String sql = "INSERT INTO CartaoPag(tipoCartao) VALUES(?)";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                //ps.setString(1, cartaoPag.getClass(Pagamento.));
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
            Logger.getLogger(CartaoPagDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resposta;
        
    }

    @Override
    public List<CartaoPag> read() {
        
    }

    @Override
    public boolean update(CartaoPag cartaoPag) {
        
    }

    @Override
    public boolean delete(CartaoPag cartaoPag) {
        
    }
    
    
}
