
package javaadvanced.Miercoles.Ejercicio1.Comic;

/**
 *
 * @author Ramses Santos
 */
public class Historia implements Runnable{
    
    String[] dialogo = {
        "Erase una vez",
        "En un mundo dominado por los villanos",
        "Faltó presupuesto para el escritor",
        "Lorem Ipsum",
        "Lorem Ipsum 1",
        "Lorem Ipsum 2",
        "Lorem Ipsum 3",
        "Lorem Ipsum 4",
        "Lorem Ipsum 5",
        "Lorem Ipsum 6",
        "Lorem Ipsum 7",
        "Lorem Ipsum 9",
        "Lorem Ipsum 10",
        "Lorem Ipsum 11",
        "Lorem Ipsum 12",
        "Lorem Ipsum 13",
    };
    
    Personaje p1;
    Personaje p2;
    
    public Historia(){
        p1 = new Batman();
        p2 = new Joker();
    }

    @Override
    public void run() {
        ContarHistoria();
    }
    
    public void ContarHistoria(){
        try {
            int contador = 0;
            
            for(String d : dialogo){
                
                /*if(contador == 4){
                    Pelear(p1);
                    Thread.sleep(800);
                    Pelear(p2);
                }*/
                
                Thread.sleep(1000);
                System.out.println(d);
                
                Thread.sleep(1000);
                p1.correr();
                
                Thread.sleep(1000);
                p1.golpear();
                
                Thread.sleep(1000);
                p2.golpear();
                
                contador++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    
    public void Pelear(Personaje pe){
        Pelea p = new Pelea(pe);
        Thread t = new Thread(p);
        t.start();
    }
}
