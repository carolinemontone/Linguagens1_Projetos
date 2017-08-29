/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2;


/**
 *
 * @author Caroline 15.00091-5
 * Adriana 15.00792-8
 */
public class ListaDeDesejos extends Lista {
    private static int qntprod=0;
    private static final int maxi = 10;
    private static int restantes = 10;

    public static int getQntprod() {
        return ListaDeDesejos.qntprod;
    }

    public static void setQntprod(int qntprod) {
        ListaDeDesejos.qntprod = qntprod;
    }

    public static int getRestantes() {
        return ListaDeDesejos.restantes;
    }

    public static void setRestantes(int restantes) {
        ListaDeDesejos.restantes = restantes;
    }

    
    public boolean adicionarALista(Produto prod){
        boolean r;
        if (ListaDeDesejos.qntprod < ListaDeDesejos.maxi){
            this.produtos[qntprod]= prod;
            ListaDeDesejos.qntprod++;
            ListaDeDesejos.restantes --;
            r = true;
        }
        else r = false;
        return r;
    }
    public boolean removerUltimoDaLista(){
       boolean r;
       if (ListaDeDesejos.qntprod>0){
           r= true;
           ListaDeDesejos.qntprod--;
           ListaDeDesejos.restantes++;
       } else r=false;
       return r;
    }
    
    public String retornarResumo(){
        String r= "";
        for(int i=0; i<ListaDeDesejos.qntprod;i++){
            r += this.produtos[ListaDeDesejos.qntprod-1].exibirResumo();
        }
        return r;
    }
    
    public void limparLista(){
       ListaDeDesejos.qntprod = 0;
       ListaDeDesejos.restantes = ListaDeDesejos.maxi;
    }
}
