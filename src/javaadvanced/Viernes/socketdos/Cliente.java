package javaadvanced.Viernes.socketdos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Ramses Santos
 */
public class Cliente {
    public static void main(String[] args) {
        try {
            System.out.println("Ventana Cliente");
            Socket s = new Socket("localhost", 6666);
            
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = "", str2 = "";
            
            while(!str.equals("stop")){
                str = br.readLine();
                
                dos.writeUTF(str);
                dos.flush();
                str2 = dis.readUTF();
                System.out.println("El servidor dice: " + str2);
            }
            
            dos.close();
            dis.close();
            s.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
