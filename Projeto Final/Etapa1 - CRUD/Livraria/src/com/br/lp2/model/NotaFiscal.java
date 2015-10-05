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
public class NotaFiscal implements Serializable{

    private int numeroNF;
    private Date dataEmissao;
    private String CNPJ;

    public NotaFiscal() {
        this.numeroNF = 00000;
        //this.dataEmissao = ;
        this.CNPJ = "00000000/00";

    }

    public NotaFiscal(int numeroNF, Date dataEmissao, String CNPJ) {
        this.numeroNF = numeroNF;
        this.dataEmissao = dataEmissao;
        this.CNPJ = CNPJ;
    }

    public int getNumeroNF() {
        return numeroNF;
    }

    public void setNumeroNF(int numeroNF) {
        this.numeroNF = numeroNF;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "NotaFiscal{" + "numeroNF=" + numeroNF + ", dataEmissao=" + dataEmissao + ", CNPJ=" + CNPJ + '}';
    }

}
