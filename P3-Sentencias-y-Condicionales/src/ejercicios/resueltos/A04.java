package ejercicios.resueltos;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares, impares, suma;

		pares = 0;
		impares = 0;
		suma = 0;

		Scanner entradaTeclado = new Scanner(System.in);

		System.out.print("Introduzca un número: ");
		int num1 = entradaTeclado.nextInt();

		System.out.print("Introduzca un número: ");
		int num2 = entradaTeclado.nextInt();

		System.out.print("Introduzca un número: ");
		int num3 = entradaTeclado.nextInt();

		System.out.print("Introduzca un número: ");
		int num4 = entradaTeclado.nextInt();
		//Número 1
		if (num1 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num1;
		
		//Número 2
		if (num2 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num2;
		
		//Número 3		
		if (num3 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num3;
		
		//Número 4		
		if (num4 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num4;
		System.out.println("La suma total es "+suma+". Hay "+pares+" números pares y "+impares + " números impares");
		entradaTeclado.close();
	}

}
