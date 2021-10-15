package p2.variables_y_primitivos;
import java.util.Scanner;
public class A08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lecturaTec = new Scanner(System.in);
		System.out.println("Introduce 4 números: ");
		int num1 = lecturaTec.nextInt();
		int num2 = lecturaTec.nextInt();
		int num3 = lecturaTec.nextInt();
		int num4 = lecturaTec.nextInt();
		int suma = num1 + num2 + num3 + num4;
		System.out.println("La suma es " + suma);
		lecturaTec.close();
	}

}
