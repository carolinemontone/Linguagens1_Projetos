package br.com.caroline.Clientes.myql;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno 18
 */
public class ConnectionFactory {
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/cliente","root","Caroline91cliqu");
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
