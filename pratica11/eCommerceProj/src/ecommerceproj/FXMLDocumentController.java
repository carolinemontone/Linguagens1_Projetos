/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerceproj;

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
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

/**
 *
 * @author caroline
 */
public class FXMLDocumentController implements Initializable {
    
    Produtos produtos = new Produtos();
    Sistema sistema = new Sistema();
    
    @FXML
    private Label label;
    @FXML
    private TextArea txtProdutos;
    @FXML
    private TextField txtIdProd;
    @FXML
    private Button btnPesquisarProd;
    @FXML
    private TextField qntCarrinho;
    @FXML
    private WebView webImagem;
    @FXML
    private Label lblNomeProduto;
    @FXML
    private Label lblDescProduto;
    @FXML
    private Label lblPrecoDesc;
    @FXML
    private Button btnfazerLogin;
    @FXML
    private TextField txtUsuario;
    @FXML
    private TextField txtSenha;
    @FXML
    private Tab tab_produtos;
    @FXML
    private Tab tab_produto;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String exib="";
        produtos.exibirTodosProdutos(exib);
        txtProdutos.setText(exib);
           
    }    


    @FXML
    private void buscarProduto(ActionEvent event) {
       
        produtos.buscarProduto(Integer.parseInt(txtIdProd.getText()));
        lblNomeProduto.setText(produtos.getNome());
        lblDescProduto.setText(produtos.getDescr());
        lblPrecoDesc.setText("R$"+Float.toString(produtos.getPreco()));  
    }

    @FXML
    private void logar(ActionEvent event) {
        
        String usuario = txtUsuario.getText();
        String senha = txtSenha.getText();
        
        if (sistema.autentica(usuario, senha)){
           tab_produto.setDisable(false);
           tab_produtos.setDisable(false);
        }
        
        
    }

}
