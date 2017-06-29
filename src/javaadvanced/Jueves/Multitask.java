
package javaadvanced.Jueves;

/**
 * Entendiendo el problema. Muchos hilos muchas tareas
 * @author Ramses Santos
 */
public class Multitask extends Thread{
    public void run(){
        System.out.println("Tarea uno");
    }
    
    public static void main(String[] args) {
        Multitask t1 = new Multitask(), 
                t2 = new Multitask(), 
                t3 = new Multitask();
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class M implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarea Uno");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new M()),
               t2 = new Thread(new M()),
               t3 = new Thread(new M());
        
        t1.start();
        t2.start();
        t3.start();
    }
}

class TrueMT extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea B");
    }
}

class TrueM extends Thread{
    @Override
    public void run() {
        System.out.println("Tarea A");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new M()),
               t2 = new Thread(new M());
        
        TrueM t1m = new TrueM();
        TrueMT t2m = new TrueMT();
        
        t1m.start();
        t2m.start();
        
        t1.start();
        t2.start();
    }
}