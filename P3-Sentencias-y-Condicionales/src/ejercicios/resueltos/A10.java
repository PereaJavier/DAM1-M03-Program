package ejercicios.resueltos;

import java.util.Scanner;

public class A10 {
	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int positivos, media, negativos, sumaNeg;
		positivos = 0;
		media = 0;
		negativos = 0;
		sumaNeg = 0;
		System.out.print("Introduce el primer número: ");
		int num1 = entradaTeclado.nextInt();
		if (num1 >= 0) {
			positivos++;
			media += num1;
		} else {
			negativos++;
			sumaNeg += num1;
		}
		System.out.print("Introduce el segundo número: ");
		int num2 = entradaTeclado.nextInt();
		if (num2 >= 0) {
			positivos++;
			media += num2;
		}else {
			negativos++;
			sumaNeg += num2;
		}
		System.out.print("Introduce el tercer número: ");
		int num3 = entradaTeclado.nextInt();
		if (num3 >= 0) {
			positivos++;
			media += num3;
		}else {
			negativos++;
			sumaNeg += num3;
		}
		System.out.print("Introduce el cuarto número: ");
		int num4 = entradaTeclado.nextInt();
		if (num4 >= 0) {
			positivos++;
			media += num4;
		}else {
			negativos++;
			sumaNeg += num4;
		}
		System.out.print("Introduce el quinto número: ");
		int num5 = entradaTeclado.nextInt();
		if (num5 >= 0) {
			positivos++;
			media += num5;
		}else {
			negativos++;
			sumaNeg += num5;
		}
		// Calculamos la media aritmética de los positivos
		if (positivos > 0)
			media /= positivos;
		System.out.println("Hay " + positivos + " números positivos con media: " + media + " y hay " + negativos
				+ " negativos con suma: " + sumaNeg);
		entradaTeclado.close();
	}
}
