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
public class A03 {
        public static void main(String[] args){
            System.out.println("Escribe una secuencia");
            Scanner entradaTeclado = new Scanner(System.in);
            String secuenciaNumsAscii = entradaTeclado.nextLine();
            Scanner entradaNumsAscii = new Scanner(secuenciaNumsAscii);
            while(entradaNumsAscii.hasNextInt()){
                char convertToAscii = (char) entradaNumsAscii.nextInt();
                System.out.print(convertToAscii);
            }
        }   
}
