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
public class A01 {
    public static void main(String[] args){
        int numMax=23;
        for(int num=1; num<numMax-4; num-=2){
            System.out.print(num + " ");
            num += 4; 
            System.out.print(num + " ");
        }
    }
}   
