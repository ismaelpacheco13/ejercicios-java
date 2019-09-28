
public class Ejercicio01 {
	
	public static void main (String[] args) {
		String numero;
		
		System.out.print("Por favor, introduce un número: ");
		numero = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( numero );
		
		System.out.print("Por favor, introduce el segundo número: ");
		numero = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt( numero );
		
		int multiplicacion;
		multiplicacion = primerNumero * segundoNumero;
		
		System.out.print("El número resultante de la multiplicación de los dos anteriores es: " + multiplicacion);
	}
}

