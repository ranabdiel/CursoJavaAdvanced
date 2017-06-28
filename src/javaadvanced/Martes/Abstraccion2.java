package javaadvanced.Martes;

/**
 *
 * @author Ramses Santos
 */

abstract class Bici{
    Bici(){
        System.out.println("Bicicleta se creó");
    }
    
    abstract void Run();
     
    void changeColor(){
        System.out.println("Color cambiado");
    }
}

class Magistroni extends Bici{
    @Override
    void Run(){
        System.out.println("Soy una bicicleta");
    }
}

public class Abstraccion2 {
    void Run(){
        System.out.println("La bici esta corriendo...");
    }
    
    public static void main(String[] args) {
        Bici bici = new Magistroni();
        bici.Run();
        bici.changeColor();
    }
}
