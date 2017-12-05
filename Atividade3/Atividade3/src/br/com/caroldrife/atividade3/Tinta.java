/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caroldrife.atividade3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Aluno 18
 */
public class Tinta extends Produto{
    private float capacidade;
    
    
    public void adicionarTinta(float capacidade, float preco, int quantidade){
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO tinta (`capacidade`, "
                + "`preco`, `quantidade`, `vendido`) VALUES (?, ?, ?, 0)";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);

            ps.setFloat(1, capacidade);
            ps.setFloat(2, preco);
            ps.setInt(3, quantidade);


            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Problemas na conexão");
        }
    }
}
