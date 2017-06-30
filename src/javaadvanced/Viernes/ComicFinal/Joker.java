package javaadvanced.Viernes.ComicFinal;

/**
 *
 * @author Ramses Santos
 */
public class Joker implements Personaje{

    static int contador = 1;
    
    @Override
    public void volar() {
        System.out.println("Joker no puede volar  :..( ");
    }

    @Override
    public void golpear() {
        System.out.println(contador + " - Joker golpea con su fuerza de humano...");
        contador++;
    }

    @Override
    public void correr() {
        System.out.println("Joker corre a 80 km/h...");
    }    

    @Override
    public int tiempoRespuesta() {
        return 600;
    }
}
