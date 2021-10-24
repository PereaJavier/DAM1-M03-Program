package ejercicios.resueltos;

import java.util.Scanner;

public class A08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		int numAleatorio =(int)(Math.random()*8) + 3;
		System.out.println("Introduzca un número del 3 al 8: ");
		int numIntroducido = entradaTeclado.nextInt();
		if(numIntroducido < 3 || numIntroducido > 8) {
			System.out.println("Número fuera de rango");
		}else if(numIntroducido == numAleatorio) {
			System.out.println("Has acertado! Era el "+numAleatorio);
		}else {
			System.out.println("Has fallado! Era el "+numAleatorio);			
		}
		entradaTeclado.close();
	}

}
