package ejercicios.resueltos;

import java.util.Scanner;

public class AE01 {
	public static void main(String[] args) {
		Scanner entradaTeclado= new Scanner(System.in);
		int letraAscii = (int) entradaTeclado.next().charAt(0);
		if(letraAscii >= 65 && letraAscii <= 90) {
			System.out.println("La primera letra es mayúscula");
		}else {
			System.out.println("La primera letra es minúsucula");
		}
		entradaTeclado.close();
		
	}
}
