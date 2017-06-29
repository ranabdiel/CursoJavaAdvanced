
package javaadvanced.Miercoles.Ejercicio1.Comic;

/**
 *
 * @author Ramses Santos
 */
public class Pelea implements Runnable{
    
    Personaje p;
    
    public Pelea(Personaje p){
        this.p = p;
    }

    @Override
    public void run() {
        for(int i = 0; i<15;i++){
            try {
                Thread.sleep(p.tiempoRespuesta());
                p.golpear();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
