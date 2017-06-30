package javaadvanced.Viernes.socketstres;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramses Santos
 */
public class DSender {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String str = "Hola";
            
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            
            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            
            ds.send(dp);
            ds.close();
            
        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (UnknownHostException ex) {
            Logger.getLogger(DSender.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DSender.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
}
