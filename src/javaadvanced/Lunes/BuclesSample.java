package javaadvanced.Lunes;

/**
 * Un lazo, es usado para iterar una parte del programa
 * muchas veces.
 *
 * Hay 3 tipos de lazos en Java
 * Simple For,
 * For-each
 * Labeled For
 * @author Ramses Santos
 */
public class BuclesSample {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            System.out.println("Iterando el elemento " + i);
        }
        
        System.out.println("********************************");
        
        /**
         * La estructira foreach se utiliza para recorrer
         * un arreglo o una coleccion en java.
         * for(Type var: array)
         */
        
        int arreglo [] = {12,23,34,45,56,67};
        for(int a: arreglo){
            System.out.println("Iterando con foreach: " + a);
        }
        
        System.out.println("********************************");
        
        /**
         *
         */
        for(int i = 1; i<=3; i++)
        {
            for(int j=1; j<=3; j++){
                if(i==2 && j == 2){
                    break;
                }
                System.out.println( i + " - " + j);
            }
        }
    }
}
