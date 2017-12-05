/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatthread;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno 18
 */
public class ChatThread implements Runnable{
    static Socket cliente;
    static boolean fechou = false;

    
    
    //CÓDIGO DO SERVIDOR
    public static void main(String[] args) {
        
        ServerSocket servidor;
   
        try {
            servidor = new ServerSocket(9000);
            cliente = servidor.accept();
            
            Thread thr_entrada = new Thread(new ChatThread());
            thr_entrada.start();
            
            try(
            Scanner teclado = new Scanner(System.in);
            PrintStream saidaRede = new PrintStream(cliente.getOutputStream());)
                
            {
            String msg = "";
            while (!msg.equalsIgnoreCase("tchau") && !fechou) {
                msg = teclado.nextLine();
                saidaRede.println(msg);
                
            }
            System.out.println("Servidor fechou");
            cliente.close();
            fechou = true;

            }
        } catch (IOException ex){
           System.out.println("Top");
        }
    }

    @Override
    public void run() {
        try(
        Scanner entradaRede = new Scanner(cliente.getInputStream());)
        { String msg = "";
        
        while(!fechou && !msg.equalsIgnoreCase("tchau")){
            msg = entradaRede.nextLine();
            System.out.println("Cliente:"+msg);
        }
        System.out.println("Cliente encerrou o chat");
        fechou = true;
        }catch (IOException ex){
            System.out.println("Deu ruim");
        }
    }
    
}
