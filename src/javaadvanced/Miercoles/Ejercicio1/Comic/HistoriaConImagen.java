/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.Ejercicio1.Comic;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ramses
 */
public class HistoriaConImagen extends Component implements Runnable {

    BufferedImage peleaImagen;
    int width = 180, height = 300, posicion = 0, x = 20, y = 30, segundos = 3;

    public HistoriaConImagen() throws IOException {
        peleaImagen = ImageIO.read(new File("images/pelea.png"));
    }

    @Override
    public Dimension getPreferredSize() {
            return new Dimension(250, 350);
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
