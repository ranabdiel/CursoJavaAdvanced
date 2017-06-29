package javaadvanced.Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ramses Santos
 */
public class IOTest {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("images/hola.txt");
            fos.write(65);
            fos.write(66);
            fos.write(67);
            fos.write(68);
            fos.write(69);
            fos.close();
        } catch(IOException ie){
            System.out.println(ie);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
