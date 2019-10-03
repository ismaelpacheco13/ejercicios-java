
public class Ejercicio08 {
	
	public static void main (String[] args) {
		
		System.out.println("Vamos a calcular la media de tres notas: ");
		System.out.print("Introduce la nota del primer examen: ");
		double notaPrimerExamen = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce la nota del segundo examen: ");
		double notaSegundoExamen = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce la nota del tercer examen: ");
		double notaTercerExamen = Double.parseDouble(System.console().readLine());
		
		double media = (notaPrimerExamen + notaSegundoExamen + notaTercerExamen) / 3;
		
		System.out.println("La nota media de los tres examenes introducidos es un: " + String.format("%.2f", media));
		
		if (media<5) {
			System.out.print("Estás suspenso, deberás ir a Septiembre.");
		} else if ((media >=5) && (media <=6.99)) {
			System.out.print("Tienes un bien, podrías haberlo hecho mejor.");
		} else if ((media >=7) && (media<=8.99)) {
			System.out.print("Tienes un notable, lo has hecho muy bien!");
		} else if ((media>=9) && (media<=10)) {
			System.out.print("Tienes un sobresaliente, eres excepcional!!");
		}
			
		
	}
}

