package EjerciciosPracticos;

public class While {

	public static void main(String[] args) {
		
		/*
		 *  Programa que, dado un n�mero, determine cu�ntas veces seguidas es divisible por 2.
		 */

		int numero = 64;
		int contador = 0;
		
		while (numero % 2 == 0){
			
			numero /= 2;
			contador++;
			
		}
		System.out.println("El n�mero es divisible " + contador + " veces.");
	}

}
