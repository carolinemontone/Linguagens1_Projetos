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
    public boolean autentica(int senha){
        if(this.senha != senha) {
            return false;}
        return false;
    }

}
