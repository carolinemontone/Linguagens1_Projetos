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
public class Pedido {
    private Cliente cliente;
    private Carrinho carrinho;

    public Pedido(Cliente cliente, Carrinho carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
    }
    
    public String resumoPedido(){
        String r = carrinho.retornarResumo();
        r += cliente.exibirResumo();
        return r;
    }
}
