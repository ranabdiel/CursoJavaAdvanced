
package javaadvanced.Martes;

/**
 * La palabra reservada static es usada para la administracion de memoria
 * principalmente.
 * Es aplicada a variables, metodos, bloques y clases anidadas.
 * La palabra static pertenece a las clases que la instancia.
 * 
 * Para variables: Se puede utilizar para referir una propiedad comun en
 * todos los objetos.
 * La variable estatica obtiene memoria solo una vez en el area de la clase
 * en el momento que se crea.
 * 
 * Promueve la eficiencia en el rendimiento del programa.
 * 
 * 
 * @author CC-03
 */
public class Estudiante {
    
    int matricula;
    String nombre;
    static String universidad = "TEC";
    
    public Estudiante(){
        
    }
    
    public Estudiante(int m, String n){
        matricula = m;
        nombre = n;
    }
    
    void show(){
        System.out.println(matricula + " " + nombre + " " + universidad);
    }
    
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111, "Fer");
        Estudiante s2 = new Estudiante(112, "Emmanuel");
        
        s1.show();
        s2.show();
    }
}
