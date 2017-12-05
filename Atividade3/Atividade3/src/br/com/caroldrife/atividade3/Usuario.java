/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caroldrife.atividade3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno 18
 */
public class Usuario {
    private String usuario;
    private String senha;
    
    public boolean logar(String usuario, String senha){
        boolean resultado = false;
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "SELECT * FROM usuarios";
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            while (resultadoQuery.next()){
                if (resultadoQuery.getString("usuario").equals(usuario)){                
                
                    if (resultadoQuery.getString("senha").equals(senha)){
                        resultado = true;
                        
                    }   
                }
            }
         ps.close();
         conexao.close();     
    }
        catch (SQLException ex){
            System.out.println("Problemas na conexão");
        }
        return resultado;
}
    
    public void adicionarUsuario(String usuario, String senha){
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO usuarios (`usuario`, `senha`) VALUES (?, ?)";
        PreparedStatement ps;
        
        try {
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, usuario);
            ps.setString(2, senha);
            
            ps.execute();
            ps.close();
            }
        catch(SQLException ex){
                System.out.println("Problemas na conexão");
            }
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
}
