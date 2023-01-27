package DatosCompuestos;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		/*
		 * Solicitar al usuario un número para el último elemento del Array y la suma de los dos últimos elementos.
		 */
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3];
		numeros[0] = 3;
		numeros[1] = 2;
		System.out.println("Escribe el valor de la tercera casilla");
		numeros[2] = sc.nextInt();
		
		System.out.println("La primera casilla es " + numeros[0]);
		System.out.println(numeros[1] + numeros[2]);
		
		/*
		 * Solicitamos 5 elementos para un array y lo recorramos.
		 */
		
		float[] notas = new float[5];
		System.out.println("Escribe las 5 notas");
		for (int i = 0; i < notas.length; i++) {
			notas[i] = sc.nextFloat();
		}
		System.out.println("Estas son las notas escritas");
		for (int i = 0; i <notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		/*
		 * FOREACH
		 * 
		 * Vamos a pedir que escriba 4 plantas de un edificio
		 */
		
		int[] plantas = new int[4];
		System.out.println("Escribe 4 plantas");
		for (int i = 0; i < plantas.length; i++) {
			plantas[i] = sc.nextInt();
		}
		System.out.println("Estos son las plantas que tendremos");
		for (int planta : plantas) {
			System.out.println(planta);
		}
		
		/*
		 * Arrays con valores por defecto.
		 */
		
		int[] numerosFijados = {3, 5, 7, 9, 11};
		// numerosFijados[1] = 10; // Podemos modificar un elemento. En este caso la posición 1, que es el 2º.
		System.out.println("Datos del array predefinido");
		for (int numero : numerosFijados) {
			System.out.println(numero);
		}
	}
}
