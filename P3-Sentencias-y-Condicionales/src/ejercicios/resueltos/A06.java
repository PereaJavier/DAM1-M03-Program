package ejercicios.resueltos;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Introduzca un n�mero: ");
		int num1 = entradaTeclado.nextInt();
		System.out.print("Introduzca un n�mero: ");
		int num2 = entradaTeclado.nextInt();
		System.out.print("Introduzca un n�mero: ");
		int num3 = entradaTeclado.nextInt();
		System.out.print("Introduzca un n�mero: ");
		int num4 = entradaTeclado.nextInt();
		System.out.print("Introduzca un n�mero: ");
		int num5 = entradaTeclado.nextInt();
		
		int suma = 0;
		
		if(num1 % 3 == 0) {
			suma+=num1;
		}
		if(num2 % 3 == 0) {
			suma+=num2;
		}
		if(num3 % 3 == 0) {
			suma+=num3;
		}
		if(num4 % 3 == 0) {
			suma+=num4;
		}
		if(num5 % 3 == 0) {
			suma+=num5;
		}
		
		System.out.println("La suma de los n�meros pares es: " +suma );
		entradaTeclado.close();
	}

}
