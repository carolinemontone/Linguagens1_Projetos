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
public abstract class Produto {
    protected double valor;
    protected double c;
    protected double a;
    protected double l;

    public Produto(double valor, double c, double a, double l) {
        this.valor = valor;
        this.c = c;
        this.a = a;
        this.l = l;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double cmParaMetro(double cm) {
        return cm/100;
    }
            
}
