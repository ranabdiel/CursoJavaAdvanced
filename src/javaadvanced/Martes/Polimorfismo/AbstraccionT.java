package javaadvanced.Martes.Polimorfismo;

/**
 * Abstraccion: Accion de separar mentalmente la representacion de las 
 * caracteristicas escenciales de un objeto, sin incluir antecedentes o
 * detalles irrelevantes.
 * Es el proceso natural en los seres humanos de poseer la facultad
 * intuitiva de conocer la escencia de las cosas.
 * 
 * Existen 5 tipos de abstraccion.
 *      Funcional, Paramétrico, de Datos, Contextual y Generica
 * 
 * Funcional: Sirve para modelar la interacción lógica, es decir como
 * se darán las instrucciones de planteamiento, entrada, procesamiento, salidas
 * y navegabilidad en el algoritmo.
 * 
 * Datos: Permite delimitar los atributos y sus metodos que deben servir para
 * modelar una clase de objetos tomando en cuenta sus alcances, sus tipos
 * de datos, sus parametros y sus valores de retorno.
 * 
 * Contextual: Proceso mental que comienza con el analisis de un fenomeno,
 * amalgamando las abtracciones de datos y funcional para integrar una solucion
 * automatizada, que utilice de cierto, los acervos de conocimientos previos
 * y tome en cuenta las restricciones y los riesgos.
 * 
 * Paramétrica: Cuando se diseñan los metodos y las operaciones de las 
 * abtracciones de datos, funcionales y contextuales, puede haber redundancias
 * que es posible evitar si se parametrizan apropiadamente y con esto se ahorra
 * codigo y se tiene una mayor legibilidad, flexibilidad y mantenibilidad 
 * en los desarrollos de software.
 * 
 * Genérica: Es un tipo especial de abstraccion parametrica que se usa en las
 * clases genericas pero en ligar de parametrizar variables se parametrizan
 * tipos de datos su objetivo es la reutilizacion de algoritmos. 
 * 
 * EN JAVA
 * Una clase declarada con la palabra reservada Abstrac se considera abtracta
 * de nombre.
 * Puede ser abstracta con metodos no abstractos.
 * 
 * La abstraccion es un proceso para ocultar los detalles de implementacion
 * y mostrar solo la funcionalidad al usuario.
 * 
 * Ej.
 * Enviar un SMS solo escribe el texto y lo envia, No conocemos el proceso
 * interno sobre la entrega de mensajes.
 * 
 * La abtraccion permite concentrarse en LO QUE HACE el objeto en lugar
 * de COMO LO HACE.
 * 
 * Formas de lograr la abtraccion:
 *    1.- Clase Abstracta (0 a 100, no se garantiza que sea abtracta)
 *    2.- Interface (100% abtracta)
 * 
 * Una clase declarada abtracta necesita ser extendida (extends) e 
 * implementar sus metodos. No se puede instanciar.
 * 
 * abstract class A{}
 * 
 * Un metodo que es declarado como abtracto no tiene implementaciones
 * (COMO LO HACE)
 * 
 * abstract void print();
 * 
 * 
 * 
 * @author Ramses Santos
 */


abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Dibujando un circulo...");
    }    
}

public class AbstraccionT extends Circle{
    public static void main(String[] args) {
        Shape s = new AbstraccionT();
        Circle c = new AbstraccionT();
        s.draw();
        c.draw();
    }

    @Override
    void draw() {
        System.out.println("Dibujando...");
    }
}
