/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caroline.HelloInsert.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno 18
 */
public class HelloInsert  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO tbl_alunos (nome, idade, ra) VALUES (?,?,?)";
        PreparedStatement ps;
        
        try {
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, "Thiago");
            ps.setInt(2, 15);
            ps.setString(3, "5353");
            
            
            ps.execute();
            ps.close();
            }
            catch(SQLException ex){
                    Logger.getLogger(HelloInsert.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
        
    }
    

