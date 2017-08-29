
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno 18
 */
public class ListadeContato {

    private ArrayList<String> nome = new ArrayList<String>();
    private ArrayList<String> celular = new ArrayList<String>();

    public void adicionarContato(String nome, String celular) {
        this.nome.add(nome);
        this.celular.add(celular);
    }

    public void removerContato(int index) {
        this.nome.remove(index);
        this.celular.remove(index);
    }

    public void editarContatoNome(int index, String nome) {
        this.nome.set(index, nome);
    }

    public void editarContatoCelular(int index, String celular) {
        this.nome.set(index, celular);
    }

    public boolean buscarContato(String busca, ArrayList<String> nome, 
            ArrayList<String> celular) {
        boolean resp = false;
        
        for (int i = 0; i < this.nome.size(); i++) {
            if (this.nome.get(i) == busca) {
                nome.add(this.nome.get(i));
                celular.add(this.celular.get(i));
                resp = true;
            }
        }
        for (int i = 0; i < this.celular.size(); i++) {
            if (this.celular.get(i) == busca) {
                nome.add(this.nome.get(i));
                celular.add(this.celular.get(i));
                resp = true;
            }
        }
        return resp;
    }

}
