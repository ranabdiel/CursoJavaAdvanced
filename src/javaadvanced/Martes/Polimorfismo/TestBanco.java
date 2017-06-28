package javaadvanced.Martes.Polimorfismo;

/**
 *
 * @author Ramses Santos
 */
public class TestBanco {
    public static void main(String[] args) {
        Banco b;
        
        b = new Bancomer();
        System.out.println("La tasa de interes de "
                + "Bancomer es: " + b.getTasaDeInteres());
        
        b = new HSBC();
        System.out.println("La tasa de interes de "
                + "HSBC es: " + b.getTasaDeInteres());
        
        b = new BanCoppel();
        System.out.println("La tasa de interes de "
                + "BanCoppel es: " + b.getTasaDeInteres());
    }
}
