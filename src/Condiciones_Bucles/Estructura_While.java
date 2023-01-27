package Condiciones_Bucles;

import java.util.Scanner;

public class Estructura_While {

	public static void main(String[] args) {
		
		/*
		 * Programa que pide al usuario números enteros mientras éstos sean positivos.
		 * Al finalizar (cuando el usuario introduzca un número negativo) deberá mostrar por pantalla la suma total de los números introducidos.
		 */
		
		int n;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(("Dime un número positivo: "));
		n = sc.nextInt();
				
		while (n >= 0) {
			suma += n;
			System.out.println("Dime otro número positivo: ");
			n = sc.nextInt();
		}
		
		System.out.println("La suma es " + suma);
	}

}
