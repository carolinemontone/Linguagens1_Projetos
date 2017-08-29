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
    private static int max = 4;
    protected static int restantes = 10;
    
    public Pedido criarPedido(Cliente cli){
        return new Pedido( cli, carrinho);
    }
    
}
