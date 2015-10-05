/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.io.Serializable;

public class Pagamento implements Serializable{
    private double valorTotal;

    public Pagamento() {
        this.valorTotal = 000.00;
    }

    public Pagamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Pagamento{" + "valorTotal=" + valorTotal + '}';
    }
    
    
    
    
}
