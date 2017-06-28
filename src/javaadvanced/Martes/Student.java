
package javaadvanced.Martes;

/**
 * This.-  Es una variable de autoreferencia.
 * Tiene 6 usos en Java
 * 1.- Se usa para referir a la variable de instancia de la clase actual.
 * 2.- Se usa para invocar el metodo de una clase actual.
 * 3.- This() para invocar el contructor de una clase (actual).
 * 4.- This puede ser pasado como argumento en la llamada a un metodo.
 * 5.- This se puede pasar como argumento en la llamada al constructor.
 * 6.- This se puede utilizar para devolver la intancia de la clase actual 
 * del metodo.
 * 
 * @author Ramses Santos
 */
public class Student {
    int matricula;
    String nombre, universidad;
    
    // Caso 6
    public Student(){
        
    }
    
    Student getStudent(){
        return this;
    }
    
    void msg(){
        System.out.println("Soy un mensaje");
    }
    
    // Caso 5 del this.
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj){
        this.obj = obj;
    }
    
    void s(){
        System.out.println(obj.dato);
    }
    
    // Caso 3
    public Student(int matricula, String nombre, String universidad){
        this.matricula = matricula;
        this.nombre = nombre;
        this.universidad = universidad;
    }
    
    void display(){
        String msg = " La matricula es: " + matricula;
        msg += "\n El nombre es: " + nombre;
        msg += "\n La universidad es: " + universidad;
        
        System.out.println(msg);
        System.out.println("");
    }
    
    // Caso 2
    void mensaje(){
        System.out.println("Soy un mensajito");
        this.display();
    }
}
