/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

/**
 *
 * @author CC-03
 */
public class PruebaEstudiante{
    
    // Caso 5 this
    int dato = 5;

    PruebaEstudiante() {
        Student s5 = new Student(this);
        s5.s();
    }
    
    
    public static void main(String[] args) {
        Student s1 = new Student(111, "Ramses", "TEC");
        Student s2 = new Student(113, "Abdiel", "UAS");
        Student s3 = new Student(113, "Santos", "UDEO");
        
        /*
        s1.display();
        s2.display();
        s3.display();
        */
        s1.mensaje();
        s2.mensaje();
        s3.mensaje();
        
        // Caso 4
        PruebaEstudiante pe = new PruebaEstudiante();
        pe.despliega();
        
        // Caso 5
        PruebaEstudiante ps2 = new PruebaEstudiante();
        
        // Caso 6
        new Student().getStudent().msg();
    }
    
    void muestra(PruebaEstudiante obj){
        System.out.println("Metodo es invocado");
    }
    
    // Caso 4
    void despliega(){
        muestra(this);
    }
}
