/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superdomino;

/**
 *
 * @author Daasji
 *
 */
import java.util.Scanner;

public class superdomino {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int nfichas, x, extremoiz, extremode, contador = 0, o = -1;
        String cadena1,res,delimitador = "[ .;]+";
        
        do {
            System.out.println("Cuantas fichas vas a usar?? ");
            nfichas = teclado.nextInt();
            teclado.nextLine();
        } while (nfichas < 1 || nfichas > 10000);
                
        int fichas[][] = new int[nfichas][2];
        for (x = 0; x < fichas.length; x++) {

            do {
                
                cadena1 = teclado.nextLine();
                String[] subcadena = cadena1.split(delimitador);
                o = subcadena.length;
                if (o == 2) {
                    fichas[x][0] = Integer.parseInt(subcadena[0]);
                    fichas[x][1] = Integer.parseInt(subcadena[1]);
                }
            } while (o != 2 || fichas[x][0] < 0 || fichas[x][0] > 25000 || fichas[x][1] < 0 || fichas[x][1] > 25000);
            }
        
        x = 0;             
        extremoiz = fichas[0][0];
        extremode = fichas[0][1];
        
        contador++;
        for (x = 1; x < fichas.length; x++) {
            if (extremoiz == fichas[x][0]) {
                extremoiz = fichas[x][1];
                contador++;                
            }
            else if (extremoiz == fichas[x][1]) {
                extremoiz = fichas[x][0];
                contador++;                
            } else if (extremode == fichas[x][0]) {
                extremode = fichas[x][1];
                contador++;                
            } else if (extremode == fichas[x][1]) {
                extremode = fichas[x][0];
                contador++;                
            } else {
            }
        }//fin comprobar fichas           
        System.out.println("Se han usado: "+contador+" fichas");       
    }//fin main
}//fin clase

