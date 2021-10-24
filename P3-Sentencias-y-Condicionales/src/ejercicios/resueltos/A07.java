package ejercicios.resueltos;

import java.util.Scanner;

public class A07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Introduzca una palabra: ");
		String palabra1 = entradaTeclado.next();
		System.out.print("Introduzca una palabra: ");
		String palabra2 = entradaTeclado.next();
		//Forma 1
		if(palabra1.equals(palabra2)) {
			System.out.println("Las palabras son iguales");
		}else {
			System.out.println("Las palabras no son iguales");
		}
		//Extra
		if(palabra1.equalsIgnoreCase(palabra2)) {
			System.out.println("Las palabras son iguales (sin tener en cuenta mayus ni minus)");
		}else {
			System.out.println("Las palabras no son iguales");
		}		
		entradaTeclado.close();
	}
}
