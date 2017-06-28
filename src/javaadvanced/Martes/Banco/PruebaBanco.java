package javaadvanced.Martes.Banco;

/**
 *
 * @author Ramses Santos
 */
public class PruebaBanco {
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        BanCoppel bc = new BanCoppel();
        
        System.out.println("Bancomer taza de interes: " + b.getTasaInteres());
        System.out.println("HSBC taza de interes: " + h.getTasaInteres());
        System.out.println("BanCoppel taza de interes: " + bc.getTasaInteres());
    }
}
