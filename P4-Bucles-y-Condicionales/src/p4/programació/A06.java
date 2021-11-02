/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.programació;

/**
 *
 * @author Javier
 */
public class A06 {

    public static void main(String[] args) {
        int numAleatorio = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        while (numAleatorio != 10) {
            numAleatorio = (int) (Math.random() * 10 + 3);
            System.out.println("Número aleatorio generado: " + numAleatorio);
            if (numAleatorio % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        System.out.println("Pares: " + contadorPares + " Impares: " + contadorImpares);

    }

}
