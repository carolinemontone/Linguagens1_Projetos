
package javaapplication3;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    
    public Conta (String nome, String sobrenome, String cpf, int numero){
        this.titular = new Cliente(nome, sobrenome, cpf);
        this.numero = numero;
    }
    
    void visualizarSaldo() {
        System.out.println("Saldo =" + this.saldo);
    }
    
    void depositar(double valor) {
       if (valor > 0) {
           this.saldo = this.saldo + valor; 
       }
    }
    
    boolean sacar(double value){
        
        if (value >= this.saldo) {
            
            this.saldo = this.saldo - value;
            return true;
            
        } else {
            
            System.out.println("Quer um empréstimo?");
            return false;
            
        }
        
    }
    
    boolean transferirPara(Conta x, double valor){
        
        if (this.sacar(valor)) {
          x.depositar(valor);
            System.out.println("ok");
            return true;
        }
        else {
            System.out.println("n ok");
            return false;
        }
    }
    
    void exibirInfoConta(){
        this.titular.exibirInfoCliente();
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: R$ " + this.saldo);
    }
   
    void setNumero (int numero){
        this.numero = numero;
    }
    
    void setTitular (Cliente titular){
        this.titular = titular; 
    }
    
    int getNumero (){
        return this.numero;
    }
      
} 