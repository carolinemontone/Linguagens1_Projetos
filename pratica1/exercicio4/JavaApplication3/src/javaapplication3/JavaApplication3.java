/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.saldo = 1000;
        c1.visualizarSaldo();
        
        c1.depositar(200);
        c1.visualizarSaldo();
        
        
     //   Conta c2 = new Conta();
     //   c2.saldo = 1000;
     //   c2.visualizarSaldo();
     
    }
    
}
