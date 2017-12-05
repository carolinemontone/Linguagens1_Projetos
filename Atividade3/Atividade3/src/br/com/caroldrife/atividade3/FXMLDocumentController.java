// Caroline Montone 1500915 Adriana Padilla 15007928 Fernanda Piva 12026433
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caroldrife.atividade3;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Aluno 18
 */
public class FXMLDocumentController extends Usuario implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtSenha;
    @FXML
    private Label lblusuario;
    @FXML
    private Label lblsenha;
    @FXML
    private Button btnOk;
    @FXML
    private TextField txtLoginCria;
    @FXML
    private TextField txtSenhaCriar;
    @FXML
    private Label lblUsuario2;
    @FXML
    private Label lblSenha2;
    @FXML
    private Button btnAdicionarUsuario;
    @FXML
    private TextField txtMarca;
    @FXML
    private TextField txtTempoDeGarantia;
    @FXML
    private TextField txtMaterial;
    @FXML
    private TextField txtPrecoFerramenta;
    @FXML
    private TextField txtQuantidadeFerramenta;
    @FXML
    private Label lblMarca;
    @FXML
    private Label lblTempoDeGarantia;
    @FXML
    private Label lblMaterial;
    @FXML
    private Label lblPrecoFerramenta;
    @FXML
    private Label lblQuantidadeFerramenta;
    @FXML
    private Button adicionarFerramenta;
    @FXML
    private TextField txtCapacidade;
    @FXML
    private TextField txtPrecoTinta;
    @FXML
    private TextField txtQuantidadeTinta;
    @FXML
    private Label lblCapacidade;
    @FXML
    private Label lblPrecoTinta;
    @FXML
    private Label lblQuantidadeTinta;
    @FXML
    private Button btnAdicionarTinta;
    Usuario usuario = new Usuario();
    Ferramenta ferramenta = new Ferramenta();
    Tinta tinta = new Tinta();
    @FXML
    private Tab tabAdicionarUsuario;
    @FXML
    private Tab tabAdicionarFerramenta;
    @FXML
    private Tab tabAdicionarTinta;
    @FXML
    private CheckBox ferramentasPesquisar;
    @FXML
    private CheckBox tintasPesquisar;
    @FXML
    private Button pesquisar;
    @FXML
    private TextArea txtPesquisar;
    @FXML
    private Button btnVenderFerramenta;
    @FXML
    private TextField txtQuantidadeVendasFerramenta;
    @FXML
    private Label lblQuantidadeFerramenta1;
    @FXML
    private TextField txtIdFerramenta;
    @FXML
    private TextField txtIdPesquisarTinta;
    @FXML
    private TextField txQuantidadeVenderTinta;
    @FXML
    private Button btnVenderTinta;
    @FXML
    private Button btnRelatorio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logar(ActionEvent event) {
        if (this.usuario.logar(txtUsuario.getText(), txtSenha.getText())){
            System.out.println("Logado");
            
            
        }
        else
            System.out.println("Usuário ou/e senha incorretos");
        txtUsuario.setText("");
        txtSenha.setText("");
//colocar as tabs available
        }
    

    @FXML
    private void adicionarUsuario(ActionEvent event) {
        if (txtLoginCria.getText().isEmpty() && txtSenhaCriar.getText().isEmpty()){
            System.out.println("Os campos não podem ficar em branco");
            
        }
        else
            this.usuario.adicionarUsuario(txtLoginCria.getText(), 
                    txtSenhaCriar.getText());
        System.out.println("Usuário criado com sucesso");
            
        txtLoginCria.setText("");
        txtSenhaCriar.setText("");
    }

    @FXML
    private void adicionarFerramenta(ActionEvent event) {
        this.ferramenta.adicionarFerramenta(txtMarca.getText(), 
                txtTempoDeGarantia.getText(), txtMaterial.getText(), 
                Float.parseFloat(txtPrecoFerramenta.getText()),
                Integer.parseInt(txtQuantidadeFerramenta.getText()));
        System.out.println("Ferramenta adicionada com sucesso");
        //limpar os campos
    }

    @FXML
    private void adicionarTinta(ActionEvent event) {
       this.tinta.adicionarTinta(Float.parseFloat(txtCapacidade.getText()),
               Float.parseFloat(txtPrecoTinta.getText()),
                Integer.parseInt(txtQuantidadeTinta.getText()));
        System.out.println("Tinta adicionada com sucesso");
        //campos
    }

    @FXML
    private void pesquisar(ActionEvent event) {
        String printar = "";
        if ( ferramentasPesquisar.isSelected() ){
            Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM ferramentas";
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while (resultadoQuery.next()){
                int codigo = resultadoQuery.getInt("codigo");
                String marca = resultadoQuery.getString("marca");
                String tempo = resultadoQuery.getString("tempo");
                String material = resultadoQuery.getString("material");
                float preco = resultadoQuery.getFloat("preco");
                int quantidade = resultadoQuery.getInt("quantidade");
                int vendida = resultadoQuery.getInt("vendida");
                
                printar = printar + Integer.toString(codigo) + " marca: " + marca + 
                        " tempo de garantia: " + tempo + " material: " + material +
                        " preco: "+ Float.toString(preco) + " quantidade: "+ 
                        Integer.toString(quantidade) + " vendida: "+ Integer.toString(vendida) + "\n";
            }
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro na conexão");
        }
        }
        printar = printar + "\n";
        if ( tintasPesquisar.isSelected() ){
            Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tinta";
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while (resultadoQuery.next()){
                int codigo = resultadoQuery.getInt("codigo");
                int capacidade = resultadoQuery.getInt("capacidade");
                float preco = resultadoQuery.getFloat("preco");
                int quantidade = resultadoQuery.getInt("quantidade");
                int vendido = resultadoQuery.getInt("vendido");
                
                printar = printar + Integer.toString(codigo) + " capacidade: "+
                        Integer.toString(capacidade)+
                        " preco: "+ Float.toString(preco) + " quantidade: "+ 
                        Integer.toString(quantidade) + " vendido: "+ Integer.toString(vendido) + "\n";
            }
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro na conexão");
        }
        }
        txtPesquisar.setText(printar);
    }

    @FXML
    private void venderFerramenta(ActionEvent event) {
        Integer id = Integer.parseInt(txtIdFerramenta.getText());
        Integer quantidadevendas = Integer.parseInt(txtQuantidadeVendasFerramenta.getText());
        int quantidade=0;
        int vendida=0;
        
        Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM ferramentas WHERE 'id'="+id;
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            quantidade = resultadoQuery.getInt("quantidade");
            vendida = resultadoQuery.getInt("vendida");    
  
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro na conexão");
        }
        
        if (quantidadevendas<= quantidade){
            sql = "UPDATE ferramentas SET 'quantidade'= "+ 
                    (quantidade-quantidadevendas)+", 'vendida'="+(vendida+quantidade)
                    +" WHERE 'id'=" +id;
            try{
            ps = conexao.prepareStatement(sql);}
            catch (SQLException ex){
            System.out.println("Erro na conexão");
        }}
        else System.out.println("Não foi possível realizar a venda");
            
            
        }

    @FXML
    private void venderTinta(ActionEvent event) {
        Integer id = Integer.parseInt(txtIdPesquisarTinta.getText());
        Integer quantidadevendas = Integer.parseInt(txQuantidadeVenderTinta.getText());
        int quantidade=0;
        int vendido=0;
        
        Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM tinta WHERE 'id'="+id;
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            quantidade = resultadoQuery.getInt("quantidade");
            vendido = resultadoQuery.getInt("vendido");    
  
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro na conexão");
        }
        
        if (quantidadevendas<= quantidade){
            sql = "UPDATE tinta SET 'quantidade'= "+ 
                    (quantidade-quantidadevendas)+", 'vendido'="+(vendido+quantidade)
                    +" WHERE 'id'=" +id;
            try{
            ps = conexao.prepareStatement(sql);}
            catch (SQLException ex){
            System.out.println("Erro na conexão");
        }}
        else System.out.println("Não foi possível realizar a venda");
            
    }

    @FXML
    private void gerarRelatorio(ActionEvent event) {
        String FILENAME = "\\relatorio.txt";
        
        try {
            File file = new File ("\\relatorio.txt");
            file.createNewFile();
            
            
            String printar = "";
        
            Connection conexao =  ConnectionFactory.getConnection();
        
        String sql = "SELECT * FROM ferramentas";
        PreparedStatement ps;
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while (resultadoQuery.next()){
                int codigo = resultadoQuery.getInt("codigo");
                String marca = resultadoQuery.getString("marca");
                String tempo = resultadoQuery.getString("tempo");
                String material = resultadoQuery.getString("material");
                float preco = resultadoQuery.getFloat("preco");
                int quantidade = resultadoQuery.getInt("quantidade");
                int vendida = resultadoQuery.getInt("vendida");
                
                printar = printar + Integer.toString(codigo) + " marca: " + marca + 
                        " tempo de garantia: " + tempo + " material: " + material +
                        " preco: "+ Float.toString(preco) + " quantidade: "+ 
                        Integer.toString(quantidade) + " vendida: "+ Integer.toString(vendida) + "\n";
            }
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro na conexão");
        }
        
        printar = printar + "\n";
        
        sql = "SELECT * FROM tinta";
        try{
            ps = conexao.prepareStatement(sql);
            ResultSet resultadoQuery = ps.executeQuery();
            
            while (resultadoQuery.next()){
                int codigo = resultadoQuery.getInt("codigo");
                int capacidade = resultadoQuery.getInt("capacidade");
                float preco = resultadoQuery.getFloat("preco");
                int quantidade = resultadoQuery.getInt("quantidade");
                int vendido = resultadoQuery.getInt("vendido");
                
                printar = printar + Integer.toString(codigo) + " capacidade: "+
                        Integer.toString(capacidade)+
                        " preco: "+ Float.toString(preco) + " quantidade: "+ 
                        Integer.toString(quantidade) + " vendido: "+ Integer.toString(vendido) + "\n";
            }
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro na conexão");
        }   
        }
        catch (IOException e){
            e.printStackTrace();
        }
        
       
    }
        
     
}
