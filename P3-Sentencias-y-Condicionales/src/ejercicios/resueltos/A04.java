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

		System.out.print("Introduzca un n�mero: ");
		int num1 = entradaTeclado.nextInt();

		System.out.print("Introduzca un n�mero: ");
		int num2 = entradaTeclado.nextInt();

		System.out.print("Introduzca un n�mero: ");
		int num3 = entradaTeclado.nextInt();

		System.out.print("Introduzca un n�mero: ");
		int num4 = entradaTeclado.nextInt();
		//N�mero 1
		if (num1 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num1;
		
		//N�mero 2
		if (num2 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num2;
		
		//N�mero 3		
		if (num3 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num3;
		
		//N�mero 4		
		if (num4 % 2 == 0) {
			pares++;
		} else {
			impares++;
		}
		suma+=num4;
		System.out.println("La suma total es "+suma+". Hay "+pares+" n�meros pares y "+impares + " n�meros impares");
		entradaTeclado.close();
	}

}
