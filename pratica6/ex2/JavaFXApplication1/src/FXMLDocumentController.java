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
    private TextField txtNome;
    private TextField txtCel;
    private TextField txtSearch;
    @FXML
    private Button btnProcurar;
    @FXML
    private Button btnEditar;
    
    ListadeContato lista = new ListadeContato();
    @FXML
    private TableView<Contato> listView;
    @FXML
    private Button adicionarContato;
    @FXML
    private TableColumn<Contato, String> nomeColuna;
    @FXML
    private TableColumn<Contato, String> celularColuna;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void adicionarContato(ActionEvent event) {
        this.lista.adicionarContato(txtNome.getText(), txtCel.getText());
        txtNome.setText("");
        txtCel.setText("");
    }

    private void procurar(ActionEvent event) {
        ArrayList<String> nomeBusca = new ArrayList<String>(); 
        ArrayList<String> celularBusca = new ArrayList<String>();
        if (this.lista.buscarContato(txtSearch.getText(), nomeBusca, celularBusca)){
            for (int i=0; i< nomeBusca.size(); i++){
                
            }
            
        }
    }

    @FXML
    private void editarContato(ActionEvent event) {
    }
    
}
