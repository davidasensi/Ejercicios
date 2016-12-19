
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daasji
 */
public class programaElectoral {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int partidos, escanios, x, varaux = 1, y, max = 0, partido = -1, c1 = -99, c2 = -99;
        do {
            System.out.println("Cuantos partidos politicos vamos a utilizar");
            partidos = teclado.nextInt();
        } while (partidos < 0);
        do {
            System.out.println("Cuantos escaños vamos a repartir");
            escanios = teclado.nextInt();
        } while (escanios < 0);
        int tabla[][] = new int[partidos][escanios];
        int escaños[] = new int[escanios];
        for (x = 0; x < tabla.length; x++) {
            System.out.println("cantidad total de votos del " + varaux + " partido");
            tabla[x][0] = teclado.nextInt();
            varaux++;
        }//FIN INTRODUCIR VOTOS TOTALES EN LA PRIMERA COLUMNA
        //RELLENAR TABLA CON EL TOTAL DE VOTOS
        varaux = 1;
        for (x = 0; x < tabla.length; x++) {
            for (y = 0; y < escanios; y++) {           
                tabla[x][y] = tabla[x][0] / varaux;
                varaux++;
            }
            varaux = 1;
        }
       
            //COMPROBAR QUIEN GANA ESCAÑOS
        for (varaux = 0; varaux < escaños.length; varaux++) {
            for (x = 0; x < tabla.length; x++) {
                for (y = 0; y < escanios; y++) {
                    if (tabla[x][y] > max) {
                        max = tabla[x][y];
                        partido = x + 1;
                        c1 = x;
                        c2 = y;
                    }
                }//FIN TOTAL PARTIDO                
            }//FIN TODA LA TABLA                      
            escaños[varaux] = partido;
            tabla[c1][c2] = -1;
            max = 0;
        }
         varaux=1;
        for (x = 0; x < escaños.length; x++) {
            System.out.println("El "+varaux+" escaño es para el partido: "+escaños[x]);
            varaux++;
        }
    }//fin main
}//fin class