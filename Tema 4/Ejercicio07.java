
public class Ejercicio07 {
	
	public static void main (String[] args) {
		
		System.out.println("Vamos a calcular la media de tres notas: ");
		System.out.print("Introduce la nota del primer examen: ");
		double notaPrimerExamen = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce la nota del segundo examen: ");
		double notaSegundoExamen = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce la nota del tercer examen: ");
		double notaTercerExamen = Double.parseDouble(System.console().readLine());
		
		double media = (notaPrimerExamen + notaSegundoExamen + notaTercerExamen) / 3;
		
		System.out.print("La nota media de los tres examenes introducidos es un: " + String.format("%.2f", media));
		
	}
}

