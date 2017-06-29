package javaadvanced.Jueves;

/**
 *
 * @author Ramses Santos
 */
public class SyncT {
    public static void main(String[] args) {
        Tabla ob = new Tabla();
        Hilo1 h1= new Hilo1(ob);
        Hilo2 h2= new Hilo2(ob);
        
        h1.start();
        h2.start();
    }
}

class Tabla {
    synchronized void imprimir(int n){
        for(int i=1; i<=5; i++){
            System.out.println(n*i);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

class Hilo1 extends Thread{
    Tabla t;

    Hilo1(Tabla t){
        this.t = t;
    }

    public void run(){
        t.imprimir(100);
    }
}

class Hilo2 extends Thread{
    Tabla t;

    Hilo2(Tabla t){
        this.t = t;
    }

    public void run(){
        t.imprimir(200);
    }
}