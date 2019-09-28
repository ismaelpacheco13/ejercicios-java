
public class Ejercicio06 {
	
	public static void main (String[] args) {
		String base;
		String altura;
		
		System.out.print("Introduce el valor en cm de la base del triángulo: ");
		base = System.console().readLine();
		double baseIntroducida;
		baseIntroducida = Double.parseDouble( base );
		
		System.out.print("Introduce el valor en cm de la altura del triángulo: ");
		altura = System.console().readLine();
		double alturaIntroducida;
		alturaIntroducida = Double.parseDouble( altura );
		
		double areaTriangulo;
		areaTriangulo = ((baseIntroducida * alturaIntroducida) / 2);
		
		System.out.print("El área del triángulo es de: " + (String.format("%.2f", areaTriangulo)) + " cm²");
	}
}

