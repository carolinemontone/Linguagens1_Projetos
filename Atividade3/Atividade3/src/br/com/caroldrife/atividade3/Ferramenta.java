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
public class Ferramenta extends Produto {

    private String marca;
    private String tempo;
    private String material;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void adicionarFerramenta(String marca, String tempo,
            String material, float preco, int quantidade) {

        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO ferramentas (`marca`, `tempo`, `material`, "
                + "`preco`, `quantidade`, `vendida`) VALUES (?, ?, ?, ?, ?, 0)";
        PreparedStatement ps;

        try {
            ps = conexao.prepareStatement(sql);

            ps.setString(1, marca);
            ps.setString(2, tempo);
            ps.setString(3, material);
            ps.setFloat(4, preco);
            ps.setInt(5, quantidade);

            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Problemas na conexão");
        }
    }

}
