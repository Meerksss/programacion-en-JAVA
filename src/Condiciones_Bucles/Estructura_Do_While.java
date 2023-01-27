package Condiciones_Bucles;

import java.util.Scanner;

public class Estructura_Do_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 1;
		String texto;
		
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
		
		do {
			System.out.println("Escribe un texto: ");
			texto = sc.nextLine();
			if (!texto.equals("fin")) {
				System.out.println("Has escrito " + texto);
			}
				
		} while (!texto.equals("fin"));	
	}
}
