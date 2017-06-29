/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles;

/**
 *
 * @author Ramses Santos
 */
public class TestS extends Thread{
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
        TestS s = new TestS();
        s.start();
    }
}
