/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import com.br.lp2.model.Boleto;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Bruna
 */
public class BoletoDAO implements GenericDAO<Boleto>{
    
    private Connection conn;

    public BoletoDAO() {
    }
    
    @Override
    public boolean insert(Boleto boleto) {
        
    }

    @Override
    public List<Boleto> read() {
       
    }

    @Override
    public boolean update(Boleto boleto) {
        
    }

    @Override
    public boolean delete(Boleto boleto) {
       
    }
    
}
