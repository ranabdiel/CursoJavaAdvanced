**PLANIFICACIÓN DE THREADS**
----------
---
Un hilo demonio en Java es un hilo proveedor de servicios que proporciona servicios al hilo de usuario.

Su vida depende de los demas hilos, es decir si todos los demas hilos se mueren la JVM lo temina automaticamente.

Hay muchos hilos demonios en java que se ejecutan automáticamente. Garbage Collector, finalizer, etc.

JConsole en el simbolo del sistema, proporciona la informacion sobre las clases cargadas, uso de memoria, ejecucion de hilos etc.

**Puntos importantes**

Un hilo en Java proporciona servicios a los hilos para brindar soporte a tareas en segundo plano.

Su vida depende de los hilos de usuario.
Es un hilo de baja prioridad.

Java.lang.Thread provee dos metodos para el demonio:

1. public setDaemon(boolean status) es usado para marcar el hilo actual, como un hilo demonio.
2. public boolean isDaemon() revisa si el hilo actual es un demonio.

``` JAVA
package javaadvanced.Jueves;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import static java.lang.Thread.NORM_PRIORITY;

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
```
---

**UNIDAD #3 – INTRODUCCIÓN A NETWORKING INTRODUCCIÓN A NETWORKING**

----------






