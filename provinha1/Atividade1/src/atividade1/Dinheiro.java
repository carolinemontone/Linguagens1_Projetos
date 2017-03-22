// Adriana Padilla 15.00792-8
//Caroline Montone 15.00091-5
package atividade1;

/**
 *
 * @author Professor
 */
public class Dinheiro {

    private double valor;
    // Considerando que 1-real 2-dolar 3-euro
    private int moeda;
    private double taxaEuroDolar;
    private double taxaRealDolar;

    public Dinheiro(double valor, int moeda, double taxaEuroDolar, double taxaRealDolar){
        this.valor = valor;
        this.moeda = moeda;
        this.taxaEuroDolar = taxaEuroDolar;
        this.taxaRealDolar = taxaRealDolar;
    }
    
    public void realParaDolar(double real, double dolar) {
        dolar = this.taxaRealDolar * real;
    }

    public void dolarParaReal(double dolar, double real) {
        real = dolar / this.taxaRealDolar;
    }

    public void euroParaDolar(double euro, double dolar) {
        dolar = this.taxaEuroDolar * euro;
    }

    public void dolarParaEuro(double dolar, double euro) {
        euro = dolar / this.taxaEuroDolar;
    }

    public void euroParaReal(double euro, double real) {
        double valor = 0;
        euroParaDolar(euro, valor);
        dolarParaReal(valor, real);
    }

    public void realParaEuro(double real, double euro) {
        double valor = 0;
        realParaDolar(real, valor);
        dolarParaEuro(valor, euro);
    }

    public double valorEmReal() {
        double valor = 0;
        if (this.moeda == 1) {
            valor = this.valor;
        }
        if (this.moeda == 2) {
            dolarParaReal(this.valor, valor);

        }
        if (this.moeda == 3) {
            euroParaReal(this.valor, valor);

        }
        return valor;
    }

    public double valorEmDolar() {
        double valor = 0;
        if (this.moeda == 1) {
            realParaDolar(this.valor, valor);

        }
        if (this.moeda == 2) {
            valor = this.valor;

        }
        if (this.moeda == 3) {
            euroParaDolar(this.valor, valor);

        }
        return valor;
    }

    public double valorEmEuro() {
        double valor = 0;
        if (this.moeda == 1) {
            realParaEuro(this.valor, valor);

        }
        if (this.moeda == 2) {
            dolarParaEuro(this.valor, valor);

        }
        if (this.moeda == 3) {
            valor = this.valor;

        }
        return valor;
    }

    double getTaxaRealDolar() {
        return this.taxaRealDolar;
    }

    double getTaxaEuroDolar() {
        return this.taxaEuroDolar;
    }
    
    int getMoeda() {
        return this.moeda;
    }
    
    void setMoeda(int moeda){
        moeda = this.moeda;
    }
    
    double getValor(){
        return this.valor;
    }
    
    void setValor(double valor){
        valor = this.valor;
    }
    
    void alterarTaxaRealDolar(double atualizada){
        this.taxaRealDolar = atualizada;
    }
    
    void alterarTaxaEuroDolar(double atualizada){
        this.taxaEuroDolar = atualizada;
    }
    
}
