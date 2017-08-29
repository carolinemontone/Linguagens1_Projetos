/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

/**
 *
 * @author Aluno 18
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private CheckBox checkBox5;
    @FXML
    private CheckBox checkBox6;
    @FXML
    private CheckBox checkBox7;
    @FXML
    private CheckBox checkBox8;
    @FXML
    private Button btnAdicionar;
    
    @FXML
    private Button btnRemoverTudo;

    @FXML
    private TextArea textArea;
    
    Carrinho lista = new Carrinho();
    
    @FXML
    private void adicionar(ActionEvent event) {
        if (this.checkBox1.isSelected()){
            this.lista.adicionarItem(checkBox1.getText()); 
        }
        if (this.checkBox2.isSelected()){
            lista.adicionarItem(checkBox2.getText()); 
        }
        if (this.checkBox3.isSelected()){
            this.lista.adicionarItem(checkBox3.getText()); 
        }
        if (this.checkBox4.isSelected()){
            this.lista.adicionarItem(checkBox4.getText()); 
        }
        if (this.checkBox5.isSelected()){
            this.lista.adicionarItem(checkBox5.getText()); 
        }
        if (this.checkBox6.isSelected()){
            this.lista.adicionarItem(checkBox6.getText()); 
        }
        if (this.checkBox7.isSelected()){
            this.lista.adicionarItem(checkBox7.getText()); 
        }
        if (this.checkBox8.isSelected()){
            this.lista.adicionarItem(checkBox8.getText()); 
        }
        textArea.setText(this.lista.exibir());
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        checkBox5.setSelected(false);
        checkBox6.setSelected(false);
        checkBox7.setSelected(false);
        checkBox8.setSelected(false);
    }
    @FXML
    private void removerTudo(ActionEvent event) {
        this.lista.removerTudo();
        textArea.setText(lista.exibir());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    




  

    
}
