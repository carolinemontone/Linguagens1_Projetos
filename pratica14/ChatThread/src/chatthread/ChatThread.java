package chatthread;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatThread {
    //
    public static void main(String[] args) {
        try {
            //colocar:                      IP         Porta
            Socket cliente = new Socket("192.168.0.167", 12345);
            System.out.println("To no servidor");
            
            Scanner entradaRede = new Scanner(cliente.getInputStream());
            Scanner teclado = new Scanner(System.in);
            PrintStream saidaRede = new PrintStream(cliente.getOutputStream());
            
            //aguarda msg inicial do servidor
            System.out.println(entradaRede.nextLine());
            
            String msg = "";
            while (!msg.equalsIgnoreCase("flw!")) {
                msg = teclado.nextLine();
                saidaRede.println(msg);
                msg = entradaRede.nextLine();
                System.out.println(msg);
            }
            
            entradaRede.close();
            teclado.close();
            saidaRede.close();
            cliente.close();

        } catch (IOException ex) {
            Logger.getLogger(ChatThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
