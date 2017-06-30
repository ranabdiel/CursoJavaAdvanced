package javaadvanced.Viernes.ComicFinal;

/**
 *
 * @author Ramses Santos
 */
public class Batman implements Personaje{

    static int contador = 1;
    
    @Override
    public void volar() {
        System.out.println("Batman no puede volar  :..( ");
    }

    @Override
    public void golpear() {
        System.out.println(contador + " - Batman golpea con su fuerza de humano...");
        contador++;
    }

    @Override
    public void correr() {
        System.out.println("Batman corre a 70 km/h...");
    }

    @Override
    public int tiempoRespuesta() {
        return 500;
    }
}
