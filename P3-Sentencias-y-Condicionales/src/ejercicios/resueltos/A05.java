package ejercicios.resueltos;

import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Introduzca un número: ");
		int num1 = entradaTeclado.nextInt();
		System.out.print("Introduzca un número: ");
		int num2 = entradaTeclado.nextInt();
		System.out.print("Introduzca un número: ");
		int num3 = entradaTeclado.nextInt();
		int primerNum, segundoNum, tercerNum;
		primerNum = 0;
		segundoNum = 0;
		tercerNum = 0;
		// Primer Número
		if (num3 >= num2 && num3 >= num1) {
			primerNum = num3;
		} else if (num2 >= num1 && num2 >= num3) {
			primerNum = num2;
		} else if (num1 >= num3 && num1 >= num2) {
			primerNum = num1;
		}

		// Segundo y tercer Número
		if (num3 >= num2 && num3 <= num1) {
			segundoNum = num3;
			tercerNum = num2;
		} else if (num2 >= num1 && num2 <= num3) {
			segundoNum = num2;
			tercerNum = num1;
		} else if (num1 >= num3 && num1 <= num2) {
			segundoNum = num1;
			tercerNum = num3;
		}else {
			segundoNum = num2;
			tercerNum = num3;
		}
		
		System.out.println("El orden es "+primerNum+ " "+ segundoNum + " "+ tercerNum);
		entradaTeclado.close();
	}

}
