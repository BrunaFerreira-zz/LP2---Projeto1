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
public class Estoque implements Serializable {    
    private int id_estoque, qntItem;
    private String enderecoEstoque;

    //Construtor Default
    public Estoque() {
       this.id_estoque = -1;
       this.qntItem = 0;
        this.enderecoEstoque = "Rua:xxxx , numero:00, cep:00000-000, cidade:xxxx, Estado:XX"; 
       //this.dataAbastecimento = 00-0000-00;
    }

    public Estoque(int id_estoque, int qntItem, String enderecoEstoque) {
        this.id_estoque = id_estoque;
        this.qntItem = qntItem;
        this.enderecoEstoque = enderecoEstoque;
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getQntItem() {
        return qntItem;
    }

    public void setQntItem(int qntItem) {
        this.qntItem = qntItem;
    }

    public String getEnderecoEstoque() {
        return enderecoEstoque;
    }

    public void setEnderecoEstoque(String enderecoEstoque) {
        this.enderecoEstoque = enderecoEstoque;
    }

    @Override
    public String toString() {
        return "Estoque{" + "id_estoque=" + id_estoque + ", qntItem=" + qntItem + ", enderecoEstoque=" + enderecoEstoque + '}';
    }   
    
}
