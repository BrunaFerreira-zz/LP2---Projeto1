/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;


import java.io.Serializable;
import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author Bruna
 */
public class Pedido implements Serializable{
    private int id_Pedido, qntItemPedido;
    private Time horaPedido;
    private Date dataPedido;
    private String enderecoEntrega;
    
    //Construtor Default 

    public Pedido() {
        this.id_Pedido = -1;
        this.dataPedido= new Date(0000, 00, 00);
        this.horaPedido = new Time(0);
        this.qntItemPedido = 0;  
        this.enderecoEntrega = "Rua:xxxx , numero:00, cep:00000-000, cidade:xxxx, Estado:XX";

        
    }
    
    //Construtor completo

    public Pedido(int id_Pedido, int qntItemPedido, Time horaPedido, Date dataPedido, String enderecoEntrega) {
        this.id_Pedido = id_Pedido;
        this.qntItemPedido = qntItemPedido;
        this.horaPedido = horaPedido;
        this.dataPedido = dataPedido;
        this.enderecoEntrega = enderecoEntrega;
    }

    public int getId_Pedido() {
        return id_Pedido;
    }

    public void setId_Pedido(int id_Pedido) {
        this.id_Pedido = id_Pedido;
    }

    public int getQntItemPedido() {
        return qntItemPedido;
    }

    public void setQntItemPedido(int qntItemPedido) {
        this.qntItemPedido = qntItemPedido;
    }

    public Time getHoraPedido() {
        return horaPedido;
    }

    public void setHoraPedido(Time horaPedido) {
        this.horaPedido = horaPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_Pedido=" + id_Pedido + ", qntItemPedido=" + qntItemPedido + ", horaPedido=" + horaPedido + ", dataPedido=" + dataPedido + ", enderecoEntrega=" + enderecoEntrega + '}';
    }

   
    
    
}
