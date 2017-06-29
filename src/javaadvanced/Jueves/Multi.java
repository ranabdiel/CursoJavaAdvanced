package javaadvanced.Jueves;

/**
 *
 * @author Ramses Santos
 */
public class Multi {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            public void run(){
                System.out.println("Tarea unooo");
            }
        };
        
        Thread t2 = new Thread(){
            public void run(){
                System.out.println("Tarea doos");
            }
        };
        
        t1.start();
        t2.start();
    }
}
