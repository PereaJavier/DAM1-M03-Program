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
public class A10 {

    public static void main(String[] args) {
        int num = 5;
        int vueltas = 10;
        int resultado = num;
        
        //Con bucle while
        while (vueltas != 0) {
            resultado *= num;
            vueltas--;
        }
        System.out.println("Resultado while: " + resultado);

        vueltas = 10;
        resultado = num;
        //Con bucle do while
        do {
            resultado *= num;
            vueltas--;
        } while (vueltas != 0);
        System.out.println("Resultado do-while: " + resultado);
        resultado = num;
        //Con bucle for
        for (vueltas = 10; vueltas > 0; vueltas--) {
            resultado *= num;
        }
        System.out.println("Resultado for: " + resultado);

    }
}
