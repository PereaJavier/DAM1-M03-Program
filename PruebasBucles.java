package prueba.bucles;
import java.util.Scanner;
public class PruebasBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Programa para calcular los múltiplos del número 
		 * que indiquemos por teclado y definiendo por teclado
		 * el número final por el que se parará el bucle
		 * 
		 * */
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.print("Número del cual calcular los múltiplos: ");

		int numeroPartida = entradaTeclado.nextInt();
		System.out.print("Número límite para finalizar el cálculo de múltiplos: ");

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
