
package javaadvanced.Miercoles;

/**
 * Hilo: Subproceso ligero, unidad pequeña de procesamiento. Es una via
 * de ejecucion separada.
 * Los hilos son independientes, si se produce una excepcion en un hilo
 * no afecta a los demas hilos y comparten un area
 * 
 * Ventajas de usar hilos:
 *    1.- No bloqueamos al usuario por que son tareas al mismo tiempo.
 *    2.- Podemos realizar muchas tareas simultaneamente ahorrando tiempo.
 *    3.- Los hilos al ser independientes no se afectan entre si, en caso
 *        de ocurrir, una excepcion en un hilo los demas funcionan igual.
 * 
 * Multitarea: Proceso de ejecucion de muchas tareas simultaneamente.
 * Usamos la multitarea en el CPU. Se logra de dos maneras:
 *    1.- Multitarea basada en Procesos (Multiprocesos).
 *        * Cada proceso tiene su propia direccion en memoria, es decir,
 *          cada proceso asigna un area de memoria separada.
 *        * El proceso es pesado.
 *        * El costo de la comunicacion entre el proceso es alto.
 *        * Cambiar de un proceso a otro requiere de tiempo para guardar 
 *          y cargar registros, mapas de memoria, listas de actualizacion
 *    2.- Multitarea basada en Hilos (Multihilo)
 *        * Los hilos comparten los mismos espacios en memoria para direcciones.
 *        * El hilo es ligero
 *        * El costo de comunicacion entre hilos es bajo.
 * 
 * (Paralelismo) Multihilos
 * (Concurrencia) Es la propiedad de los sistemas para soportar 
 *   multiples peticiones, auxiliandose de Multiprocesamiento y Multihilo
 *   logrando la multitarea
 * 
 * Ciclo de vida de un hilo
 *    Un hilo puede encontrarse en uno de sus 5 estados.
 *    De acuerdo con oracle solo hay 4 en el ciclo de ejecutables (Running) 
 *    no existe.
 *    new, runnable, non-runnable and terminated.
 * 
 *    1.- New: El hilo esta en este estado, si se crea una instancia de la
 *        la clase Thread pero antes de la invocacion de start().
 *    2.- Runnable: El hilo esta aqui, despues de la invocacion del metodo
 *       start(), pero el ThreadScheduler (Administrador de hilos) no lo ha
 *       seleccionado como el hilo en ejecucion.
 *    3.- Running: El hilo esta aqui cuando el TS lo ha seleccionado.
 *    4.- Non-Runnable: (Blocked) es el estado cuando el hilo suigue actuvo,
 *        sin embargo no es apyo para ejecutarse.
 *    5.- Terminated: Es el estado cuando el hilo ha finalizado, muerto,
 *        cuando sale del metodo run().
 * 
 * Hay 2 formas de crear un hilo:
 *    1.- Al extender de la clase Thread.
 *    2.- Al implementar la interface Runnable.
 * 
 * Clase Thread
 *    Proporciona los constriuctores y metodos para crear y realizar
 *    operaciones en un hilo. La clase Thread extiende de la clase Object 
 *    e implementa la interface Runnable
 * 
 * Constructores comunes de la clase Thread
 * Thread()
 * Thread(String name)
 * Thread(Runnable r)
 * Thread(Runnable r, String name)
 * 
 * Runnable
 *    La interface Runnable debe ser implementada por cualquier clase
 *    cuyas instancias esten destinadas a ser ejecutadas por un hilo.
 *    La interface Runnable tiene un solo metodo denominado run()
 *    public void run(): Es usado para realizar la accion de un hilo.
 * 
 * 
 * 
 * public void run()
 * {
 *     
 * }
 * 
 * public void start(){
 *   // Inicia la ehecucion del hilo
 *   La VM
 * }
 * 
 * public void sleep
 * {
 *      // Hace que el hilo actual en ejecucion se detenga temporalmente 
 *      // durante el numero especificado en milisegunsdos
 * }
 * 
 * public void join()
 * {
 *      // Espera a que el hilo se muera
 * }
 * 
 * public getpriority()
 * {
 *      // Refresa la prioridad del hilo
 * }
 * 
 * public int setPriority()
 * {
 *      // cambia la prioridad del hilo
 * }
 * 
 * public String getName(){
 *     // Regresa el nombre del hilo
 * }
 * 
 * public Thread currentThread(){
 *     // Devuelkve la referencia al hilo en ehjecucion actuakl
 * }
 * 
 * public int getId()
 * {
 *     // Decuelve el ID del hilo
 * }
 * 
 * public Thread.State getState()
 * {
 *    // Obtiene el estado actual del hilo.
 * }
 * 
 * public boolean isAlive()
 * {
 *    // Prueba si el hilo esta vivo.
 * }
 * 
 * public void yield()
 * {
 *    // Hace que el objetro del hilo actualmente en ejecucion, se detenga
 *    // temporalmente y permita que otros hilos se ejecuten
 * }
 * 
 * public void suspend()
 * {
 *      // DEPRECADO
 *      // Para suspender el hilo
 * }
 * 
 * public void stop()
 * {
 *      // DEPRECADO
 *      // Se utiliza para detener el hilo.
 * }
 * 
 * public boolean isDaemon()
 * {
 *      // Verifica si el hilo es un demonio
 * }
 * 
 * public void setDaemon()
 * {
 *      // Marca el hilo como un demonio
 * }
 * 
 * public void interrupt()
 * {
 *      // Interrumpe el hilo
 * }
 * 
 * public boolean interrumpted()
 * {
 *      // Verifica si el hilo se puede interrumpir
 * }
 * 
 * public static boolean interrupted()
 * {
 *      // Prueba si el hilo actual se ha interrumpido
 * }
 * 
 * @author Ramses Santos
 */
public class HiloF extends Thread {
    @Override
    public void run(){
        for(int i = 1; i<10; i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
    
    public static void main(String[] args) {
        HiloF h = new HiloF();
        //Thread t = new Thread(h);
        //t.start();
        
        Hilo2 h2 = new Hilo2();
        Thread t2 = new Thread(h2);
        t2.start();
    }
}

// Ejemplo de Runnable
class Hilo2 implements Runnable{

    @Override
    public void run() {
        for(int i = 10; i<1; i--){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}