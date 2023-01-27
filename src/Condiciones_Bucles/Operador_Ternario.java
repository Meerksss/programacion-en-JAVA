package Condiciones_Bucles;

import java.util.Scanner;

public class Operador_Ternario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero;
		String mensaje;
		
		System.out.println("Escribe un número: ");
		numero = sc.nextInt();
		
		mensaje = (numero >= 0) ? "Es positivo" : "Es negativo";
		
		System.out.println(mensaje);

	}
}
