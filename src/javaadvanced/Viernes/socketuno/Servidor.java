package javaadvanced.Viernes.socketuno;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramses Santos
 */
public class Servidor {
    public static void main(String[] args) {
        try {
            System.out.println("Ventana Servidor");
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String)dis.readUTF();
            
            System.out.println("mensaje: " + str);
            
            s.close();
            ss.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
