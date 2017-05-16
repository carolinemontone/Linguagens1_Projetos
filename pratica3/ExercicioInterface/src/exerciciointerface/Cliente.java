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
    private String nome;
    private String cpf;
    private int conta;
    private int senha;
    
    public Cliente(String nome, String cpf, int conta, int senha){
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
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
        if (autentica(senhaNova)){
            this.senha = senhaNova;
            retorno = true;
        }
        return retorno;
    }
    
    private void realizarTranferencia (){
        System.out.println("Transferência realizada!"); 
    }
    
    private void depositar(){
        System.out.println("Dinheiro depositado!");
    }
    
    @Override
    public void exibirResumo(){
        System.out.println("Resumo aqui");
    }
    
    @Override 
    public void imprimirResumo(){
        this.exibirResumo();
        System.out.println("Imprimindo...");
        
    }
    
}
