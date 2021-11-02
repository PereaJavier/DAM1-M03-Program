/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.programació;

import java.lang.Math;

/**
 *
 * @author Javier
 */
public class A05 {

    public static void main(String[] args) {

        int numAleatorio;
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            numAleatorio = (int) (Math.random() * 10 + 1);
            System.out.println("Número aleatorio:" + numAleatorio);
            suma += Math.random() * 10 + 1;
        }
        System.out.println("La suma es: " + suma);
    }
}
