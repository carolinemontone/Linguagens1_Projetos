/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author Aluno 18
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCel;
    @FXML
    private Button btnAdd;
    @FXML
    private TextField txtSearch;
    @FXML
    private Button btnProcurar;
    @FXML
    private Button btnEditar;
    
    ListadeContato lista = new ListadeContato();
    
    @FXML
    private TableView listView = new TableView();
    @FXML
    private TableColumn nomeColuna = new TableColumn("Nome");
    @FXML
    private TableColumn celularColuna = new TableColumn("Celular");
    
   
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       

    }    

    @FXML
    private void adicionarContato(ActionEvent event) {
        this.lista.adicionarContato(txtNome.getText(), txtCel.getText());
        txtNome.setText("");
        txtCel.setText("");
    }

    @FXML
    private void procurar(ActionEvent event) {
        ArrayList<String> nomeBusca = new ArrayList<String>(); 
        ArrayList<String> celularBusca = new ArrayList<String>();
        if (this.lista.buscarContato(txtSearch.getText(), nomeBusca, celularBusca)){
            for (int i=0; i< nomeBusca.size(); i++){
                this.listView.getColumns().addAll(nomeBusca, celularBusca);
            }
            
        }
    }

    @FXML
    private void editarContato(ActionEvent event) {
    }


  
    
}
