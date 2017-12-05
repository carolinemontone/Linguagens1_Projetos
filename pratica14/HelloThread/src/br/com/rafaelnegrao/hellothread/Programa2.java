package br.com.rafaelnegrao.hellothread;

public class Programa2 implements Runnable{
    private int id = 2;
    
    public void run(){
        for (int i = 0; i < 20; i++){
            System.out.println("Programa: " + id + " Valor: " + i);
        }
    }
}
