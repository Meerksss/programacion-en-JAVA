package EjerciciosPracticos;

import java.util.Scanner;

public class BucleAnidado {

	public static void main(String[] args) {
		
		/* 1�
		 * 
		 * Programa que dibuje un tri�ngulo de aster�scos, de la altura que indique el usuario.
		 * 
		 * Ej: ancho 4:
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ancho del tri�ngulo?");
		
		int ancho = sc.nextInt();
		
		for	(int fila = 1; fila <= ancho; fila++) {
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("**** OTRO EJERCICIO****");
		
		 /* 2�
		  * 
		  * Escribe un programa que pida 10 n�umeros enteros positivos al usuario, verificando para cada n�mero que sea positivo
		  * (de lo contrario, se lo volver� a pedir tantas veces como sea necesario).
		  * 
		  * Finalmente, se debe mostrar el resultado de la suma de los n�meros (validados) introducidos.
		  */
		
		int n;
		int suma = 0;
		
		for (int i =  1; i <= 10; i++) {
			do {
				System.out.println("Dime un entero positivo:");
				n = sc.nextInt();
			} while (n <= 0);
			
			suma += n;
		}
		System.out.println("La suma es: " + suma);
	}
}
