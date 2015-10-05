/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.testeDAO;

import com.br.lp2.model.Livro;
import com.br.lp2.model.dao.LivroDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */
public class TesteLivroDAO {

    public static void main(String[] args) {
        LivroDAO livroDAO = new LivroDAO();

        //READ DE UM ATENDENTE
        List<Livro> listaU;

        
         // INSERÇÃO DE UM ATENDENTE
         Livro a1 = new Livro();
         a1.setTitulo("Memórias Póstumas de Braz Cubas");
         a1.setAutor("Machado de Assis");
         a1.setEditora("Mavel");
         a1.setGenero("Literário");
         a1.setNumeroSerie(78000);
         a1.setAno(1798);
         a1.setEdicao(70);
         livroDAO.insert(a1);
         
        /*
         // UPDATE DE UM ATENDENTE
         listaU = livroDAO.read();
         Livro u2 = listaU.get(listaU.size() - 1);
         u2.setTitulo("60 Anos Depois - Do Outro Lado Do Campo De Centeio");
         u2.setAutor("Colting, Fredrik");
         u2.setEditora("Mavel");
         u2.setGenero("Literatura contemporânea");
         u2.setNumeroSerie(97885);
         u2.setAno(1798);
         u2.setEdicao(1);
         livroDAO.update(u2);
         */
        //DELETE DE UM CADASTRO DE CLIENTE 
        listaU = livroDAO.read();
        Livro u3 = listaU.get(listaU.size() - 1);
        livroDAO.delete(u3);

        listaU = livroDAO.read();
        for (Livro livro : listaU) {
            System.out.println(livro);
        }

    }

}
