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
public class Produtos {
    private int id;
    private String nome;
    private String descr;
    private float preco;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public void exibirTodosProdutos(String exib){
        Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT idproduto, nome, preco FROM tblprodutos";
        PreparedStatement ps;
        
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while (resultadoQuery.next()){
                this.setId(resultadoQuery.getInt("idproduto"));
                this.setNome(resultadoQuery.getString("nome"));
                this.setPreco(resultadoQuery.getFloat("preco"));
                
                exib = exib + Integer.toString(this.getId()) + "      nome: " + this.getNome() +
                        "       preço: R$" + Float.toString(this.getPreco()) +"\n";
            }
            ps.close();}
        catch (SQLException ex){
            System.out.println("deu ruim");
        }      
    }
    
    public void buscarProduto (int id){
        Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT idproduto, nome, descr, url_img FROM tblprodutos WHERE idproduto="+id;
        PreparedStatement ps;
        
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            
                this.setId(resultadoQuery.getInt("idproduto"));
                this.setNome(resultadoQuery.getString("nome"));
                this.setDescr(resultadoQuery.getString("descr"));
                this.setPreco(resultadoQuery.getFloat("preco"));
            
            ps.close();}
        catch (SQLException ex){
            System.out.println("deu ruim");
        }      
    }
            
}
