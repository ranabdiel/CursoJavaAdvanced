package javaadvanced.Lunes;

/**
 *
 * @author Ramses Santos
 */

/*
    La sentencia if nos permite evaliar las decisiones simples
    o compuestas. Pueden ser:
    Declaración if
    Declaración if-else
    Declaración if anidada
*/

public class JavaAdvanced {

    static int edad = 10;
    
    public static void main(String args) {
       if (edad > 18){
           System.out.println("Es mayor de edad");
       }
       else
       {
           System.out.println("Es menor de edad");
       }
       
       String nombre;
       nombre = "Ramses";
       
       if(!nombre.isEmpty()){
           
       }
    }
    
    public static void main(String[] args) {
        int calif = 90;
        if(calif < 70){
            System.out.println("Recursa");
        }
        else if(calif >= 70 && calif <= 75){
            System.out.println("Panzó");
        }
        else if(calif >= 76 && calif <= 80){
            System.out.println("Regular");
        }
        else{
            System.out.println("Aprobó");
        }
    }
}
