package ejercicios.resueltos;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaTeclado = new Scanner(System.in);
		int aprobados, acondicionados, suspensos;
		aprobados = 0;
		acondicionados = 0;
		suspensos = 0;
		System.out.print("Introduce la primera nota: ");
		float nota1 = entradaTeclado.nextFloat();

		System.out.print("Introduce la segunda nota: ");
		float nota2 = entradaTeclado.nextFloat();

		System.out.print("Introduce la tercera nota: ");
		float nota3 = entradaTeclado.nextFloat();

		System.out.print("Introduce la cuarta nota: ");
		float nota4 = entradaTeclado.nextFloat();

		System.out.print("Introduce la quinta nota: ");
		float nota5 = entradaTeclado.nextFloat();

		/**
		 * 
		 * Ponemos las condiciones para sumar aprobados, acondicionados y suspensos
		 * 
		 * */
		
		//NOTA 1
		if((nota1 >= 0 && nota1<=10) && nota1>=5) {
			aprobados++;
		}else if((nota1 >= 0 && nota1<=10) && nota1>4){
			acondicionados++;
		}else if ((nota1 >= 0 && nota1<=10)) {
			suspensos++;
		}else {
			System.out.println("La nota "+nota1+" introducida no está entre 0 y 10");
		}

		//NOTA 2
		if((nota2 >= 0 && nota2<=10) && nota2>=5) {
			aprobados++;
		}else if((nota2 >= 0 && nota2<=10) && nota2>4){
			acondicionados++;
		}else if ((nota2 >= 0 && nota2<=10)) {
			suspensos++;
		}else {
			System.out.println("La nota "+nota2+" introducida no está entre 0 y 10");
		}
		
		//NOTA 3
		if((nota3 >= 0 && nota3<=10) && nota3>=5) {
			aprobados++;
		}else if((nota3 >= 0 && nota3<=10) && nota3>4){
			acondicionados++;
		}else if ((nota3 >= 0 && nota3<=10)) {
			suspensos++;
		}else {
			System.out.println("La nota "+nota3+" introducida no está entre 0 y 10");
		}
		
		//NOTA 4
		if((nota4 >= 0 && nota4<=10) && nota4>=5) {
			aprobados++;
		}else if((nota4 >= 0 && nota4<=10) && nota4>4){
			acondicionados++;
		}else if ((nota4 >= 0 && nota4<=10)) {
			suspensos++;
		}else {
			System.out.println("La nota "+nota4+" introducida no está entre 0 y 10");
		}
		
		//NOTA 5
		if((nota5 >= 0 && nota5<=10) && nota5>=5) {
			aprobados++;
		}else if((nota5 >= 0 && nota5<=10) && nota5>4){
			acondicionados++;
		}else if ((nota5 >= 0 && nota5<=10)) {
			suspensos++;
		}else {
			System.out.println("La nota "+nota5+" introducida no está entre 0 y 10");
		}
		
		
		System.out.println("Tenemos "+suspensos+ " suspensos, " + acondicionados + " condicionados y " + aprobados + " aprobados");
		
		entradaTeclado.close();

	}

}
