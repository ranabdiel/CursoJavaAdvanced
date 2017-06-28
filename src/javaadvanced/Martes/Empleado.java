
package javaadvanced.Martes;

/**
 * Herencia: es un mecanismo que permite que un objeto adquiera todas 
 * las propiedades y comportamientos de un objeto padre.
 * 
 * La idea de la herencia es que puedas crear nuevas clases
 * a partir de las ya existentes.
 * Existen diversas clasificaciones de relacion en la herencia.
 * 
 * Relaciones entre clases:
 * Asociacion:
 * Composicion:
 * Agregacion:
 * Herencia:
 * 
 * Hay un termino que permite distinguir los distintos tupos de relaciones,
 * llamado ACOMPLAMIENTO.
 * 
 * Medida de la dependencia que hay entre dos modulos, existen
 * grados de acoplamiento (bajo, alto).
 * 
 * Cada clase y metodo hace una sola cosa y la hace bien (COHESION).
 * Numero de tareas que tiene cada clase o metodo.
 * 
 * Es deseable que dos o mas modulos de un programa mantengan alta cohesion 
 * (que cada metodo en cada clase haga lo que tenga que hacer)
 * y bajo acoplamiento (que este separado y que no sea dependiente).
 * 
 * Relaciones entre clases:
 * Asociacion (Es un): Cuando entre 2 o mas clases se da una interaccion que no
 *     modifica en nada el comportamiento de los objetos antes o despues de 
 *     terminada la realcion.
 *     La asociacion es un modo de interacción entre objetos donde uno utiliza
 *     los servicios de otro a corto plazo.
 *     La asociacion es una relación de objetos debilmente acoplados.
 * Agregacion (Tiene un): Es una relacion entre objetos que afecta el comportamiento
 *     entre ellos mientras que dura la relación. Es decir, un objeto depende
 *     de los servicios de otro a largo plazo.
 * Composicion (Contiene): Cuando un objeto complejo usa otros objetos permanentemente.
 *     La composicion es una relacion entre objetos cuya escencia tiene sentido
 *     solo cuando ellos estan acoplados.
 *     Por ultimo podemos decir que la composicion es un tipo de agregacion
 *     a muy largo plazo.
 * Herencia: Cuando un objeto tiene las caracteristicas de otro permanentemente,
 *     tendremos una relacion entre objetos intimamente acoplados cuya
 *     existencia depende de un ancestro irrenuncuablemente.
 * 
 * @author Ramses Santos
 */

// Realación de Asociación IS-A
public class Empleado {
    double salario = 10000;
}

class Programador extends Empleado{
    int bono = 1000;
    
    public void main() {
        Programador p = new Programador();
        System.out.println("El salario del programador es: " + p.salario);
        
        System.out.println("El bono del programador es: " + p.bono);
    }
    
    void Mensaje(){
        System.out.println("Soy un programador");
        main();
    }
}

// Herencia Multinivel
class Web extends Programador{
    public static void main(String[] args) {
        Web w = new Web();
        w.Mensaje();
    }
}