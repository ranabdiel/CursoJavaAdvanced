
package javaadvanced.Lunes.Poo;

/**
 * Clase: Conjunto de objetos con caracteristicas similares
 * que se identifican por el nombre, atributos y una serie de
 * funciones o metodos aplicables a todo el conjunto.
 * Es una plantilla para caracterizar o definir objetos.
 *
 * Abtracción: Es la facultad intuitiva que permite conocer
 * la escencia de las cosas.
 *
 * Modularidad: Es un proceso mental que permite distinguir
 * los componentes de los objetos que estan siendo estudiados.
 *
 * Encapsulamiento: Permite ocultar las caracteristicas no relevantes
 * de una clase, destacar las relevantes y modelar su comportamiento.
 * Dando como resultado la Abstraccion de Datos.
 * (Clases genericas y abtractas)
 *
 * Herencia: Relación entre clases cuya existencia depende de un
 * ancestro, la clase BASE (PADRE) delega sus atributos y métodos
 * a las clases derivadas.
 *
 * Polimorfismo: Es el conjunto de operaciones aplicada a un objeto
 * por medio de los mensajes que invoca a alguno de los métodos
 * definidos en la clase a la que pertenece el objeto de acuerdo
 * al dominio de la aplicacion (Contexto)
 *
 * Objeto: Es una entidad real o imaginaria que tiene identidad,
 * estado y un comportamiento, conforme al conjunto de objetos
 * (clase) a la que pertenece. Es una instancia de una clase.
 *
 * Un objeto mujer es una instancia de una mujer con clase.
 * Mujer mujer = new Mujer();
 *
 *
 *
 * Una clase en java
 *
 * campos
 * metodos
 * constructores
 * bloques
 * clases anidadas e intefaces
 *
 * class <class_name> {
 *      field;
 *      method;
 * }
 *
 * Variables de instancia
 * Mujer mujes = new Mujer();
 * 
 * @author Ramses Santos
 */
public class Bike 
{
    public static void main(String[] args) {
        show();
    }
    
    public static void show(){
        MountainBike bici = new MountainBike();
        bici.setColor("Azul");
        bici.setVelocidad(6);
        
        String msg = "Soy una bici de montaña ";
        msg += " y mi color es: " + bici.getColor();
        msg += " y tengo: " + bici.getVelocidad();
        msg += " velocidades";
        
        System.out.println(msg);
    }
}