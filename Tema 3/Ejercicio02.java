
public class Ejercicio02 {
	
	public static void main (String[] args) {
		String euros;
		double eurosPesetas = 166.386;
		
		System.out.print("Introduce la cantidad de euros que quieres convertir a pesetas: ");
		euros = System.console().readLine();
		double eurosIntroducidos;
		eurosIntroducidos = Double.parseDouble( euros );
		
		double eurosConvertidos;
		eurosConvertidos = eurosIntroducidos * eurosPesetas;
		
		System.out.print("La cantidad de euros introducidos: " + eurosIntroducidos + "€, se corresponde a " + (String.format("%.3f", eurosConvertidos)) + " pesetas");
		
	}
}

