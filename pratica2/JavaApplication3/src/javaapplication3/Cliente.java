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
    String nome;
    String sobrenome;
    String cpf;

    void exibirInfoCliente(){
        System.out.println("Nome completo: " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }
}
