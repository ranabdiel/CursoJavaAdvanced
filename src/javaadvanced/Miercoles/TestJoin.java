
package javaadvanced.Miercoles;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ramses Santos
 */
public class TestJoin extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        TestJoin t1 = new TestJoin(), 
                 t2 = new TestJoin(),
                 t3 = new TestJoin();
        
        showDetails(t1);
        
        t2.setName("NomHilo2");
        showDetails(t2);
        
        showDetails(t3);
        
        t1.start();
        
        try{
            t1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
        t2.start();
        t3.start();
    }
    
    public static void showDetails(Thread t){
        System.out.println("***** Hilo: " + t.getId()+ " *****");
        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
        System.out.println("State: " + t.getState());
        System.out.println("*************************************\n");
    }
}
