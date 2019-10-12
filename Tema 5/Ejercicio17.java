
public class Ejercicio17 {
	
	public static void main (String[] args) {
		
		System.out.println("Suma de los 100 números siguientes al número introducido (entero y positivo)");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.print("Introduce el número: ");
		int numeroIntroducido = Integer.parseInt(System.console().readLine());

		int numeroFinal = 0;
		
		if (numeroIntroducido >= 0) {
			for (int i = 0; i <= numeroIntroducido + 100; i++) {
				numeroFinal += i;
			}
			System.out.print("La suma de los cien números siguientes a " + numeroIntroducido + " es: " + numeroFinal);
		} else {
			System.out.print("El número introducido no es positivo");
		}	
	}
}

