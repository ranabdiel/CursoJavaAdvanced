
package javaadvanced.Viernes.ComicFinal;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    String[] dialogo = new String[16];
    
    private void leerHistoria()
    {
        try {
            String line = "";
            FileInputStream fis;
        
            fis = new FileInputStream("images/historia.txt");
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);
            int i = 0;
            
            while ((line = br.readLine()) != null) {
                dialogo[i] = line;
                i++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public HistoriaConImagen() throws IOException {
        peleaImagen = ImageIO.read(new File("images/pelea.png"));
        leerHistoria();
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
