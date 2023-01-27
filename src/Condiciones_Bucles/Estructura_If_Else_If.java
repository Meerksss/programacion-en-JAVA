package Condiciones_Bucles;

import java.util.Scanner;

public class Estructura_If_Else_If {

	public static void main(String[] args) {

		/*
		 * Haz un programa que le pida al usuario que escriba tres numeros enteros, y muestre por pantalla un mensaje
		 * indicando si todos ellos son positivos (mayores o iguales que 0), y si ninguno lo es,
		 * o si algunos si son positivos pero otro no.
		 */
		
		int numero1 , numero2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un n�mero: ");
		numero1 = sc.nextInt();
		System.out.println("Escribe otro n�mero: ");
		numero2 = sc.nextInt();
						
		if (numero1 > 0 && numero2 > 0) {
			
			 System.out.println("Ambos son n�meros positivos.");
		}
		else if (numero1 < 0 && numero2 < 0) {
			
			System.out.println("Ning�n n�mero es positivo.");
		}
		else {
			System.out.println("Uno es positivo y otro no.");
		}
		
	}

}
