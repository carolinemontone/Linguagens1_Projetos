/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciointerface;
import java.util.Scanner;

/**
 *
 * @author Professor
 */
public class Gerente extends Funcionario implements IAutenticavel{
    private int senha;

    public Gerente(String nome, String cpf, int registro, double salario, int senha) {
        super(nome, cpf, registro, salario);
        this.senha = senha;
    }
    
    @Override
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        return false;
    }
    
    @Override
    public boolean alterarSenha(int senhaNova, int senhaAntiga){
        boolean retorno =false;
        if (senhaAntiga==this.senha){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;
    }

}
