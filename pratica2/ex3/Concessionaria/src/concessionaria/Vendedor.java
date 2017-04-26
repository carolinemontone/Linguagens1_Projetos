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
public class Vendedor extends Funcionario{
    private int registroGerente;
    private static double taxaComissao = 0.03;
    
    public Vendedor(String nome, String cpf, int reg, double salario){
        super(nome, cpf, reg, salario);
    }
    public double CalcularBonus(double dIndividual){
        return (this.vendas*this.taxaComissao + dIndividual);
    }
    
    public void realizarVenda(double valorVenda){
        if (valorVenda > 0){
            this.vendas += valorVenda;
        }
    }
    
    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas: R$"+this.vendas);
    }
       
    }
    
 
