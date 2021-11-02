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
public class A08 {

    public static void main(String[] args) {
        int numAleatorio1 = (int) (Math.random() * 99 + 1);
        int numAleatorio2 = (int) (Math.random() * 99 + 1);
        int numAleatorio3 = (int) (Math.random() * 99 + 1);
        int contadorAciertos = 0;
        Scanner entradaTeclado = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca el número: ");
            int numEntrada = entradaTeclado.nextInt();
            if (numEntrada == numAleatorio1) {
                contadorAciertos++;
            } else if (numEntrada == numAleatorio2) {
                contadorAciertos++;
            } else if (numEntrada == numAleatorio3) {
                contadorAciertos++;
            }
        }

        System.out.println("Los números aleatorios son: " + numAleatorio1 + " " + numAleatorio2 + " " + numAleatorio3);
        System.out.println("Has acertado: " + contadorAciertos);

    }
}
