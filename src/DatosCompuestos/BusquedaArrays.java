package DatosCompuestos;

import java.util.Scanner;

public class BusquedaArrays {

	public static void main(String[] args) {

		/*
		 * Programa que muestre c�mo buscar elementos en arrays.
		 */

		/*
		 * Array definido con valores ya almacenados. Queremos que el usuario indique el
		 * n�mero que quiere buscar, y le diremos en que posici�n se encuentra (puede no
		 * estar).
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int[] numeros = { 3, 1, 8, 12, 7 };
		int numeroUsuario, posicion = 0;
		boolean encontrado = false;

		System.out.println("Escribe el n�mero a buscar: ");
		numeroUsuario = sc.nextInt();

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroUsuario) {
				encontrado = true;
				posicion = i;
			}
		}
		if (encontrado) {
			System.out.println("El n�mero se encuentra en la posici�n " + (posicion + 1));
		} else {
			System.out.println("No se ha encontrado el n�mero.");
		}
		
		System.out.println("*** OTRA MANERA M�S EFICIENTE ***");
		
		/*
		 * V�LIDA PERO INEFICIENTE HACERLO DE ESTA MANERA.
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
			System.out.println("El n�mero se encuentra en la posici�n " + (posicion + 1));
		} else {
			System.out.println("No se ha encontrado el n�mero.");
		}
		
		System.out.println("*** VALOR M�XIMO / M�NIMO ***");
			
		// Variable que almacene donde se supone que est� el m�ximo
		int max = numeros[0];
		// Variable para saber en que posici�n se encuentra, y la inicializamos a 0
		int posMax = 0;		
		
		// Recorremos desde la posici�n 1 hasta el tama�o del array
		for (int i = 1; i < numeros.length; i++) {
			// Comprobamos si el n�mero de esa posici�n es mayor que el maximo que tenemos almacenado
			if (numeros[i] > max) {
				// Si es as�, actualizamos el nuevo m�ximo como su posici�n
				max = numeros[i];
				posMax = i;
			}
		}
		System.out.println(max);
		System.out.println("Y se encuentra en la posici�n " + (posMax + 1));
		
		/*
		 * Para sacar el m�nimo es igual:
		 * 
		 * 1� Cambiamos en el if ">" por "<". 
		 * 2� cambiamos las variables MAX por MIN.
		 * 3� En los SYSOS cambiamos tambi�n el texto.
		 */
	}
}
