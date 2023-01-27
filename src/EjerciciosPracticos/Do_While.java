package EjerciciosPracticos;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		
		/*
		 * Escribir un programa que le pida al usuario número enteros mientras éstos sean positivos y hasta un máximo de 5 números.
		 * Al finalizar (cuando el usuario haya introducido 5 números) deberá mostras por pantalla la suma total de los números introducidos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n;
		int sumaTotal = 0;
		int contador = 0;
		
		do {
			System.out.println("Escribe un número: ");
			n = sc.nextInt();
			contador++;
			if (n >= 0)
				sumaTotal += n;
			
		} while ((n >= 0) && (contador < 5));
		
		System.out.println("La suma total es = " + sumaTotal);

	}

}
