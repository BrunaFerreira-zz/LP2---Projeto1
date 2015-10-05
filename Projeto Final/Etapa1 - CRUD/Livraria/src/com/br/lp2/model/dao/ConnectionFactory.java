/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.lp2.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruna
 */
public class ConnectionFactory {
    
    private static String driver = "org.apache.derby.jdbc.ClientDriver";
    private static String protocolo = "jdbc:derby:";
    private static String db = "projetoDB1";
    private static String dominio = "//localhost:1527/";
    private static String user = "projeto";
    private static String pwd = "123";
    private static Connection conn = null;
    
    public static Connection getConnection()
    {
        try{
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(protocolo + dominio + db, user, pwd);
        } catch(ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex){
            ex.printStackTrace();
        }
        return conn;
    }
    
    
}
