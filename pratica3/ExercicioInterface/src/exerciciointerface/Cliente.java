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
public abstract class Cliente implements IAutenticavel{
    String nome;
    String cpf;
    int conta;
    int senha;
    
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        return false;
    }
}
