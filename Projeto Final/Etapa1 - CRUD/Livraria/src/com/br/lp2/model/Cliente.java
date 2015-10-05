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
public class Cliente implements Serializable {
    private int id_Cliente, idade;
    private String nomeCliente, email, telefone, CPF, usuario, senha, endereco;   

    public Cliente() {
        this.id_Cliente = -1;
        this.idade = -1;    
        this.nomeCliente = "Anônimo";
        this.email = "anonimo@email.com";
        this.telefone = "(00)00000-0000";
        this.CPF = "000.000.000-00";        
        this.usuario = nomeCliente;
        this.senha = senha; 
        this.endereco = "Rua:xxxx , numero:00, cep:00000-000, cidade:xxxx, Estado:XX";
    }

    public Cliente(int id_Cliente, int idade, String nomeCliente, String email, String telefone, String CPF, String usuario, String senha, String endereco) {
        this.id_Cliente = id_Cliente;
        this.idade = idade;
        this.nomeCliente = nomeCliente;
        this.email = email;
        this.telefone = telefone;
        this.CPF = CPF;
        this.usuario = usuario;
        this.senha = senha;
        this.endereco = endereco;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_Cliente=" + id_Cliente + ", idade=" + idade + ", nomeCliente=" + nomeCliente + ", email=" + email + ", telefone=" + telefone + ", CPF=" + CPF + ", usuario=" + usuario + ", senha=" + senha + ", endereco=" + endereco + '}';
    }


    
}
