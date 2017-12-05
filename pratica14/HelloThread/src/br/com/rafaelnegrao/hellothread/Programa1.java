package br.com.rafaelnegrao.hellothread;

public class Programa1 implements Runnable{
    private int id = 1;
    
    public void run(){
        for (int i = 0; i < 20; i++){
            System.out.println("Programa: " + id + " Valor: " + i);
        }
    }
}
