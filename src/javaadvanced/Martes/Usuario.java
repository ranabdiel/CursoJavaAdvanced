
package javaadvanced.Martes;

/**
 *
 * @author Ramses Santos
 */
// Relacion entre clases: Agregacion HAS-A
public class Usuario {
    int id;
    String nombre;
    Direccion direccion;

    public Usuario(int id, String nombre, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    void show(){
        System.out.println(id + " " + nombre);
        System.out.println(direccion.ciudad + " - " + direccion.estado + " - " + direccion.pais );
    }
    
    public static void main(String[] args) {
        Direccion d = new Direccion("culiacan", "sinaloa", "mexico");
        Direccion d2 = new Direccion("leon", "guanajuato", "mexico");
        
        Usuario u = new Usuario(111, "Adrian", d);
        Usuario u2 = new Usuario(112, "Jose", d2);
        
        u.show();
        u2.show();
    }
}

class Direccion
{
    String ciudad, estado, pais;

    public Direccion() {
    }

    public Direccion(String ciudad, String estado, String pais) {
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }
}
