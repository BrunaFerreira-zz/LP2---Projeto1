/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Bruna
 */
public class Despacho implements Serializable{

    private int codLocalizador;
    private Time horaEnvio;
    private Date dataEnvio;
    private Date previsaoEntrega;

    public Despacho() {
        this.codLocalizador = 00000000;
        //this.horaEnvio = ;
        //this.dataEnvio = ;
        //this.previsaoEntrega = ;
    }

    public Despacho(int codLocalizador, Time horaEnvio, Date dataEnvio, Date previsaoEntrega) {
        this.codLocalizador = codLocalizador;
        this.horaEnvio = horaEnvio;
        this.dataEnvio = dataEnvio;
        this.previsaoEntrega = previsaoEntrega;
    }

    public int getCodLocalizador() {
        return codLocalizador;
    }

    public void setCodLocalizador(int codLocalizador) {
        this.codLocalizador = codLocalizador;
    }

    public Time getHoraEnvio() {
        return horaEnvio;
    }

    public void setHoraEnvio(Time horaEnvio) {
        this.horaEnvio = horaEnvio;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public void setDataEnvio(Date dataEnvio) {
        this.dataEnvio = dataEnvio;
    }

    public Date getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(Date previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    @Override
    public String toString() {
        return "Despacho{" + "codLocalizador=" + codLocalizador + ", horaEnvio=" + horaEnvio + ", dataEnvio=" + dataEnvio + ", previsaoEntrega=" + previsaoEntrega + '}';
    }

}
