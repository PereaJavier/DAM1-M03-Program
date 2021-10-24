package ejercicios.resueltos;

import java.util.Scanner;
import java.lang.StringBuilder;

public class AE02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduzca una de las siguientes opciones: ");
		System.out.println("1- Invertir palabra");
		System.out.println("2- Comparar dos palabras");
		int opcion = entradaTeclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.print("Introduzca una palabra: ");
			String palabra = entradaTeclado.next();
			// Con StringBuilder, una clase implementada de Java, podremos revertir la
			// palabra con un método reverse() de la clase.

			StringBuilder textoModificado = new StringBuilder();
			textoModificado.append(palabra);
			textoModificado.reverse();
			System.out.println(textoModificado);
			break;
		case 2:
			System.out.print("Introduzca la primera palabra: ");
			String palabra1 = entradaTeclado.next();
			System.out.print("Introduzca la segunda palabra: ");
			String palabra2 = entradaTeclado.next();
			StringBuilder palabra1Invertida = new StringBuilder();
			StringBuilder palabra2Invertida = new StringBuilder();
			palabra1Invertida.append(palabra1);
			palabra2Invertida.append(palabra2);

			palabra1Invertida.reverse();
			palabra2Invertida.reverse();

			if (palabra1Invertida.toString().equals(palabra2)) {
				System.out.println(palabra2 + " es igual a " + palabra1);
			} else {
				System.out.println(palabra2 + " no es igual a " + palabra1);
			}
			break;
		default:
			System.out.println("Dato introducido no válido");
			break;
		}
		entradaTeclado.close();
	}

}
