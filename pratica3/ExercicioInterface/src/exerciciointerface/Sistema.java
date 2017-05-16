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
public class Sistema {
   
    public boolean login(IAutenticavel a){
        boolean r = false;
        while (r = false){
            Scanner input = new Scanner(System.in);
            System.out.println("Digite sua senha:");
            int senha = input.nextInt();
            r = a.autentica(senha);
            if (r = false){
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
     return true;   
    }
    
}
