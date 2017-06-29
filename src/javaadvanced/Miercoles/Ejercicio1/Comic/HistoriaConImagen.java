
package javaadvanced.Miercoles.Ejercicio1.Comic;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Clase Main(Historia)
 * 2 Personajes (Heroe y Villano)
 * 2 Singleton (Poderes Resp)
 * 1 Control Imagen
 * 
 * @author Ramses
 */
public class HistoriaConImagen extends Component implements Runnable {

    BufferedImage peleaImagen;
    int width = 180, height = 300, posicion = 0, x = 110, y = 30, segundos = 4, contador = 0;

    String[] dialogo = {
        "Erase una vez",
        "En un mundo dominado por los villanos",
        "Faltó presupuesto para el escritor",
        "Lorem Ipsum",
        "Lorem Ipsum 1",
        "Lorem Ipsum 2",
        "Lorem Ipsum 3",
        "Lorem Ipsum 4",
        "Lorem Ipsum 5",
        "Lorem Ipsum 6",
        "Lorem Ipsum 7",
        "Lorem Ipsum 9",
        "Lorem Ipsum 10",
        "Lorem Ipsum 11",
        "Lorem Ipsum 12",
        "Lorem Ipsum 13",
    };
    
    public HistoriaConImagen() throws IOException {
        peleaImagen = ImageIO.read(new File("images/pelea.png"));
    }

    @Override
    public Dimension getPreferredSize() {
            return new Dimension(400, 350);
    }
    
    @Override
    public Dimension getMaximumSize(){
        return new Dimension(400, 350);
    }

    @Override
    public void paint(Graphics g) {
        int frameX = (posicion % 3) * width;
        int frameY = (posicion / 3) * height;

        g.drawImage(peleaImagen, x, y, x + width, y + height, frameX, frameY, frameX + width, frameY + height, null);
    }

    @Override
    public void run()
    {
        while (true)
        {
            try 
            {
                repaint();
                
                Thread.sleep(1000);
                
                if (segundos > 0) {
                    if (contador < dialogo.length) {
                        System.out.println(dialogo[contador]);
                        contador++;
                    }
                    
                    segundos--;
                } else {
                    segundos = 3;
                    
                    if (posicion < 5) {
                        posicion++;
                    } else {
                        posicion = 0;
                    }
                }

                repaint();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
