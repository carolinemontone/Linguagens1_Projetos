/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadesimulacao;

/**
 *
 * @author Professor
 */
public class Bebidas extends Produto{
    private double capacidade;

    public Bebidas(double capacidade, double valor, double c, double a, double l) {
        super(valor, c, a, l);
        this.capacidade = capacidade;
    }
 
    
    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }
        
}
