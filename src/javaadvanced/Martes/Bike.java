
package javaadvanced.Martes;

/**
 * Constructor de una clase
 *   Es un conjunto de instrucciones diseñado para inicializar una instancia
 *   de una clase. En su declaración o encabezado puede aceptar parametros.
 * 
 * Antes de su ejecucion, b es null, al final de la llamada "b" es un apuntador
 * a un objeto (referencia) con espacio reservado en RAM para contener sus
 * valores de atributos y sus apuntadores a metodos.
 * 
 * ¿Porque el contructor no es un metodo?
 * No puedo llamar al contructor usando el operador de indireccion.
 * 
 * Carece de un valor de retorno distinto a un apuntador.
 * 
 * No puede ser REDEFINIDO ()
 * No puede ser declarado con un type
 * 
 * @author Ramses Santos
 */
public class Bike {
    // Propiedades del objeto
    private int velocidad;
    private String color;
    private String marca;
   
    // Declaro el Contructor implicito
    public Bike(){
        this.velocidad = 0;
        this.color = "S/C";
        this.marca = "S/M";
    }
    /**
     * Inmutable cuando su valor no cambia durante la ejecucion del programa.
     * 
     * @param color
     * @param velocidad 
     */
    public Bike(String color, int velocidad)
    {
        this.color = color;
        this.velocidad = velocidad;
        this.marca = "S/M";
    }
    
    public Bike(String color, String marca, int velocidad)
    {
        this.color = color;
        this.velocidad = velocidad;
        this.marca = marca;
    }
    
    public Bike(String color)
    {
        this.color = color;
        this.velocidad = 0;
        this.marca = "S/M";
    }

    /**
     * Regresa la velocidad de la bicicleta.
     * @return int velocidad
     */
    public int getVelocidad() { return velocidad; }
    
    /**
     * Regresa el color de la bicicleta
     * @return String color
     */
    public String getColor() { return color; }
    
    /**
     * Regresa la marca de la bicicleta.
     * @return String marca
     */
    public String getMarca() { return marca; }
}
