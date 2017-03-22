// Adriana Padilla 15.00792-8
//Caroline Montone 15.00091-5
package atividade1;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    void setNome(String nome) {
        this.nome = nome;
    }

    String getNome() {
        return this.nome;
    }

    String getSobrenome() {
        return this.sobrenome;
    }

    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    String getCpf() {
        return this.cpf;
    }
}
