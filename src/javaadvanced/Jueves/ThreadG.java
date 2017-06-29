
package javaadvanced.Jueves;

/**
 *
 * @author Ramses Santos
 */
public class ThreadG implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
    public static void main(String[] args) {
        ThreadG runnable = new ThreadG();
        ThreadGroup tg = new ThreadGroup("Grupo de hilos");
        
        Thread t1 = new Thread(tg, runnable, "uno");
        t1.start();
        Thread t2 = new Thread(tg, runnable, "dos");
        t2.start();
        Thread t3 = new Thread(tg, runnable, "tres");
        t3.start();
        
        System.out.println("Thread Group: " + tg.getName());
        tg.list();
    }
}
