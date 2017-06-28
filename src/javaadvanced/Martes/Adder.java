package javaadvanced.Martes;

/**
 * Firma o signatura de un metodo
 *    Es lo que permite distinguir sin ambiguedad a los metodos tanto
 *    en la declaracion como en la invocacion (Emision de mensajes)
 *    y contiene 3 elementos:
 *    1.- El valor de retorno(tipo): double
 *    2.- El nombre del metodo: pow
 *    3.- Numero, tipo y orden de los parametros: Math.Pow(x, 2);
 * 
 * En la herencia ademas de producir una clase nueva  basada en una
 * antigua añadiendo caracteristicas adicionales (especializacion), puedes
 * extender el comportamiento existente de la superclase.
 * 
 * Si un metodo se define en la subclase de modo que el nombre, el tipo
 * de retorno y su lista de parametros coinciden exactamente con algun
 * metodo de la clase ancestr (superclase), entonces ese nuevo metodo
 * decimos que REDEFINE el comportamiento del antiguo.
 * 
 * Los metodos con el mismo nombre, pero diferente lista de parametros
 * dentro de la misma clase se consideran simplemente sobrecargados.
 * Esto provoca que el compilador utilice los argumentos proporcionados 
 * en un mensaje para determinar cual metodo ha de llamar.
 * 
 * To overload - Sobrecarga
 * To override - Redefinir (Sobremontar)
 * // Override no es sobreescribir no existe overwrite
 * 
 * Override: Metodo con la misma signatura en distintas clases 
 * (de una jerarquia de herencia)
 * 
 * Overload: Metodo con el mismo nombre que la clase y distinta signatura.
 * 
 * Reglas para redefinir metodos
 *   1.- El tipo de retorno del metodo redefinido debe ser identico al del
 *       del metodo que redefine.
 *   2.- Un metodo redefinido no puede ser menos accesible que un metodo
 *       al que redefine. La superclase es publica, el redefinido 
 *       no puede ser protected.
 *   3.- Un metodo redefinido no puede lanzar excepciones diferentes 
 *       al metodo que redefine.
 * 
 * Diferencia entre sobrecarga y redefinicion
 *   1.- La sobrecarga (overload) puede codificarse en una sola clase y
 *       la  redefinicion (override) requiere 2 o mas clases.
 *   2.- Los metodos sobrecargados tienen distinta signatura.
 *   3.- Los metodos redefinidos tienen la misma signatura.
 * 
 *   
 * @author Ramses Santos
 */

// SOBRECARGA
public class Adder {
    
    // 1.- Cambiando el numero de argumentos
    static int Add(int a, int b){
        return a+b;
    }
    
    static int Add(int a, int b, int c){
        return a+b+c;
    }
    
    // 2.- Cambiando el tipo de dato
    static int Suma(int a, int b){
        return a+b;
    }
    
    static double Suma(double a, double b){
        return a+b;
    }
    
    public static void main(String[] args) {
        System.out.println("1.- Cambiando el número de argumentos:");
        System.out.println(Adder.Add(111, 222));
        System.out.println(Adder.Add(111, 222, 333));
        
        System.out.println("2.- Cambiando el tipo de dato:");
        System.out.println(Adder.Suma(111, 222));
        System.out.println(Adder.Suma(11.1, 22.2));
        
    }
    
}
