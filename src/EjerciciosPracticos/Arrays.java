package EjerciciosPracticos;

import java.util.Iterator;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Programa que pida al usuario que introduzca un n�mero entero.
		 * Despu�s, deber�a crear un array de ese tama�o de n�meros enteros, y pedir de nuevo al usuario que rellenere cada elemento.
		 * 
		 * Finalmente, recorrer y mostrar por pantalla el vallor de los datos introducidos que sean m�ltipos de 3, separados por comas.
		 */
		
		Scanner sc = new Scanner(System.in);
		int cantidad;
		int[] datos;
		
		System.out.println("Cu�ntos datos quieres? ");
		cantidad = sc.nextInt();
		
		datos = new int[cantidad];
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.println("Dime el dato " + (i+1) + ": ");
			datos[i] = sc.nextInt();
		}
		
		System.out.println("Los m�ltipos de 3 son: ");
		int datosEncontrados = 0;
		for (int i = 0; i < cantidad; i++) {
			if (datos[i] % 3 == 0) {
				datosEncontrados ++;
				if (datosEncontrados > 1)
				System.out.println(datos[i]);
			} 
		}
		if (datosEncontrados == 0) {
			System.out.println("No hay ning�n m�ltiplo, lo siento.");
		}
	}
}
