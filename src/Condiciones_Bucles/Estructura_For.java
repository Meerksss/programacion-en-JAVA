package Condiciones_Bucles;

import java.util.Scanner;

public class Estructura_For {

	public static void main(String[] args) {
		
		/*
		 * Proyecto que indicahasta que número quiere contar el usuario.
		 */
		
		Scanner sc = new Scanner(System.in);
		int limite;
		
		System.out.println("Indica hasta qué número quieres contar");
		limite = sc.nextInt();
		
		for (int n = 1; n <= limite; n++) {
			
			System.out.println(n);
		}
		
		/*
		 * Para que cuente del revés, del limite hasta el 1
		 * 
		 * for (int n = limite; n >= 1; n--)
		 * 
		 */

	}

}
