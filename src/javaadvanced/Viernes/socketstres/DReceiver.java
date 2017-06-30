package javaadvanced.Viernes.socketstres;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramses Santos
 */
public class DReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] b = new byte[1024]; // 1Kb
            DatagramPacket dp = new DatagramPacket(b, 1024);
            
            ds.receive(dp);
            String str = new String(dp.getData(),0,dp.getLength());
            System.out.println(str);
            ds.close();
        } catch (SocketException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
