/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;
/**
 *
 * @author Professor
 */
abstract class Funcionario {
    protected String nomeCompleto;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected double bonus;
    protected double vendas;
    protected double horaExtra;

    
    double calcularBonus(double bIndividual){
        return bIndividual;
    }
    
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    
    public void setNomeCompleto(String n){
        this.nomeCompleto = n;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String n){
        this.cpf = n;
    }
    
    public int getRegistro(){
        return this.registro;
    }
    
    public void setRegistro(int n){
        this.registro = n;
    }
    
    public double getHoraExtra(){
        return this.horaExtra;
    }
    
    public void setHoraExtra(double n){
        this.horaExtra = n;
    }
    
    
    public double calcularDecTer(){
        return this.salarioBase + 1;
    }
    
    public double calcularFerias(){
        return this.salarioBase + this.salarioBase/3;
    }
    
        public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
    
    public void exibirResumo(){
        System.out.println("Nome: "+ this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salário base: " + this.salarioBase);
    }
}