/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * @author Caroline 15.00091-5
 * Adriana 15.00792-8
 */
public class Cliente {
    private String cpf;
    private String nome;
    private String endereco;
    private String cep;
    private String email;

    public Cliente(String cpf, String nome, String endereco, String cep, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String exibirResumo(){
        String r = "Nome: "+this.nome+"\n\r"+"CPF: "+this.cpf+"\n\r"+"Endereço:"
                + this.endereco + " " + this.cep + "\n\r" + "E-mail: "+this.email
                +" \n\r";
        
        return r;
    }
}
