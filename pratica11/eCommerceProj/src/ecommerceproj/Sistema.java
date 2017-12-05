/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerceproj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author caroline
 */
public class Sistema implements IAutenticavel{
    private String usuario;
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    @Override
    public boolean autentica(String login, String senha){
        boolean retorno;
        Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tblusuario_cliente WHERE usuario='"+login+"';";
        PreparedStatement ps;
        
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            String senhareal = resultadoQuery.getString("senha");
            
            if (senha.equals(senhareal)){
                retorno = true;
                setUsuario(login);
            }
            
            ps.close();
        }
        catch (SQLException ex){
            System.out.println("Não achou o usuário");
        }
        finally {
            retorno = false;
        }
        
        return retorno;
    }
    
    }

