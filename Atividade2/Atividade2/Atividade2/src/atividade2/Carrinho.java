/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

import static atividade2.Atividade2.carrinho;


/**
 *
  * @author Caroline 15.00091-5
 * Adriana 15.00792-8
 */
public class Carrinho extends Lista implements ICompravel{
    private static int qntprod = 0;
    private static final int maxi = 4;
    private static int restantes = 4;

    public static int getQntprod() {
        return Carrinho.qntprod;
    }

    public static void setQntprod(int qntprod) {
        Carrinho.qntprod = qntprod;
    }

    public static int getRestantes() {
        return Carrinho.restantes;
    }

    public static void setRestantes(int restantes) {
        Carrinho.restantes = restantes;
    }
    
    @Override
    public Pedido criarPedido(Cliente cli){
        return new Pedido(cli, carrinho);
    }
    
    public boolean adicionarALista(Produto prod){
        boolean r;
        if (Carrinho.qntprod < Carrinho.maxi){
            this.produtos[qntprod] = prod;
            
            Carrinho.qntprod++;
            Carrinho.restantes --;
            
            r = true;
        }
        else r = false;
        return r;
    }
    public boolean removerUltimoDaLista(){
       boolean r;
       if (Carrinho.qntprod>0){
           r= true;
           Carrinho.qntprod--;
       } else r=false;
       return r;
    }
    
    public String retornarResumo(){
        String r= "";
        for(int i=0; i<Carrinho.qntprod;i++){
            r += this.produtos[Carrinho.qntprod-1].exibirResumo();
        }
        return r;
    }
    
    public void limparLista(){
       Carrinho.qntprod = 0;
       Carrinho.restantes = Carrinho.maxi;
    }


    
}
