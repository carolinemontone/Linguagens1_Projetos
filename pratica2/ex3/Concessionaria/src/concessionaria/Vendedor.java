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
    
    double CalcularBonus(double dIndividual){
        return (this.vendas*this.taxaComissao + dIndividual);
    }
    
    
}
