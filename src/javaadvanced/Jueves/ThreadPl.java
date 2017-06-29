
package javaadvanced.Jueves;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Ramses Santos
 */
public class ThreadPl implements Runnable{

    private String msg;
    
    public ThreadPl(String s){
        msg = s;
    }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " (Start) msg = "
                + msg);
        
        System.out.println(Thread.currentThread().getName()
                + " (End)");
    }
    
    private void processMsg(){
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for(int i=0; i<10;i++){
            Runnable worker = new ThreadPl(" " + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated()){}
        System.out.println("Todos los hilos se han terminado");
    }
}
