/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.util.ArrayList;

/**
 *
 * @author Aluno 18
 */
public class Carrinho {
    private ArrayList<String> itens = new ArrayList<String>();

    public void adicionarItem (String item){
        this.itens.add(item);
    }
    
    public void removerTudo (){
        this.itens.clear();
    }
    
    public String exibir(){
        String lista = "";
        for (int i=0; i<itens.size();i++){
            lista = lista + this.itens.get(i)+ "\n";
        }
        return lista;
    }
   
}
