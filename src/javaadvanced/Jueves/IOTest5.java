package javaadvanced.Jueves;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ramses Santos
 */
public class IOTest5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("images/bufferedoutput.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            
            String s = "Hola \n a todos.";
            
            byte[] b = s.getBytes();
            
            bos.write(b);
            bos.flush();
            bos.close();
            
            fos.close();
            
        } catch(IOException ie){
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
