package javaadvanced.Viernes.socketstres;

import java.net.InetAddress;

/**
 *
 * @author Ramses Santos
 */
public class InetD {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            
            System.out.println("Nombre del host: " + ip.getHostName());
            System.out.println("Direccion IP: " + ip.getHostAddress());
            
        } catch (Exception e) {
        }
    }
}
