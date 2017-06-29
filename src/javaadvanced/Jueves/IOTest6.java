package javaadvanced.Jueves;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author Ramses Santos
 */
public class IOTest6 {
    public static void main(String[] args) throws IOException{

            FileInputStream fis = new FileInputStream("images/hola.txt");
            FileInputStream fis2 = new FileInputStream("images/bufferedoutput.txt");
            SequenceInputStream sis = new SequenceInputStream(fis, fis2);
            
            int i = 0;
            while((i = sis.read()) != -1){
                System.out.print((char)i);
            }
            sis.close();
            fis.close();
            fis2.close();
            
            FileInputStream fis3 = new FileInputStream("images/bufferedoutput.txt");
            BufferedInputStream bis = new BufferedInputStream(fis3);
            
            i = 0;
            while((i = bis.read()) != -1){
                System.out.print((char)i);
            }
            bis.close();
            fis3.close();
    }
}
