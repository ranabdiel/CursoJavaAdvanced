
package javaadvanced.Martes;

/**
 *
 * @author Ramses Santos
 */

class Vehiculo{
    void Run(){
        System.out.println("El vehiculo esta corriendo");
    }
}

public class Bicicleta extends Vehiculo{
    
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.Run();    
    }
    
    @Override
    void Run(){
        
        System.out.println("La bicicleta esta corriendo");
    }
}
