
package javaadvanced.Jueves;

/**
 *
 * @author Ramses Santos
 */
public class ThreadD extends Thread{
    
    @Override
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Tenemos un demonio aqui.");
        }
        else{
            System.out.println("Ah no es un hilo de usuario.");
        }
    }
    
    public static void main(String[] args) {
        ThreadD t1 = new ThreadD(), t2 = new ThreadD(), t3 = new ThreadD();
        
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}
