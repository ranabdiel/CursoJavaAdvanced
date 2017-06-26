
package javaadvanced.Lunes;

/**
 *
 * @author Ramses Santos
 */
public class Ejercicio1 {
    /**
     * Serie de Fibonacci sin recursion.
     * Escribe un programa en java para verificar si un numero es primo.
     * Calcular el factorial de un numero.
     * Escribe un programa en java para ordenar los elementos de un arreglo
     *  usando el algoritmo burbuja, Selection y de Insercion
     */
    
    public static void main(String[] args) {
        Fibonacci(10);
        EsPrimo(6);
        Factorial(5);
        Burbuja();
    }
    
    private static void Fibonacci(int n)
    {
        System.out.println("******  Fibonacci  *********");
        
        int aux = 1;
        int res = 1;
        
        for(int i = 2; i <= n; i++){
            System.out.println(res);
            res = aux + res;
            aux = res - aux;
        }
        
        System.out.println("****************************");
    }
    
    private static void EsPrimo(int n){
        System.out.println("******  EsPrimo  *********");
        
        int div  = n/2;
        
        for(int i = 2; i <= div; i++)
        {
            int res = n % i;
            
            if(res == 0)
            {
                System.out.println("El número: " + n + " No es Primo " + res);
            }
            else
            {
                System.out.println("El número: " + n + " Es primo " + res);
            }
        }
        
        System.out.println("****************************");
    }
    
    private static void Factorial(int n){
        System.out.println("******  Factorial  *********");
        
        int res = 1;
        
        for(int i = 1; i < n; i++){
            res += res * i;
        }
        
        System.out.println("El Factorial es: " + res);
        
        System.out.println("****************************");
    }
    
    private static void Burbuja(){
        System.out.println("******  Burbuja  *********");
        
        int[] res = {2, 50, 62, 40, 8, 45};
        int arr = res.length;
        int temp = 0;
        
        for(int i = 0; i < arr; i++){
            //System.out.println(res[i]);
            for(int j = 1; j < (arr - i); j++ )
            {
                //System.out.println(res[j]);
                if(res[j-1] > res[j]){
                    System.out.println(res[i] + " - " + res[j]);
                    int aux = res[j-1];
                    res[j-1] = res[j];
                    res[j] = aux;
                }
            }
        }
        System.out.println("****************************");
        
        for(int i = 0; i < res.length; i++){
            System.out.println(res[i]);
        }
        
        System.out.println("****************************");
    }
}
