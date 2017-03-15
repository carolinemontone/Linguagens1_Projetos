/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Professor
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }
    
    String getCpf (){
        return this.cpf;
    }
    
    void setCpf (String cpf){
        this.cpf = cpf;
    }
       
    void exibirInfoCliente(){
        System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }
}
