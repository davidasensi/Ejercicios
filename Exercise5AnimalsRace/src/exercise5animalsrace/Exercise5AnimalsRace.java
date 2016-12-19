/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise5animalsrace;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;
import static java.lang.Thread.NORM_PRIORITY;

/**
 *
 * @author Davidinho
 */
public class Exercise5AnimalsRace {

    private static int animals = 10, distance = 3000, step = 100;

    public static void main(String[] args) {
        Thread Animal = null;
        Thread[] base = new Thread[animals];
        int aux = 0, priority;
        preparingPositions(aux, base, Animal);
        startRace(aux, base);

    }

    private static void startRace(int aux, Thread[] base) {
        for (aux = 0; aux < base.length; aux++) {
            base[aux].start();
        }
    }

    private static void preparingPositions(int aux, Thread[] base, Thread Animal) {
        String name = "";
        for (aux = 0; aux < animals; aux++) {
            switch (aux) {
                case 0:
                case 1:
                case 2:
                case 3:
                    name = "tortoise" + aux;
                    break;
                case 4:
                case 5:
                case 6:
                    name = "rabbit" + aux;
                    break;
                case 7:
                case 8:
                case 9:
                    name = "cheetahs" + aux;
                    break;
            }
            Animal = new Thread(new Animal(distance, step, name));
            if (name.contains("tortoise")) {
                System.out.println("entrator");
                Animal.setPriority(MIN_PRIORITY);
            } else if (name.contains("cheetahs")) {
                System.out.println("entrache");
                Animal.setPriority(NORM_PRIORITY);
            } else {
                System.out.println("entrara");
                Animal.setPriority(MAX_PRIORITY);
            }
            base[aux] = Animal;

        }
    }

}
