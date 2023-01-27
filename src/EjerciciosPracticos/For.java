package EjerciciosPracticos;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que le pida al usuario 10 números enteros y luego calcule y muestre por pantalla la media.
		 */
		
		Scanner sc = new Scanner(System.in);
		int numero;
		double media = 0;
		double total = 10.0;
					
		for (int i = 1; i <= 10; i++) {
									
			System.out.println(("Dame el " + i + "º número: "));
			numero = sc.nextInt();
			media += numero;
			
		}
		
		System.out.printf("Su media es " + media / total);
	}

}
