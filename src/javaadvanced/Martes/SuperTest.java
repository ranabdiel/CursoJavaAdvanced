
package javaadvanced.Martes;

/**
 * Super es una palabra reservada en java cmo una vatiable referencia
 * lacual es usada para servir de intermediario entre la clase padre y la
 * subclase.
 * 
 * Usos de super
 * 1.- Se puede utilizar para referir la variable de instancia de la clase
 *     padre inmediata.
 * 2.- Se puede utilizar para invocar el método de la clase padre inmediato.
 * 3.- Se puede utilizar para invocar al constructor de la clase 
 *     padre inmediata.
 * 
 * @author Ramses Santos
 */

class Animal{
    // Caso 1
    String color = "Blanco";
    
    // Caso 3
    Animal(){
        System.out.println("Se ha creado el animal...");
    }
    // Caso 2
    void eat(){
        System.out.println("Comiendo...");
    }
}

class Perro extends Animal {
    // Caso 3
    Perro(){
        super();
        System.out.println("Se ha creado el perro...");
    }
    // Caso 2 
    @Override
    void eat(){
        System.out.println("Comiendo croquetas...");
    }
    
    void dormir(){
        System.out.println("El perro se durmio");
    }
    
    void llamar(){
        super.eat();
        dormir();
    }
    
    // Caso 1
    String color = "cafe";
    void printColor(){
        // Imprime el color de la clase perro.
        System.out.println(color);
        // Imprime el color de la clase animal
        System.out.println(super.color);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        new Perro().llamar();
        new Perro().printColor();
    }
}
