/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4horsesracinginterrupted;

/**
 *
 * @author vesprada
 */
public class Exercise4HorsesRacingInterrupted {

    private static final int metres = 5000, horses = 10, step = 100, timeWait = 200;

    public static void main(String[] args) {
        Thread Horse = null;
        Thread[] base = new Thread[horses];
        int aux = 0;
        preparingPositions(aux, Horse, base);
        Thread judge = new Thread(new judge(base));
        startRace(aux, base);
        judge.start();
    }

    private static void startRace(int aux, Thread[] base) {
        for (aux = 0; aux < base.length; aux++) {
            base[aux].start();
        }
    }

    private static void preparingPositions(int aux, Thread Horse, Thread[] base) {
        for (aux = 0; aux < horses; aux++) {
            Horse = new Thread(new Horse(metres, String.valueOf(aux), step, timeWait));
            base[aux] = Horse;

        }

    }

}
