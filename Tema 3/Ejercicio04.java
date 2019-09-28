

public class Ejercicio04 {
	
	public static void main (String[] args) {
		String numero1;
		String numero2;
		
		System.out.print("Introduzca el primer número: ");
		numero1 = System.console().readLine();
		double numeroIntroducido1;
		numeroIntroducido1 = Double.parseDouble( numero1 );
		
		System.out.print("Introduzca el segundo número: ");
		numero2 = System.console().readLine();
		double numeroIntroducido2;
		numeroIntroducido2 = Double.parseDouble( numero2 );
		
		double suma = numeroIntroducido1 + numeroIntroducido2;
		double resta = numeroIntroducido1 - numeroIntroducido2;
		double multiplicacion = numeroIntroducido1 * numeroIntroducido2;
		double division = numeroIntroducido1 / numeroIntroducido2;
		
		System.out.println("El resultado de la suma de los dos números introducidos es: " + (String.format("%.2f" ,(suma))));
		System.out.println("El resultado de la resta de los dos números introducidos es: " + (String.format("%.2f" ,(resta))));
		System.out.println("El resultado de la multiplicación de los dos números introducidos es: " + (String.format("%.2f" ,(multiplicacion))));
		System.out.print("El resultado de la división de los dos números introducidos es: " + (String.format("%.2f" ,(division))));
	}
}

