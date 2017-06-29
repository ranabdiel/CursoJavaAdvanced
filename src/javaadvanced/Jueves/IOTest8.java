package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author Ramses Santos
 */
public class IOTest8 {
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        FileInputStream fis = new FileInputStream("images/hola.txt");
        FileInputStream fis2 = new FileInputStream("images/bufferedoutput.txt");
        
        FileOutputStream fos = new FileOutputStream("images/ambosarchivos.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        
        int i = 0;
        while((i = sis.read()) != -1){
            System.out.print((char)i);
            fos.write(i);
        }
        
        sis.close();
        fis.close();
        fis2.close();
        fos.close();
    }
}
