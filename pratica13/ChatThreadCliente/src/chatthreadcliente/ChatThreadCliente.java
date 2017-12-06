/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatthreadcliente;
import java.io.PrintStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Aluno 18
 */
public class ChatThreadCliente implements Runnable {

    static Socket cliente;
    static boolean fechou = false;

    public static void main(String[] args) {
       
        try {
            //colocar:                IP         Porta
            cliente = new Socket("localhost", 9000);
            System.out.println("To no servidor");
            
            Thread thr_entrada = new Thread(new ChatThreadCliente());
            thr_entrada.start();
                                                
            try (
                    Scanner teclado = new Scanner(System.in);
                    PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
                ) 
            {
                
                String msg = "";
                while (!fechou && !msg.equalsIgnoreCase("tchau")) {
                    msg = teclado.nextLine();
                    saidaRede.println(msg);                
                }
            }            
            cliente.close();

        } catch (IOException ex) {
            System.out.println("deu ruim");
        }
    }

    @Override
    public void run() {
        try (
            Scanner entradaRede = new Scanner(cliente.getInputStream());    
            )
        {
            String msg = "";                           
            while (!fechou && !msg.equalsIgnoreCase("tchau")) {
                msg = entradaRede.nextLine();
                System.out.println(msg);
            }
                    
        }   catch (IOException ex) {
             System.out.println("deu ruim");
        }
    } 
}
