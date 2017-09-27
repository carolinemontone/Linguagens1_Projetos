
package br.com.caroline.cadastroAlunos.mysql;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Aluno 18
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtIdade;
    @FXML
    private TextField txtRg;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtEndereco;
    @FXML
    private Button btnCadastrar;
    @FXML
    private ImageView imgView;
    @FXML
    private Button btnImagem;

    @FXML
    private void cadastrar(ActionEvent event) throws IOException {
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String end = txtEndereco.getText();
        String rg = txtRg.getText();
        String cpf = txtCpf.getText();

        //if (!file.exists()) {

            Connection conexao = ConnectionFactory.getConnection();
            String sql = "INSERT INTO tbl_aluno (nome, idade, endereço, rg, cpf) VALUES (?,?,?,?,?)";
            PreparedStatement ps;

            try {
                ps = conexao.prepareStatement(sql);

                ps.setString(1, nome);
                ps.setInt(2, idade);
                ps.setString(3, end);
                ps.setString(4, rg);
                ps.setString(5, cpf);

                ps.execute();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        //} else {
          //  System.out.println("O aluno já está cadastrado!");
        //}

    }

    @FXML
    private void adicionarImagem(ActionEvent event) throws MalformedURLException {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        FileChooser.ExtensionFilter extFilterJPG = new FileChooser.ExtensionFilter("JPG files (*.jpg)", "*.JPG");
        FileChooser.ExtensionFilter extFilterPNG = new FileChooser.ExtensionFilter("PNG files (*.png)", "*.PNG");
        chooser.getExtensionFilters().addAll(extFilterJPG, extFilterPNG);
        File file = chooser.showOpenDialog(imgView.getScene().getWindow());

        URL url = file.toURI().toURL();
        //imgView.setImage(url);
        imgView.setImage(new Image(url.toExternalForm()));

    }

    @Override
    public void initialize(URL url, ResourceBundle rb
    ) {
        // TODO
    }

}
