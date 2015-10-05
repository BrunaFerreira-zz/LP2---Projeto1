/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.io.Serializable;

/**
 *
 * @author Bruna
 */
public class CartaoPag extends Pagamento implements Serializable{
    private enum TipoCartao{
        debito, credito;
    }

    public CartaoPag() {
        
    }

    public CartaoPag(double valorTotal) {
        super(valorTotal);
    }

    @Override
    public String toString() {
        return "CartaoPag{" + '}';
    }
    
   
    
}
