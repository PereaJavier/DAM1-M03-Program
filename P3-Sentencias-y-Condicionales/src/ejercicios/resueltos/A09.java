package ejercicios.resueltos;

import java.util.Scanner;

public class A09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Inserte la edad de su su hija/o para saber qu� est� estudiando: ");
		int edad = entradaTeclado.nextInt();
		String curso = "";
		if (edad >= 0 && edad <= 2) {
			curso = "Guarderia";
		} else if (edad >= 4 && edad <= 5) {
			curso = "Educaci�n Infantil";
		} else if (edad >= 6 && edad <= 11) {
			curso = "Educaci�n Primaria";
		} else if (edad >= 12 && edad <= 15) {
			curso = "Educaci�n Secundaria";
		} else if (edad >= 16 && edad <= 17) {
			curso = "Educaci�n Secundaria No Obligatoria";
		} else if (edad >= 18) {
			curso = "Universidad u otros";
		}
		System.out.println(curso);
		entradaTeclado.close();
	}

}
