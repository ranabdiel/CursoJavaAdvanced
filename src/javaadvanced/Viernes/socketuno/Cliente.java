package javaadvanced.Viernes.socketuno;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramses Santos
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            System.out.println("Ventana Cliente");
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hola Servidor");
            dos.flush();
            dos.close();
            s.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
