/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;

/**
 *
 * @author Professor
 */
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private int registro;
    private double salario;
    
    public Funcionario(String nome, String cpf, int registro, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.salario = salario;
                
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
