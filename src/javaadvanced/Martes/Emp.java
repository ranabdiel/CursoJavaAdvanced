package javaadvanced.Martes;

/**
 *
 * @author CC-03
 */

class Persona {
    int id;
    String nombre;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

public class Emp extends Persona{
    double salario;

    public Emp(int id, String nombre, double salario) {
        super(id, nombre);
        this.salario = salario;
    }
    
    void display(){
        System.out.println(id + " " + nombre + " " + salario);
    }   
}

class TestEmp{
    public static void main(String[] args) {
        Emp e = new Emp(1, "David", 1452.50);
        e.display();
    }
}
