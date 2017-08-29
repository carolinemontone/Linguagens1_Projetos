,/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;

import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Diretor extends Funcionario implements IAutenticavel{
    private int senha;

    public Diretor(String nome, String cpf, int registro, double salario, int senha) {
        super(nome, cpf, registro, salario);
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        else
            return true;
    }
    
    @Override
    public boolean alterarSenha(int senhaNova, int senhaAntiga){
        boolean retorno =false;
        if (senhaAntiga==this.senha){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;}
    
    public void funcdoMes(){
        System.out.println("Digite o nome do funcionario do mês:");
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        System.out.println(nome+" é o funcionário do mês!");
    }
    
    public void promoverFunc(){
        System.out.println("Digite o nome do funcionario que será promovido:");
        Scanner input = new Scanner(System.in);
        String nome = input.next();
        System.out.println("Digite seu novo cargo:");
        String cargo = input.next();
        System.out.println(nome+" foi promovido para " +cargo);
    }
    
    public void demitirFunc(){
        System.out.println("Digite o nome do funcionario que será demitido:");
        Scanner input = new Scanner(System.in);
        String nome = input.next();
    }
    
    public boolean darAumento(Funcionario f, int senha, double aumento){
        boolean retorno = false;
        
        if (this.autentica(senha)){
            f.setSalario(f.getSalario()+aumento);
            retorno = true;
        }
        return retorno;
    }

}
