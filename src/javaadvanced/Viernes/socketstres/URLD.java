package javaadvanced.Viernes.socketstres;

import java.net.URL;

/**
 *
 * @author Ramses Santos
 */
public class URLD {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://codigofacilito.com");
            
            System.out.println("Protocolo: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
