/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class JavaApplication3 {
    
    public static void Menu(){
        System.out.println("Selecione a opção desejada:\n"
                + "1-Depositar\n 2-Sacar\n 3-Transferir para outra conta\n 4-Visualizar saldo\n");
    }
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta("Caroline", "Montone", "443.026.568-24", 1);
        c1.depositar(400000);
       
        
        System.out.println("Bem-vindo ao Banco B&G");
        
        c1.exibirInfoConta();
        Menu();
        
        
        
        
        
     
    }
    
}
