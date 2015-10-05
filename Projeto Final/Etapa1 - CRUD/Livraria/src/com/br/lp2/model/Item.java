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
public class Item implements Serializable{
    private int id_item, codigoItem;
    private double precoItem;
    private String descricaoItem;

    public Item() {
        this.id_item = -1;
        this.codigoItem = 00000;
        this.precoItem = 0000;
        this.descricaoItem = "Descrição";
    }

    public Item(int id_item, int codigoItem, double precoItem, String descricaoItem) {
        this.id_item = id_item;
        this.codigoItem = codigoItem;
        this.precoItem = precoItem;
        this.descricaoItem = descricaoItem;
    }

    public int getId_item() {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
        this.codigoItem = codigoItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    @Override
    public String toString() {
        return "Item{" + "id_item=" + id_item + ", codigoItem=" + codigoItem + ", precoItem=" + precoItem + ", descricaoItem=" + descricaoItem + '}';
    }  

    
}
