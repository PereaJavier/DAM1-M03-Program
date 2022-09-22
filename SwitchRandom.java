package main;

import java.util.Random;
import java.util.Scanner;

public class SwitchRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa para crear un número aletorio
		// e imprimirlo por pantalla.
		Random rand = new Random();
		int numAleatorio = rand.nextInt(5, 7);

		System.out.println("Mi número aleatorio es: " + numAleatorio);
		switch (numAleatorio) {
		case 12:
			System.out.println("Le ha tocado ser delegado al " + "alumno con nº12 en la lista");
			break;
		case 15:
			System.out.println("Le ha tocado ser delegado al " + "alumno con nº15 en la lista");
			break;
		default:
			System.out.println("Le ha tocado ser delegado" + "a un alumno que no es ni el nº12 ni "
					+ "el nº15 de la lista de clase.");
		}
		inp

	}

}
