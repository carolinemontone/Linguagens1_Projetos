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
public class Pallets {
    private Produto tipo;
    private int quant;
    private double c;
    private double a;
    private double l;
    private boolean carregada;
    private int total;

    public Pallets(Produto tipo, double c, double a, double l) {
        this.tipo = tipo;
        this.c = c;
        this.a = a;
        this.l = l;
    }
    
    void setUp(Produto tipo){
        int ltotal;
        int atotal;
        int ctotal;
        
        ltotal = (int)(this.l/ tipo.cmParaMetro(tipo.getL()));
        atotal = (int) (this.a/ tipo.cmParaMetro(tipo.getA()));
        ctotal = (int) (this.c/ tipo.cmParaMetro(tipo.getC()));
        
        this.total = ltotal*atotal*ctotal;
        }
    }
    
