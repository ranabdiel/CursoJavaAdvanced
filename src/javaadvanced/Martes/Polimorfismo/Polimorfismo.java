package javaadvanced.Martes.Polimorfismo;

/**
 * Polimorfismo
 * Existen 3 formas de polimorfismo
 * 1.- Primitivo: Se implementa gracias a la sobrecarga de metodos.
 * 2.- Real: Se implementa gracias a la redefinicion de metodos.
 * 3.- Generico: Se implementa gracias a las clases genericas.
 * 
 * Una variable es polimorfica cuando puede referirse a objetos de clases 
 * diferentes y en consecuencia puede adorpar distintos comportamientos.
 * 
 * El polimorfismo permite desplegar comportamientos distintos en las subclases
 * de una jerarquia de herencia cuando ellas activan metodos con la misma firma
 * o signatura.
 * 
 * Ej.
 *    Empleado e = new Admninistrador();
 * Para manipular al empleado como si fuera administrador es necesario
 * modelar el tipo de la subclase.
 * 
 * El hecho de que una variable apuntadora a un objeto (Tal como l variable "e")
 * pueda refverirse automaticamente a tipos multiples se llama polimorfismo.
 * 
 * La JVM automaticamente selecciona el metodo apropiado a tiempo de
 * ejecucion, lo que se denomina "LIGADURA DINAMICA". En conclusion todas
 * las variables tipo superclase concretas son polimorficas.
 * 
 * @author Ramses Santos
 */

class  Bike{
    void Run()
    {
        System.out.println("Running...");
    }
}
public class Polimorfismo extends Bike{
    void Run(){
        System.out.println("Running safetly with 60km");
    }
    
    public static void main(String[] args) {
        Bike b = new Polimorfismo();
        /* Upcasting -> Cuando la variable de referencia refiere
        al objeto de la clase hija.
        class A(){}
        class B() extends A {}
        A a = new B();
        */
        b.Run();
    }
}
