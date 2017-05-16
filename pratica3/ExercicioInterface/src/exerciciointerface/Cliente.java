/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;

/**
 *
 * @author Professor
 */
public abstract class Cliente implements IAutenticavel, IExibicao{
    protected String nome;
    protected String cpf;
    protected int conta;
    protected int senha;
    
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        return false;
    }
    
    private void realizarTranferencia (){
        System.out.println("Transferência realizada!"); 
    }
    
    private void depositar(){
        System.out.println("Dinheiro depositado!");
    }
    
}
