/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;

/**
 *
 * * @author Caroline 15.00091-5
 * Adriana 15.00792-8
 */
public abstract class Lista {
    protected Produto[] produtos;
    protected static int qntprod=0;
    protected static int restantes;
    protected static int max;
    
    public int getQntprod() {
        return qntprod;
    }

    public void setQntprod(int qntprod) {
        Lista.qntprod = qntprod;
    }

    public int getRestantes() {
        return restantes;
    }

    public void setRestantes(int restantes) {
        Lista.restantes = restantes;
    }

    public int getMax() {
        return Lista.max;
    }
    
    public boolean adicionarALista(Produto prod){
        boolean r;
        if (Lista.qntprod < Lista.max){
            Lista.qntprod++;
            this.produtos[produtos.length+1]= prod;
            Lista.restantes --;
            r = false;
        }
        else r = true;
        return r;
    }
    public boolean removerUltimoDaLista(){
       boolean r;
       if (Lista.qntprod>0){
           r= true;
           Lista.qntprod--;
       } else r=false;
       return r;
    }
    
    public String retornarResumo(){
        String r= "";
        for(int i=0; i<Lista.qntprod;i++){
            r += this.produtos[Lista.qntprod-1].exibirResumo();
        }
        return r;
    }
    
    public void limparLista(){
       Lista.qntprod = 0;
       Lista.qntprod = Lista.max;
    }
    
}
