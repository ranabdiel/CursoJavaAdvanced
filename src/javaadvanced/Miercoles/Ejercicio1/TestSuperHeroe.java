
package javaadvanced.Miercoles.Ejercicio1;

/**
 *
 * @author Ramses Santos
 */
public class TestSuperHeroe {
    public static void main(String[] args) {
        SuperHeroe b = new Batman();
        SuperHeroe s = new Superman();
        
        s.correr();
        s.golpear();
        s.volar();
        
        System.out.println("*****************************");
        
        b.correr();
        b.golpear();
        b.volar();
    }
}
