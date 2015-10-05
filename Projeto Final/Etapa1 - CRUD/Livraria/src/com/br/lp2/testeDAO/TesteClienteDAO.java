/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.testeDAO;

import com.br.lp2.model.Cliente;
import com.br.lp2.model.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */
public class TesteClienteDAO {

    public static void main(String[] args) {
        // TODO code application logic here
        //Criar instancia DAO
        System.out.println("***CRUD Cliente***");
        ClienteDAO ClienteDAO = new ClienteDAO();
        // LEITURA DOS CLIENTES
        List<Cliente> listaU;

        // INSERÇÃO DE CLIENTE
        Cliente ul = new Cliente();
        ul.setNomeCliente("Bruna Ferreira");
        ul.setCPF("117.876.546-63");
        ul.setTelefone("(43)77484-9865");
        ul.setEmail("bruna.ferreira@gmail.com");
        ul.setIdade(56);
        ul.setEndereco("Rua xxxxxxxxxx, numero:345 , Parque Dom Pedro II, São Paulo - Capital SP, CEP:00000-000");
        ul.setUsuario("Bruna12345");
        ul.setSenha("Bruna123");
        //ClienteDAO.insert(ul);
        
        /*
        //UPDATE DE UM  DE CLIENTE 
        listaU = ClienteDAO.read();
        Cliente u2 = listaU.get(listaU.size() - 1);
        u2.setNomeCliente("Gustavo Rodrigues");
        u2.setCPF("123.456.789-98");
        u2.setTelefone("(43)65432-9876");
        u2.setEmail("gustavo@gmail.com");
        u2.setIdade(78);
        ClienteDAO.update(u2);
        */
        /*
        //DELETE  DE CLIENTE
        listaU = ClienteDAO.read();
        Cliente u3 = listaU.get(listaU.size() - 1);
        ClienteDAO.delete(u3);
        */
        listaU = ClienteDAO.read();
        for (Cliente Cliente : listaU) {
            System.out.println(Cliente);
        }

    }
}
