/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroalunos;

/**
 *
 * @author Aluno 18
 */
public class Aluno {
    private String nome;
    private int idade;
    private String endereco;
    private String rg;
    private String cpf;

    public Aluno(String nome, int idade, String endereco, String rg, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.rg = rg;
        this.cpf = cpf;
    }
    
}
