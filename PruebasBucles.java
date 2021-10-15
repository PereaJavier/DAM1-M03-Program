package prueba.bucles;
import java.util.Scanner;
public class PruebasBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Programa para calcular los m�ltiplos del n�mero 
		 * que indiquemos por teclado y definiendo por teclado
		 * el n�mero final por el que se parar� el bucle
		 * 
		 * */
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("N�mero del cual calcular los m�ltiplos: ");

		int numeroPartida = entradaTeclado.nextInt();
		System.out.print("N�mero l�mite para finalizar el c�lculo de m�ltiplos: ");

		int numeroLimite = entradaTeclado.nextInt();
		//Bucle for
		System.out.println("Bucle for");
		for(int numActual=numeroPartida; numActual <= numeroLimite; numActual += numeroPartida) {
			System.out.println(numActual);
		}
		//Bucle while
		System.out.println("Bucle while");

		int numActual=numeroPartida;
		while(numActual <= numeroLimite) {
			System.out.println(numActual);
			numActual += numeroPartida;
		}
		System.out.println("Bucle do-while");
		numActual=numeroPartida;
		//Bucle dowhile
		do {
			System.out.println(numActual);
			numActual += numeroPartida;
		}while(numActual <= numeroLimite);
	}

}
