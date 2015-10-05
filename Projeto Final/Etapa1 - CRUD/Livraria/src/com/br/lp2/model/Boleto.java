/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bruna
 */
public class Boleto extends Pagamento implements Serializable{

    private Date dataVencimento;
    private int numeroBoleto;

    public Boleto(Date dataVencimento, int numeroBoleto) {
        this.dataVencimento = dataVencimento;
        this.numeroBoleto = numeroBoleto;
    }

    public Boleto(Date dataVencimento, int numeroBoleto, double valorTotal) {
        super(valorTotal);
        this.dataVencimento = dataVencimento;
        this.numeroBoleto = numeroBoleto;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto(int numeroBoleto) {
        this.numeroBoleto = numeroBoleto;
    }

    @Override
    public String toString() {
        return "Boleto{" + "dataVencimento=" + dataVencimento + ", numeroBoleto=" + numeroBoleto + '}';
    }
    
}
