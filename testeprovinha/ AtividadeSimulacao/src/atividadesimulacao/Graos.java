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
public class Graos extends Produto{
    private double peso;
    private double c;
    private double a;
    private double l;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
    
    @Override
    public double cmParaMetro(double cm) {
        return cm/100;
    }
    
    @Override
    public void calcularEspaco(){
        this.area = cmParaMetro(this.a)*cmParaMetro(this.c)*cmParaMetro(this.l);
    }
}
