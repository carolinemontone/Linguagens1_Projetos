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
public class Secretario extends Funcionario {

    public Secretario(String nome, String cpf, int registro, double salario) {
        super(nome, cpf, registro, salario);
    }
    
    public boolean atenderTelefone(boolean ocupado){
        return !ocupado;
        
    }
}

