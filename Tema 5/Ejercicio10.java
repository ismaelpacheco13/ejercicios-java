
public class Ejercicio10 {
	
	public static void main (String[] args) {
		
		System.out.println("Cálculo media de x números");
		System.out.println("Para terminar de introducir números deberas introducir un número negativo");
		System.out.println("---------------------------");
		
		double n = 0;
		double suma = 0;
		double cantidadNumeros = 0;
		
		while (n >= 0) {
			System.out.print("Introduce el número: ");
			n = Double.parseDouble(System.console().readLine());
			cantidadNumeros++;
			suma += n;
		}
		
		double media = ((suma - n) / (cantidadNumeros - 1));
		
		System.out.print("La media de los números introducidos es: " + (String.format("%.2f", media)));
	}
}

