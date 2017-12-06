/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Aluno 18
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programa1 p1 = new Programa1();
        Thread t1 = new Thread(p1);
        t1.start();
        
        Programa2 p2 = new Programa2();
        Thread t2 = new Thread(p2);
        t2.start();
               
    }
    
}
