/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.programació;

import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class A04 {

    public static void main(String[] args) {
        System.out.println("Escribe una secuencia");
        Scanner entradaTeclado = new Scanner(System.in);
        String secuenciaNumsAscii = entradaTeclado.nextLine();
        Scanner entradaNumsAscii = new Scanner(secuenciaNumsAscii);
        int contadorCaracteres = 0;
        int numAscii, contadorMinus, contadorNums, contadorMayus, contadorSimbols;
        contadorMinus = 0;
        contadorNums = 0;
        contadorMayus = 0;
        contadorSimbols = 0;
        while (entradaNumsAscii.hasNextInt() && contadorCaracteres < 4) {
            numAscii = entradaNumsAscii.nextInt();
            if (numAscii >= 97 && numAscii <= 122) {
                contadorMinus++;
            } else if (numAscii >= 65 && numAscii <= 90) {
                contadorMayus++;
            } else if (numAscii >= 48 && numAscii <= 57) {
                contadorNums++;
            } else if (numAscii >= 0 && numAscii <= 255) {
                contadorSimbols++;
            } else {
                System.out.println("El código ASCII: " + numAscii + " no es válido");
            }
            contadorCaracteres++;
        }
        System.out.println("Números: " + contadorNums + ", Mayúsculas: " + contadorMayus + ", Minúsculas: " + contadorMinus + ", Símbolos: " + contadorSimbols);
    }
}
