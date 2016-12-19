/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4horsesracinginterrupted;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vesprada
 */
public class Horse implements Runnable {
    private int metres, distance, step, timeWait;
    private String name;
    
    
    public Horse( int metres, String name, int step, int timeWait) {
        this.name=name;
        this.metres = metres;
        this.step = step;
        this.timeWait = timeWait;
    }
    @Override
    public void run() {
        
        for(distance=0;distance<metres;distance+=step){
            System.out.println("Horse"+name+" remaining "+(metres-distance)+" to Finish");
            try {
                sleep(timeWait);
            } catch (InterruptedException ex) {
                Logger.getLogger(Horse.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Horse"+name+" Finished");
        
    }
    
}
