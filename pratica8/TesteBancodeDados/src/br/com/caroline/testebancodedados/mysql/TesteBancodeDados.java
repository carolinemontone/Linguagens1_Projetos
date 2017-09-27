/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caroline.testebancodedados.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;


/**
 *
 * @author Aluno 18
 */
public class TesteBancodeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tbl_alunos";
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while (resultadoQuery.next()){
                int id = resultadoQuery.getInt("id");
                String nome = resultadoQuery.getString("nome");
                int idade = resultadoQuery.getInt("idade");
                String ra = resultadoQuery.getString("ra");
                
                System.out.println(Integer.toString(id) + " nome: " + nome + 
                        " idade: " + Integer.toString(idade) + " ra: " + ra);
            }
            ps.close();
        } catch (SQLException ex){
            System.out.println("deu ruim");
        }
    }
    
}
