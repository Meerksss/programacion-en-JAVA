package Condiciones_Bucles;

import java.util.Scanner;

public class Estructura_Switch {

	public static void main(String[] args) {
		
		/* 
		 * Proyecto en el cual determina qu� d�a de la semana es.
		 */
		
		int diaSemana;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un n�mero de d�a de la semana: ");
		diaSemana = sc.nextInt();
		
		switch(diaSemana) {
		
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MI�RCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("S�BADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("D�a incorrecto");
		}
	}
}
