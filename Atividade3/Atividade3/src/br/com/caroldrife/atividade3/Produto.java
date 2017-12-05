/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caroldrife.atividade3;

/**
 *
 * @author Aluno 18
 */
public abstract class  Produto {
    private int codigo;
    private float preco;
    private int quantidade;
    private int venda;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void updateEstoque(int codigo, int quantidade){
    
    }
    
     public void realizarVenda(int codigo, int quantidade){
         
     }
    
}
