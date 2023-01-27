
public class Autoincremento_Autodecremento {

	public static void main(String[] args) {
		
		int n = 1, a = 3, b = 4;
		a = b + n++; // a = 5, n = 2 
		n *= 3; // n = 6
		n = n + a + b * a; // n = 6 + 5 + 20
		System.out.println("n vale : " +n); // n = 31
		
		int x = 5, m = 5, p = 2;
		m = m / p; // m = 2 (número enteros, es un INT)
		m += ++x; // x = 6, m = 8 
		x *= p + m; // x *= 10 
		System.out.println("x vale : " + x); // x = 60

	}

}
