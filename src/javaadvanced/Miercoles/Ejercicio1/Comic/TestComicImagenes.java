
package javaadvanced.Miercoles.Ejercicio1.Comic;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author Ramses Santos
 */
public class TestComicImagenes {
    
    BufferedImage img;
    
    public static void main(String[] args) throws IOException {
        JFrame f = new JFrame(" *** Comic Batman vs Joker *** ");
        HistoriaConImagen hi = new HistoriaConImagen();
        
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(hi);
        f.pack();
        f.setVisible(true);
        
        Thread hilo = new Thread(hi);
        hilo.start();
    }
}
