
package javaadvanced.Lunes.Poo;

/**
 * Se me callo un arete mientras preparaba mi cafe 
 * en la taza con cafe y esta no se mojo.
 * ¿Porque?
 * 
 * 
 * Algoritmo
 * Preparar el cafe
 * 
 * @author Ramses Santos
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        Arete arete= new Arete();
        arete.setColor("Azul");
        arete.setDiseno("FB");
        
        TazaCafe tazaCafe = new TazaCafe();
        tazaCafe.setTipo("Americano");
        tazaCafe.setTamano("Venti");
        tazaCafe.setCucharadaCafe(3);
        tazaCafe.setCucharadaAzucar(2);
        tazaCafe.setCantidadAgua(355);
        
        Problema problema = new Problema();
        problema.Resolver(arete, tazaCafe);
    }
}

class Problema
{
    public void Resolver(Arete arete, TazaCafe taza){
        String msg = "Preparando una taza de cafe " + taza.getTamano();
        msg += " de tipo " + taza.getTipo();
        msg += " con " + taza.getCucharadaAzucar() + " cucharadas de azucar";
        System.out.println(msg);
        
        if(taza.getCantidadAgua() > 0){
            System.out.println("El arete se mojó, porque la "
                    + "taza contenia agua");
        }
        else{
            System.out.println("El arete no se mojó, porque "
                    + "la taza no contenia agua");
        }
    }
}

class Arete{
    private String Color;
    private String Diseno;

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDiseno() {
        return Diseno;
    }

    public void setDiseno(String Diseno) {
        this.Diseno = Diseno;
    }
}

class TazaCafe{
    private int cucharadaCafe;
    private int cucharadaAzucar;
    private String tipo;
    private int cantidadAgua;
    private String tamano;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String Tamano) {
        this.tamano = Tamano;
    }

    public int getCucharadaCafe() {
        return cucharadaCafe;
    }

    public void setCucharadaCafe(int cucharadaCafe) {
        this.cucharadaCafe = cucharadaCafe;
    }

    public int getCucharadaAzucar() {
        return cucharadaAzucar;
    }

    public void setCucharadaAzucar(int cucharadaAzucar) {
        this.cucharadaAzucar = cucharadaAzucar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * La cantidad de agua es en ml
     * @return 
     */
    public int getCantidadAgua() {
        return cantidadAgua;
    }

    /**
     * La cantidad de agua es en ml
     * @param cantidadAgua 
     */
    public void setCantidadAgua(int cantidadAgua) {
        this.cantidadAgua = cantidadAgua;
    }
}