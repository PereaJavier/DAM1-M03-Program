package ejercicios.resueltos;

import java.util.Scanner;

/**
 * 
 * Crea un programa que pida al usuario dos n�meros por teclado y devuelva cual
 * de los dos es mayor.
 * 
 */
public class A01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduzca un n�mero por teclado");
		int num1 = entradaTeclado.nextInt();
		System.out.println("Introduzca otro n�mero por teclado");
		int num2 = entradaTeclado.nextInt();
		if(num1 > num2) {
			System.out.println("El mayor n�mero es: "+num1);
		}else if(num2>num1) {
			System.out.println("El mayor n�mero es: "+num2);
		}else {
			System.out.println("Los dos n�meros introducidos son iguales");
		}
		entradaTeclado.close();
	}

}
