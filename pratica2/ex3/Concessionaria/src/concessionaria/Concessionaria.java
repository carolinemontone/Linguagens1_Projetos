/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;
import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Concessionaria {

        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        System.out.println("Olá, seja bem-vindo! Qual é o nome da sua concessionaria?");
        String nome = input.next();
        System.out.println("Quantidade de vendedores:");
        int nVend = input.nextInt();
        System.out.println("Quantidade de gerentes:");
        int nGer = input.nextInt();
        
        int n1=0, n2=0, rv=0;
        while (n1<nVend && n2<nGer){
            System.out.println("Menu: \n"
                    + "1- Cadastrar vendedor \n" +
                    "2 - Cadastrar funcionário");
            int o = input.nextInt();
            
            switch (o){
                case 1: {
                    System.out.println("Nome completo:");
                    String n = input.next();
                    System.out.println("CPF:");
                    String cpf = input.next();
                    int registro = rv;
                    rv++;
                    n1++;
                    
                }
                case 2:
            }

        }
        
        
        
    }
    
}
