package Condiciones_Bucles;

import java.util.Scanner;

public class BuclesAnidados {

	public static void main(String[] args) {
		
		/* Programa qie pida n�meros positivos, y para cada n�mero que cuente desde el 1 hasta el n�mero introducido.
		 * 
		 * Termina con un 0 o n�mero negativo.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numero; 
		
		System.out.println("Escribe n�meros. Cero o negativos para finalizar.");
		do {
			
			numero = sc.nextInt();
			if (numero > 0) {
				for (int i = 1; i <= numero; i++) {
					System.out.println(i + " ");
				}
				System.out.println();;
			}
				
		} while (numero > 0);
		
		/*
		 * Mostrar figuras en dos dimensiones por consola, necesariamente se debe de emplear un doble bucle (anidado),
		 */
		
		int base = 8, altura =  4;
		
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= base; j++){
				System.out.print("*");
			}
			System.out.println();
		}		
	}
}
