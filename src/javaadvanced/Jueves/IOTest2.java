package javaadvanced.Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ramses Santos
 */
public class IOTest2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("images/hola.txt");
            
            for(int i = 65; i<91;i++){
                fos.write(i);
            }
            
            String s = "\nEsta es una cadena de caracteres";
            byte b[] = s.getBytes();
            
            fos.write(b);
            
            
            fos.close();
        } catch(IOException ie){
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
