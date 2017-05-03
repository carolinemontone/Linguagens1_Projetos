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
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo! Qual é o nome da sua concessionaria?");
        String nome = input.next();
        System.out.println("Quantidade máxima de vendedores:");
        int nVend = input.nextInt();
        System.out.println("Quantidade máxima de gerentes:");
        int nGer = input.nextInt();

        ConcessionariaClasse concessionaria = new ConcessionariaClasse(nome, nVend, nGer);

        int n1 = 0, n2 = 0, rv = 0, a = 0;
        do {
            MenuA();
            a = input.nextInt();
            switch (a) {
                case 1: {
                    int b = 0;
                    MenuB(concessionaria);
                    break;
                }
                case 2:{
                    int c = 0;
                    MenuC(concessionaria);
                    break;
                }
                case 3:{
                    
                }
                
            }
        } while (a != 4);
    }

    public static void MenuA() {
        System.out.println("Menu: \n"
                + "1- Inserir funcionário\n"
                + "2 - Realizar vendas\n"
                + "3 - Exibir Resumo\n"
                + "4 - Sair");

    }

    public static void MenuB(ConcessionariaClasse concessionaria) {
        Scanner input = new Scanner(System.in);
        int b = 0;
        do {
            System.out.println("1-Inserir novo vendedor\n"
                    + "2 - Inserir novo gerente\n"
                    + "3 - Voltar ao menu anterior");
            b = input.nextInt();
            switch (b) {
                case 1: {
                    String nvend = input.next();
                    String cpf = input.next();
                    int reg = input.nextInt();
                    double salario = input.nextDouble();
                    concessionaria.novoVendedor(nvend, cpf, reg, salario);
                    break;
                }
                case 2: {
                    String nvend = input.next();
                    String cpf = input.next();
                    int reg = input.nextInt();
                    double salario = input.nextDouble();
                    concessionaria.novoGerente(nvend, cpf, reg, salario);
                    break;
                }
            }
        } while (b != 3);
    }
    
    public static void MenuC(ConcessionariaClasse concessionaria){
        System.out.println("Lista de funcionários:");
        System.out.println("VENDEDORES");
        Vendedor vTemp;
        for (int i =0; i > concessionaria.totalVend(); i++){
            vTemp = concessionaria.getVendedor(i);
            System.out.println("Registro: " + vTemp.getRegistro() +"/n" +
                                "Nome:" + vTemp.getNomeCompleto()+ "/n");
        }
        Gerente gTemp;
        for (int i =0; i > concessionaria.totalVend(); i++){
            gTemp = concessionaria.getGerente(i);
            System.out.println("Registro: " + gTemp.getRegistro() +"/n" +
                                "Nome:" + gTemp.getNomeCompleto()+ "/n");
        }
        
        System.out.println("Registro do funcionário que irá realizar a venda:");
        Scanner input = new Scanner(System.in);
        int reg = input.nextInt();
        
    }

}
