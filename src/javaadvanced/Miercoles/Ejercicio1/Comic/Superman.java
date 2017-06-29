
package javaadvanced.Miercoles.Ejercicio1.Comic;

/**
 *
 * @author Ramses Santos
 */
public class Superman implements SuperHeroe{

    @Override
    public void volar() {
        System.out.println("Superman puede volar por el espacio...");
    }

    @Override
    public void golpear() {
        System.out.println("Superman Golpea Fuerte...");
    }

    @Override
    public void correr() {
        System.out.println("Superman corre a la velocidad de la luz...");
    }

    @Override
    public int tiempoRespuesta() {
        return 100;
    }
}
