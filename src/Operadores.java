
public class Operadores {

	public static void main(String[] args) {
	
		/* 
		* Operadores Aritméticos
		*/
		
		System.out.println(3 * (2+3)); //15
		
		// Ejercicio 3
		System.out.println(4 * 3 + 5 % 2 * 6); //18
		System.out.println(4 * ( 3 + 5 ) % ( 2 * 6 )); //8
		
		/*
		 * Variables
		 */
		
		int añoNacimiento;
		int añoActual;
		
		añoNacimiento = 1992;
		añoActual = 2022;
		
		System.out.println("Tengo " + (añoActual - añoNacimiento) + " años.");
		
		/**
		*Operadores de Asignación 
		*/
		
		int valor = 3;
		System.out.println(valor);
		
		valor += 5; // A valor le sumo 5
		System.out.println(valor);
		
		valor *= 4; // A valor le multiplico 7
		System.out.println(valor);
		
		valor /= 2; // A valor lo divido entre 5
		System.out.println(valor);
			
		/**
		 * Números reales
		 */
		
		float precioRefresco;
		double precioSnack;
		
		precioRefresco = 10.1234f;
		precioSnack = 16.5432101234567;
		System.out.println("El total de la compra es " + precioRefresco + precioSnack + " euros"); 
		System.out.println("El total de la compra es " + (precioRefresco + precioSnack) + " euros"); 
		// Sin el paréntesis en la operación lo va concatenando de uno en uno y saldría: 10.xxxx.xxxxx
		
		/**
		 * Desbordamiento
		 */
		
		int poblacionChina = 1403500365;
		int poblacionIndia = 1372065957;
		int poblacionTotal = poblacionChina + poblacionIndia;
		System.out.println(poblacionTotal); // Aquí el resultado se desbora
		
		long poblacionChinaLong = 1403500365;
		long poblacionIndiaLong = 1372065957;
		long poblacionTotalLong = poblacionChinaLong + poblacionIndiaLong;
		System.out.println(poblacionTotalLong);
		
		/*
		 * Tipo de dato Caracter
		 */
		
		char c1 = 'a';
		char c2 = 'b';
		char c3 = '\n';
		// Una debajo de la otra
		System.out.print(c1);
		System.out.print(c3);
		System.out.print(c2);
		System.out.print(c3);				
		
		// Poner las vocales en la misma línea separadas con tabulaciones
		char a1 = 'A';
		char e1 = 'E';
		char i1 = 'I';
		char o1 = 'O';
		char u1 = 'U';
		char t1 = '\t';
		
		System.out.print(a1);
		System.out.print(t1);
		System.out.print(e1);
		System.out.print(t1);
		System.out.print(i1);
		System.out.print(t1);
		System.out.print(o1);
		System.out.print(t1);
		System.out.print(u1);
				
		// Poner A E I O U y a e i o u en dos líneas
		
		String vocalesMayusculas = "A\tE\tI\tO\tU";
		String vocalesMinuscula = "a e i o u";
		
		String resultado = vocalesMayusculas + '\n' + vocalesMinuscula;
		
		System.out.println(resultado);
		
		
		/*
		 * Programa que almacene en una variable real (tipo float) el valor de PI (3,1416).
		 * Después, almacena en otra variable (entera o real) el radio de una circunferencia.
		 * Finalmente, almacena en una 3º variable (float) la longitud de esa circunferencia
		 * (calculada como 2*PI*radio) y muestra el resultado por pantalla con dos decimales.
		 */
		
		float pi = 3.1416f; // La f del final es para confirmar que es un valor float.
		int radio = 5;
		float longitudCircunferencia = 2 * pi * radio;
		
		// %4.2f --> Son 4 cifras con 2 decimales. = 31.42
		System.out.printf("La circunferencia de radio %d mide %4.2f", radio, longitudCircunferencia);
		
		
		/*
		 * Operadores Lógicos
		 */
		
		int n = 10, m = 5;
		
		boolean z1 = n > 5 && m < 10; // TRUE
		boolean z2 = n > 5 && m > 10; // FALSE
		boolean z3 = n > 5 || m > 10; // TRUE
		boolean z4 = n < 5 || m > 10; // FALSE
		boolean z5 = n > 5; // TRUE
		boolean z6 = !z5; // FALSE
		
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
		
		/*
		    o	Primero se evalúa cualquier expresión entre paréntesis.
			o	Después se evalúan las negaciones (!)
			o	Después se evalúan las “Y” (&&)
			o	Después se evalúan las “O” (||)
		 */
		
		boolean z7 = n > 5 || m <= 3 && m == 1; // TRUE => TRUE || TRUE && FALSE
		
		System.out.println(z7);
		
	}

}
