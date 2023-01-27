package Condiciones_Bucles;

import java.util.Scanner;

public class Estructura_While {

	public static void main(String[] args) {
		
		/*
		 * Programa que pide al usuario n�meros enteros mientras �stos sean positivos.
		 * Al finalizar (cuando el usuario introduzca un n�mero negativo) deber� mostrar por pantalla la suma total de los n�meros introducidos.
		 */
		
		int n;
		int suma = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(("Dime un n�mero positivo: "));
		n = sc.nextInt();
				
		while (n >= 0) {
			suma += n;
			System.out.println("Dime otro n�mero positivo: ");
			n = sc.nextInt();
		}
		
		System.out.println("La suma es " + suma);
	}

}
