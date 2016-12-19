/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5animalsrace;


public class Animal implements Runnable {
private int metres, step,aux=0;

    public Animal(int metres, int step, String name) {
        this.metres = metres;
        this.step = step;
        this.name = name;
       
    }
    
        
private String name;
    @Override
    public void run() {
        while(aux<metres){
            System.out.println(name+" remaining "+(metres-aux)+" to Finish");
            aux+=step;
        }
        System.out.println(name+" has Finished");
    }
    
}
