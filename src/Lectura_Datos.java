import java.util.Scanner;

public class Lectura_Datos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu edad: ");
		byte edad = sc.nextByte();
		sc.nextLine();
		
		System.out.print("Dime tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Dime tu estatura en metros: ");
		float estaturaMetros = sc.nextFloat();
		
		System.out.printf("Te llamas %s, tienes %d años y mides %4.2f m", nombre, edad, estaturaMetros);
		
	}

}
