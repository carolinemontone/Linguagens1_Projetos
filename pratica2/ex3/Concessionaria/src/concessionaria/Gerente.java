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
public class Gerente extends Funcionario{
    private static double taxaComissao = 0.05;

    public Gerente(String nome, String cpf, int reg, double salario){
        nome = this.nomeCompleto;
        cpf = this.cpf;
        reg = this.registro;
        salario = this.salarioBase;
    }
    
   @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas: R$"+this.vendas);
    }
    
    public double CalcularBonus(double dIndividual){
        return (this.vendas*this.taxaComissao + dIndividual);
    }
    
    public double remuneracaoFinal (double bIndividual){
       return this.calcularBonus(bIndividual) + this.salarioBase;
    }
}
