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
public class Diretor extends Funcionario implements IAutenticavel{
    
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        return false;
    }

    
}
