/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author David
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0, total = 0, confirmacion = -99, contador = 0;
        String letra1 = "", letra2 = "";
        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\David\\Documents\\NetBeansProjects\\Palindromo\\src\\palindromo\\fichero.txt"));
            String frase = br.readLine();
            while (frase != null) {
                x = 0;
                char[] letras = new char[frase.length()];
                while (x < frase.length()) {
                    letras[x] = frase.charAt(x);
                    x++;
                }
                total = letras.length;
                for (x = 0; x != letras.length / 2; x++) {

                    letra1 = letra1.valueOf(letras[x]);
                    letra2 = letra2.valueOf(letras[total - 1]);
                    if (letra1.equalsIgnoreCase(letra2)) {
                        confirmacion = 5;

                    } else {
                        confirmacion = -99;
                        letra1 = "";
                        letra2 = "";
                    }
                    total--;

                }//fin for
                letra1 = "";
                letra2 = "";
                contador++;
                if (confirmacion == 5) {
                    System.out.println("Si existe palindrome en la " + contador + " frase");
                } else {
                    System.out.println("No existe palindrome en la " + contador + " frase");
                }
                confirmacion = -99;
                frase = br.readLine();

            }//fin todas las frases
        } catch (IOException e) {
            System.out.println("Error E/S: " + e);
        }
    }

}
