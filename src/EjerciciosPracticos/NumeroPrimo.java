package EjerciciosPracticos;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
	
		/*
		 * Programa que pide al usuario un n�mero y determine si es n�mero primo o no.
		 * 
		 * N�MERO PRIMO: solo es divisible por 1 y por s� mismo.
		 */
		
		int n;
		int divisores = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Qu� n�mero quieres ver si es primo?");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if (n % i == 0)
				divisores++;
		}
		
		if (divisores == 2)
			System.out.println("Es primo");
		else
			System.out.println("No es primo");
	}
}
