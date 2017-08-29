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

    public Eletronicos(boolean seguro, double valor, double c, double a, double l) {
        super(valor, c, a, l);
        this.seguro = seguro;
    }
    
    public boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

}
