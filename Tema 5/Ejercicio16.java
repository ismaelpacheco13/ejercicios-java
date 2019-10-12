
public class Ejercicio16 {
	
	public static void main (String[] args) {
		
		System.out.println("Descubre si el número introducido es primo o no");
		System.out.println("------------------------------------------------");
		System.out.print("Introduce el número: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		boolean esPrimo = true;
		
		for (int i = 2; i < numero; i++) {
			if ((numero % i) == 0) {
				esPrimo = false;
			}
		}
		
		if (esPrimo) {
			System.out.print("El número introducido es primo");
		} else {
			System.out.print("El número introducido no es primo");
		}	
	}
}

