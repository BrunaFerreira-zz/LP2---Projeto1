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
public class Livro implements Serializable{
    private int id_livro,numeroSerie,ano, edicao;
    private String titulo, autor, editora, genero;
    
    //Construtor Default
    public Livro() {
      this.id_livro = -1;
      this.titulo = "Nome da Obra";
      this.autor = "Autor da Obra";
      this.editora = "Editora";
      this.edicao = 0;
      this.ano = 0000;
      this.genero = "Genero";
      this.numeroSerie = 00000;
    }
    
    //Construtor Completo

    public Livro(int id_livro, int numeroSerie, int ano, int edicao, String titulo, String autor, String editora, String genero) {
        this.id_livro = id_livro;
        this.numeroSerie = numeroSerie;
        this.ano = ano;
        this.edicao = edicao;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
    }
    
    //Getters e Setters

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" + "id_livro=" + id_livro + ", numeroSerie=" + numeroSerie + ", ano=" + ano + ", edicao=" + edicao + ", titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", genero=" + genero + '}';
    }
    
    
    
}
