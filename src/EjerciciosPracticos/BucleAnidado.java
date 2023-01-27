package EjerciciosPracticos;

import java.util.Scanner;

public class BucleAnidado {

	public static void main(String[] args) {
		
		/* 1º
		 * 
		 * Programa que dibuje un triángulo de asteríscos, de la altura que indique el usuario.
		 * 
		 * Ej: ancho 4:
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Ancho del triángulo?");
		
		int ancho = sc.nextInt();
		
		for	(int fila = 1; fila <= ancho; fila++) {
			for (int columna = 1; columna <= fila; columna++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("**** OTRO EJERCICIO****");
		
		 /* 2º
		  * 
		  * Escribe un programa que pida 10 núumeros enteros positivos al usuario, verificando para cada número que sea positivo
		  * (de lo contrario, se lo volverá a pedir tantas veces como sea necesario).
		  * 
		  * Finalmente, se debe mostrar el resultado de la suma de los números (validados) introducidos.
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
