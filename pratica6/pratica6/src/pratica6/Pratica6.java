/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica6;

import java.util.ArrayList;

/**
 *
 * @author Aluno 18
 */
public class Pratica6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("top 1");
        lista.add("top 2");
        lista.add(1, "top");
       
        printList(lista);
        
    }
    
    public static void printList(ArrayList<String> arrayLista){
        System.err.println("<----Inicio Lista----->");
        for (int i=0; i< arrayLista.size();i++){
            System.out.println(arrayLista.get(i));
        }
    }
    
}
