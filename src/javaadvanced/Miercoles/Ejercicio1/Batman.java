package javaadvanced.Miercoles.Ejercicio1;

/**
 *
 * @author Ramses Santos
 */
public class Batman implements SuperHeroe{

    /*@Override
    public void volar() {
        System.out.println("Batman no puede volar  :..( "); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void golpear() {
        System.out.println("Batman golpea con su fuerza de humano...");
    }

    @Override
    public void correr() {
        System.out.println("Batman corre a 70 km/h...");
    }

    @Override
    public void volar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
