package javaadvanced.Lunes;

/**
 * La sentencia switch nos permite evaluar una declaración para
 * multiples condiciones.
 * Reemnplazando a un if else anidado nivel 6
 * 
 * @author Ramses Santos
 */
public class SwitchSample {
    /**
     * La clase switch es un ejemplo para ver el funcionamiento del switch
     * @param args 
     */
    public static void main(String[] args) {
        
        int num = 20;
        char opc = 'f';
        
        switch(num){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("No esta en 10, 20 o 30");
        }
        
        switch(opc){
            case 'a':
                System.out.println("La opcón es a");
                break;
            case 'b':
                System.out.println("La opcón es b");
                break;
            case 'c':
                System.out.println("La opcón es c");
                break;
            default:
                System.out.println("Selecciona una opción válida");
        }
    }
}
