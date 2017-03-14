/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class JavaApplication3 {
    
    void Menu(){
        System.out.println("Selecione a opção desejada:\n"
                + "1-Depositar\n" = );
    }
    
    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        Cliente carol = new Cliente();
        
        c1.numero = 1;
        c1.titular = carol;
        c1.cpf = "443.026.568-24";
        c1.saldo = 7487374;
        
        carol.nome = "Caroline";
        carol.sobrenome = "Montone";
        carol.cpf = c1.cpf;
        
        System.out.println("Bem-vindo ao Banco B&G");
        
        carol.exibirInfoCliente();
        c1.exibirInfoConta();
        
        
        
        
     
    }
    
}
