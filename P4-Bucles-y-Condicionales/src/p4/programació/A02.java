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
public class A02 {
    public static void main(String[] args){
        int count=10;
        int valorAnterior=0;
        int valorActual=1;
        int suma = 1;
        //1 1 2 3 5
        for(int i=0; i<count; i++){
           suma += valorAnterior;
           valorAnterior = valorActual;
           valorActual = suma;
           System.out.println(suma +" ");
        }
    }    
}
