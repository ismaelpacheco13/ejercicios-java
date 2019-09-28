

public class Ejercicio05 {
	
	public static void main (String[] args) {
		String base;
		String altura;
		
		System.out.print("Introduzca el valor en cm de la base del rectángulo: ");
		base = System.console().readLine();
		double baseIntroducida;
		baseIntroducida = Double.parseDouble( base );
		
		System.out.print("Introduzca el valor en cm de la altura del rectángulo: ");
		altura = System.console().readLine();
		double alturaIntroducida;
		alturaIntroducida = Double.parseDouble( altura );
		
		double areaCalculada;
		areaCalculada = baseIntroducida * alturaIntroducida;
		
		System.out.print("El área del rectángulo es de: " + (String.format("%.2f", areaCalculada)) + " cm²");
	}
}

