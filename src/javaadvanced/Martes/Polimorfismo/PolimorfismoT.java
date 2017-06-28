package javaadvanced.Martes.Polimorfismo;

/**
 *
 * @author Ramses Santos
 */

class Animal{
    void eat(){
        System.out.println("Comiendo...");
    }
}

class Cachorro extends Animal{
    void eat(){
        System.out.println("Comiendo Cachorro...");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Comiendo Dog...");
    }
}

public class PolimorfismoT {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        
        Animal a2 = new Dog();
        a2.eat();
        
        Animal a3 = new Cachorro();
        a3.eat();
    }
}
