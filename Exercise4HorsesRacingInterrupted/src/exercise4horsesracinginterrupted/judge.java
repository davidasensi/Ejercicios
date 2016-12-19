/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4horsesracinginterrupted;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vesprada
 */
public class judge implements Runnable {

    int number;

    public judge(Thread[] horses) {
        this.horses = horses;
    }
    Thread []horses;

    @Override
    public void run() {
        List<Integer> list = new ArrayList<Integer>();
        int number, count = 0;
        boolean dif = true;
        do {
            try {
                
                sleep((int)Math.random() *1000+400);
            } catch (InterruptedException ex) {
                Logger.getLogger(judge.class.getName()).log(Level.SEVERE, null, ex);
            }
            do {
                number = (int) (Math.random() * 10 + 0);
                if (list.contains(number)) {
                    dif = false;
                } else {
                    list.add(number);
                    dif = true;
                    horses[number].interrupted();
                    horses[number].stop();
                    System.out.println("The Horse "+number+" has been disqualified");
                }
                

            } while (!dif);
            count++;

        } while (count < 5);
    }

}
