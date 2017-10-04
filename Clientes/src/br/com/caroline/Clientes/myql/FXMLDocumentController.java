package br.com.caroline.Clientes.myql;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author caroline
 */
public class FXMLDocumentController implements Initializable{

    @FXML
    private Label label;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtTel;
    @FXML
    private Label label1;
    @FXML
    private Label label11;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtId;
    @FXML
    private Label label2;

 
   
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inserir(ActionEvent event) {
        Connection conexao = ConnectionFactory.getConnection();
        String sql = "INSERT INTO clientes (nome, tel, email) VALUES (?,?,?)";
        PreparedStatement ps;
        try {
            ps = conexao.prepareStatement(sql);
            
            ps.setString(1, txtNome.getText());
            ps.setString(2, txtTel.getText());
            ps.setString(3, txtEmail.getText());
            
            
            ps.execute();
            ps.close();
            }
            catch(SQLException ex){
                  // deu ruim   
            }
    }

    @FXML
    private void alterar(ActionEvent event) {
    }

    @FXML
    private void remover(ActionEvent event) {
    }

    @FXML
    private void limpar(ActionEvent event) {
        txtId.setText("");
        txtNome.setText("");
        txtTel.setText("");
        txtEmail.setText("");
    }

    @FXML
    private void pesquisar(ActionEvent event) {
    }
    
}
