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
public abstract interface IAutenticavel{
    public boolean autentica(int senha);
    public boolean alterarSenha(int senhaNova, int senhaAntiga);
}
