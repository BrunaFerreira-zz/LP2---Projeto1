/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.testeDAO;

import com.br.lp2.model.Pedido;
import com.br.lp2.model.dao.PedidoDAO;
import java.sql.Time;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Bruna
 */
public class TestePedidoDAO {

    public static void main(String[] args) {
        // TODO code application logic here
        //Criar instancia DAO
        System.out.println("***CRUD Pedido***");
        PedidoDAO PedidoDAO = new PedidoDAO();
        // LEITURA DOS PEDIDOS
        List<Pedido> listaU;

        // INSERÇÃO DE PEDIDO
        Pedido ul = new Pedido();
        ul.setQntItemPedido(10);
        ul.setHoraPedido(new Time(31231));
        ul.setDataPedido(new Date(2014, 12, 05));
        //PedidoDAO.insert(ul);

        //UPDATE DE UM DE PEDIDO 
        listaU = PedidoDAO.read();
        Pedido u2 = listaU.get(listaU.size() - 1);
        u2.setQntItemPedido(39);
        u2.setHoraPedido(new Time(988871));
        u2.setDataPedido(new Date(2010, 10, 05));
       // PedidoDAO.update(u2);      

        //DELETE  DE PEDIDO
        listaU = PedidoDAO.read();
        Pedido u3 = listaU.get(listaU.size() - 1);
        PedidoDAO.delete(u3);

        listaU = PedidoDAO.read();
        for (Pedido Pedido : listaU) {
            System.out.println(Pedido);
        }

    }

}
