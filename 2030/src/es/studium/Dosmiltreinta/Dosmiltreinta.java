package es.studium.Dosmiltreinta;

import java.util.Scanner;

public class Dosmiltreinta {

	public static void main(String[] args) {
		int anio;
		String nombre;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indique su nombre: ");
		nombre=teclado.nextLine();
		
		System.out.println("Indique el a�o de su nacimiento:");
		anio=teclado.nextInt();
		
		System.out.println("Hola"+" "+nombre+","+" "+"en el anio 2030 tendr�s"+" "+(2030-anio)+" "+"a�os");
		teclado.close();
	}

}
