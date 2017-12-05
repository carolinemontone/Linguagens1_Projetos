package br.com.rafaelnegrao.hellothread;

public class HelloThread{
    
    public static void main(String[] args) {
        Programa1 p1 = new Programa1();
        Thread t1 = new Thread(p1);
        
        Programa2 p2 = new Programa2();
        Thread t2 = new Thread(p2);
        
        t1.start();
        t2.start();    
    }
    
}
