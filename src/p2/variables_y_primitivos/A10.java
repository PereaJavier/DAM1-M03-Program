package p2.variables_y_primitivos;
import java.util.Random;
import java.util.Scanner;
public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int numAleatorio = rand.nextInt(9);
		Scanner entradaTeclado = new Scanner(System.in);
		System.out.println("Introduzca un n�mero (a ver si hay suerte): ");
		int numIntroducido = entradaTeclado.nextInt();
		System.out.println("El n�mero aleatorio que se ha generado es: " + numAleatorio);
	
		System.out.println("�Son iguales? "+ (numIntroducido == numAleatorio));
		entradaTeclado.close();
	}

}
