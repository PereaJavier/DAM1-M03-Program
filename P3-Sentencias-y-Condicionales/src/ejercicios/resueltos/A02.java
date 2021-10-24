package ejercicios.resueltos;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		/*
		 * Se inicializa a 0 valorMayor porque el programa siempre se meter� en una de
		 * las condiciones que cambiar� el valor mayor, de esta manera podemos imprimir
		 * su valor fuera de los ifs
		 */
		int valorMayor = 0;
		System.out.print("Introduzca el primer n�mero: ");
		int num1 = entradaTeclado.nextInt();
		System.out.print("\nIntroduzca el segundo n�mero: ");
		int num2 = entradaTeclado.nextInt();
		System.out.print("\nIntroduzca el tercer n�mero: ");
		int num3 = entradaTeclado.nextInt();

		if (num1 >= num2 && num1 >= num3) {
			// Caso 1: Num1 es mayor o igual que num2 y num3
			valorMayor = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			// Caso 2: Num2 es el mayor o igual que num2 y num3
			valorMayor = num2;
		} else if (num3 >= num1 && num3 >= num2) {
			// Caso 3: Num3 es el mayor o igual que num2 y num3
			valorMayor = num3;
		}
		System.out.println("El n�mero mayor es: " + valorMayor);
		entradaTeclado.close();

	}

}
