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
public abstract class Graos extends Produto{
    private double peso;

    public Graos(double peso, double valor, double c, double a, double l) {
        super(valor, c, a, l);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
