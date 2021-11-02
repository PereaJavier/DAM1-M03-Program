/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4.programació;

import java.util.Scanner;
import mist.P4;

/**
 *
 * @author Javier
 */
public class AE1 {

    public static void main(String[] args) {
        //Leemos el enigma con Scanner y transformamos a chars
        String codSecreto = "72 111 108 97 33 32 69 115 116 97 105 115 32 97 32 112 117 110 116 111 32 100 101 32 114 101 \n"
                + "115 111 108 118 101 114 32 117 110 32 101 110 105 103 109 97 46 32 68 101 98 101 105 115 32 104 \n"
                + "97 99 101 114 32 101 115 116 111 32 115 105 110 32 97 121 117 100 97 32 100 101 108 32 114 101 \n"
                + "115 116 111 32 100 101 32 99 111 109 112 97 110 121 101 114 111 115 46 32 76 108 97 109 97 100 \n"
                + "32 97 32 80 52 46 97 102 80 48 40 41 32 100 101 108 32 106 97 114 32 113 117 101 32 104 97 98 \n"
                + "101 105 115 32 99 111 110 102 105 103 117 114 97 100 111 46 ";
        Scanner entrada = new Scanner(codSecreto);
        //Desciframos el códgio
        while (entrada.hasNext()) {
            System.out.print((char) entrada.nextInt());
        }
        System.out.println("\n");
        System.out.println(P4.afP0());
        //Secuencia de fibonacci
        System.out.println(P4.Fibonacci());

        entrada = new Scanner(P4.Fibonacci());
        while (entrada.hasNextInt()) {
            System.out.print((char) entrada.nextInt());
        }
        //Si buscamos una x roja, vemos que en el pdf encontramos delete af19
        //Llamemos a af19 y traduzcámoslo, a ver que pasa...
        entrada = new Scanner(P4.af19());
        System.out.println("\n");
        int codAscii = 0;
        while (entrada.hasNextInt()) {
            codAscii = entrada.nextInt();
        }
        System.out.println("Actividad " + codAscii);
        //Si nos fijamos, en la actividad 3 tenemos bzaf11 -> af11... veamos que hay tras ella
        entrada = new Scanner(P4.af11());
        System.out.println("\n");
        //Nos dice que usemos la af6 y tenemos que contar, es decir el número de letras minúsculas, mayúsculas, símbolos etc.
        int contadorMinus, contadorNums, contadorMayus, contadorSimbols;
        contadorMinus = 0;
        contadorNums = 0;
        contadorMayus = 0;
        contadorSimbols = 0;

        while (entrada.hasNextInt()) {

            codAscii = entrada.nextInt();
            System.out.print((char) codAscii);
            if (codAscii >= 97 && codAscii <= 122) {
                contadorMinus++;
            } else if (codAscii >= 65 && codAscii <= 90) {
                contadorMayus++;
            } else if (codAscii >= 48 && codAscii <= 57) {
                contadorNums++;
            } else if (codAscii >= 0 && codAscii <= 255) {
                contadorSimbols++;
            } else {
                System.out.println("El código ASCII: " + codAscii + " no es válido");
            }
        }
        System.out.println("Números: " + contadorNums + ", Mayúsculas: " + contadorMayus + ", Minúsculas: " + contadorMinus + ", Símbolos: " + contadorSimbols);
        int contador = contadorNums + contadorMayus + contadorMinus + contadorSimbols;
        System.out.println((char) contadorNums + "" + (char) contadorMayus + "" + (char) contadorMinus + "" + (char) contadorSimbols);
        System.out.println(contador);
        //Si nos fijamos en la salida del anterior print, nos señala directamente a la P4.

        System.out.println(P4.af6(3, 3, 3, 4));

        //En la P3 encontramos un código secreto al lado de Grup. af15
        //En la af15 se nos pide que emparejemos los números de 2 en 2 y que luego 
        //intercambiemos sus valores por su correspondiente en ASCII
        entrada = new Scanner(P4.af15());
        String nuevoCodigo = "";
        String frase = "";
        while (entrada.hasNextInt()) {

            codAscii = entrada.nextInt();
            if (codAscii >= 48 && codAscii <= 57) {
                nuevoCodigo += (char) codAscii;
                if (nuevoCodigo.length() == 2) {
                    frase += nuevoCodigo + " ";
                    nuevoCodigo = "";

                }
            }
            System.out.print((char) codAscii + " ");
        }
        System.out.println("\n" + frase);
        //Ahora probamos la solución
        entrada = new Scanner(frase);
        frase = "";
        while (entrada.hasNextInt()) {
            frase += (char) entrada.nextInt();
        }
        System.out.println(frase);
        System.out.println(P4.afSol(frase));

    }
}
