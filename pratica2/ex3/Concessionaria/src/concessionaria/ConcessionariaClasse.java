/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concessionaria;

import sun.security.util.Length;

/**
 *
 * @author Professor
 */
public class ConcessionariaClasse {
    private String nome;
    private int totalFuncionario;
    private double totalVendas;
    private double taxaBonus = 0.05;
    private double bonusIndividual;
    private int nVendedor;
    private int nGerente;
    private Vendedor[] vendedor;
    private Gerente[] gerente;

    public ConcessionariaClasse (String n, int nVend, int nGer){
        n = this.nome;
        vendedor = new Vendedor[nVend];
        gerente = new Gerente[nGer];
    }
    
    public int totalVend(){
        return this.vendedor.length;
    }
    
    public int totalGer(){
        return this.gerente.length;
    }
    
    public int getTotalFuncionario() {
        return totalFuncionario;
    }

    public void setTotalFuncionario(int totalFuncionario) {
        this.totalFuncionario = totalFuncionario;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getBonusIndividual() {
        return bonusIndividual;
    }

    public void setBonusIndividual(double bonusIndividual) {
        this.bonusIndividual = bonusIndividual;
    }

    public int getnVendedor() {
        return nVendedor;
    }

    public void setnVendedor(int nVendedor) {
        this.nVendedor = nVendedor;
    }

    public int getnGerente() {
        return nGerente;
    }

    public void setnGerente(int nGerente) {
        this.nGerente = nGerente;
    }

    public Vendedor getVendedor(int i ) {
        return this.vendedor[i];
    }
    
    public void setVendedor(Vendedor[] vendedor) {
        this.vendedor = vendedor;
    }

    public Gerente getGerente(int i) {
        return this.gerente[i];
    }

    public void setGerente(Gerente[] gerente) {
        this.gerente = gerente;
    }
    
    public boolean novoVendedor(String nome, String cpf, int reg, double salario){
        boolean r;
        if (nVendedor < vendedor.length) {
            vendedor[nVendedor] = new Vendedor (nome,cpf,reg,salario);
            nVendedor++;
            totalFuncionario++;
            r = true;
        }
        else
            r =false;
        return r;
    }
    
        public boolean novoGerente(String nome, String cpf, int reg, double salario){
        boolean r;
        if (nGerente < gerente.length) {
            gerente[nGerente] = new Gerente (nome,cpf,reg,salario);
            nGerente++;
            totalFuncionario++;
            r = true;
        }
        else
            r =false;
        return r;
    }
        
        public double calcularBonificacaoVendas() {
            return ((this.calcularTotalVendas()/ this.totalFuncionario)*this.taxaBonus);
        }
        
        private double calcularTotalVendas(){
            double totalVendas = 0;
            for (int i =0; i < this.nVendedor; i++){
                totalVendas += this.vendedor[i].getVendas();
            }
            for (int i =0; i < this.nGerente; i++){
                totalVendas += this.gerente[i].getVendas();
            }
            return totalVendas;
        }
}
