package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Ramses Santos
 */
public class IOTest3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("images/hola.txt");
            //int i = fis.read();
            //System.out.println((char)i);
            int i = 0;
            
            while((i=fis.read()) != -1){
                System.out.print((char)i);
            }
            
        } catch(IOException ie){
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
