package p2.variables_y_primitivos;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class Aextra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate fechaCumple = LocalDate.of(1996, Month.OCTOBER, 21);
		System.out.println("Tu cumple es: "+fechaCumple);
		
		Scanner entradaTecl = new Scanner(System.in);
		System.out.println("�Cu�ntos a�os le sumo?");
		int anyosSumados = entradaTecl.nextInt();
		System.out.println("�Cu�ntos d�as le sumo?");
		int diasSumados = entradaTecl.nextInt();	
		
		fechaCumple = fechaCumple.plusYears(anyosSumados);
		fechaCumple = fechaCumple.plusDays(diasSumados);
		System.out.println("Tu cumple ser�a: " + fechaCumple);
		entradaTecl.close();

	}

}
