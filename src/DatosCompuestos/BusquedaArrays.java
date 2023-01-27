package DatosCompuestos;

import java.util.Scanner;

public class BusquedaArrays {

	public static void main(String[] args) {

		/*
		 * Programa que muestre cómo buscar elementos en arrays.
		 */

		/*
		 * Array definido con valores ya almacenados. Queremos que el usuario indique el
		 * número que quiere buscar, y le diremos en que posición se encuentra (puede no
		 * estar).
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int[] numeros = { 3, 1, 8, 12, 7 };
		int numeroUsuario, posicion = 0;
		boolean encontrado = false;

		System.out.println("Escribe el número a buscar: ");
		numeroUsuario = sc.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroUsuario) {
				encontrado = true;
				posicion = i;
			}
		}
		if (encontrado) {
			System.out.println("El número se encuentra en la posición " + (posicion + 1));
		} else {
			System.out.println("No se ha encontrado el número.");
		}
		
		System.out.println("*** OTRA MANERA MÁS EFICIENTE ***");
		
		/*
		 * VÁLIDA PERO INEFICIENTE HACERLO DE ESTA MANERA.
		 * 
		 * Recomendable usar WHILE o DO...WHILE puesto no sabemos cuantas repeticiones vamos a utilizar.
		 */
		
		do {
			if (numeros[posicion] == numeroUsuario) {
				encontrado = true;
			} else {
				posicion++;
			}
			
		} while(!encontrado && posicion < numeros.length);
		
		if (encontrado) {
			System.out.println("El número se encuentra en la posición " + (posicion + 1));
		} else {
			System.out.println("No se ha encontrado el número.");
		}
		
		System.out.println("*** VALOR MÁXIMO / MÍNIMO ***");
			
		// Variable que almacene donde se supone que está el máximo
		int max = numeros[0];
		// Variable para saber en que posición se encuentra, y la inicializamos a 0
		int posMax = 0;		
		
		// Recorremos desde la posición 1 hasta el tamaño del array
		for (int i = 1; i < numeros.length; i++) {
			// Comprobamos si el número de esa posición es mayor que el maximo que tenemos almacenado
			if (numeros[i] > max) {
				// Si es así, actualizamos el nuevo máximo como su posición
				max = numeros[i];
				posMax = i;
			}
		}
		System.out.println(max);
		System.out.println("Y se encuentra en la posición " + (posMax + 1));
		
		/*
		 * Para sacar el mínimo es igual:
		 * 
		 * 1º Cambiamos en el if ">" por "<". 
		 * 2º cambiamos las variables MAX por MIN.
		 * 3ª En los SYSOS cambiamos también el texto.
		 */
	}
}
