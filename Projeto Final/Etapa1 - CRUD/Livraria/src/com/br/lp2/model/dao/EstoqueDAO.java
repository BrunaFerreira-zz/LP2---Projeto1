/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Estoque;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Bruna
 */
public class EstoqueDAO implements GenericDAO<Estoque> {
   private Connection conn; 

    public EstoqueDAO() {
    }
   

    @Override
    public boolean insert(Estoque estoque) {
        
    }

    @Override
    public List<Estoque> read() {
        
    }

    @Override
    public boolean update(Estoque estoque) {
       
    }

    @Override
    public boolean delete(Estoque estoque) {
       
    }
}
