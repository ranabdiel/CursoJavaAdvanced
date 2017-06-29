
package javaadvanced.Miercoles.Ejercicio1.Comic;

/**
 *
 * @author Ramses Santos
 */
public class TestComic {
    public static void main(String[] args) {
        Historia h = new Historia();
        Thread t = new Thread(h);
        t.start();
    }
}
