/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {
    
    public static void Menu1(){
        System.out.println("Selecione a opção desejada:\n"
                + "1-Criar conta\n 2-Alterar conta\n 3-Sair\n");
    }
    
    public static void Menu2 (){
          System.out.println("Selecione a opção desejada:\n"
                + "1-Depositar\n 2-Sacar\n 3-Transferir para outra conta\n 4-Visualizar saldo\n 6-Sair\n");
    
}
    
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Bem-vindo ao Banco B&G");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        Menu1();
            switch (n) {
                case 1: 
                    String nome, sobrenome, cpf;
                    nome = input.nextLine();
                    
            }
        
        while (n != 6){
            Menu();
            System.out.println("Opção: ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            switch (n){
                case 1:
            }
           // Conta c1 = new Conta("Caroline", "Montone", "443.026.568-24", 1);
       
 
        }
        // c1.exibirInfoConta();
        Menu();
        
        
        
        
        
     
    }
    
}
