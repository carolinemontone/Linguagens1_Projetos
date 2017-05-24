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
public class Eletronicos extends Produto{
    private boolean seguro;
    private double c;
    private double e;
    private double l;

    public Eletronicos(String tipo, double valor) {
        super(tipo, valor);
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public void calcularEspaco(){
        this.area = cmParaMetro(this.c)*cmParaMetro(this.e)*cmParaMetro(this.l);
    }
}
