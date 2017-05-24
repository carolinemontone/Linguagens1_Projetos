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
    private double a;
    private double diametro;

    Bebidas(String tipo, double valor, double cap, double a, double d){
        super(tipo, valor);
        cap = this.capacidade;
        a = this.a;
        d = this.diametro;
    }
    
    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public double cmParaMetro(double cm) {
        return cm/100;
    }
        
    @Override
    public void calcularEspaco(){
        this.area = Math.pow(cmParaMetro(this.diametro), 2)*Math.PI*cmParaMetro(this.a);
    }
}
