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
public class A09 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int codAscii;
        int contadorMinus=0;
        do{
            System.out.print("Introduzca un número: ");
            codAscii = entradaTeclado.nextInt();
             if (codAscii >= 97 && codAscii <= 122) {
                contadorMinus++;
                System.out.println("Letra: "+(char) codAscii);
            }
        }while(!(codAscii >= 65 && codAscii <= 90) );
        System.out.println("Se han introducido "+contadorMinus+" letras minúsculas");
    }    
}
