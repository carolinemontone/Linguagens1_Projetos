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
public class Estoque {
    private Produto tipo;
    private int qmin;
    private int qmax;
    private int qatual;

    public Estoque(Produto tipo, int qmin, int qmax, int qatual) {
        this.tipo = tipo;
        this.qmin = qmin;
        this.qmax = qmax;
        this.qatual = qatual;
    }
    
    boolean tirar(int q){
        boolean r;
        if (this.qatual - q >= this.qmin){
            this.qatual = this.qatual - q;
            r = true;
        }
        else{
            r = false;
        }
        return r;
    }
    
    boolean colocar(int q){
        boolean r;
        if (this.qatual + q <= this.qmax){
            this.qatual = this.qatual + q;
            r = true;
        }
        else{
            r = false;
        }
        return r;
    }
}
