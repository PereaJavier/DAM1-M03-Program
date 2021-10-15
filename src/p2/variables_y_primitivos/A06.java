package p2.variables_y_primitivos;

import java.util.Scanner;

public class A06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nuevaEntTec = new Scanner(System.in);
		System.out.print("Introduzca el nombre: ");
		String nombre = nuevaEntTec.next();
		System.out.print("\nIntroduzca la edad: ");
		int edad = nuevaEntTec.nextInt();

		System.out.println("Hola " + nombre + " de edad " + edad);
		//Cerramos la clase Scanner
		nuevaEntTec.close();
	}

}
