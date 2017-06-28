
package javaadvanced.Martes;

/**
 *
 * @author Ramses Santos
 */
public class MountainBike {
        
    public static void main(String[] args) 
    {
        show();
        showBici();
    }
    
    public static void show(){
        Bike b = new Bike("Azul", 6);
        
        String msg = "Tengo una bicicleta ";
        msg += b.getMarca() + " color " + b.getColor();
        msg += " de " + b.getVelocidad();
        System.out.println(msg);
    }
    
    public static void showBici(){
        Bike b = new Bike("Azul", "MERCURIO", 10);
        String msg = "Tengo una bicicleta ";
        msg += b.getMarca() + " color " + b.getColor();
        msg += " de " + b.getVelocidad();
        System.out.println(msg);
    }
}
