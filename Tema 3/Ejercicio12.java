
public class Ejercicio12 {
	
	public static void main (String[] args) {
		String notaPrimerExamen;
		String notaPrimerTrimestre;
		
		System.out.print("Introduce la nota del primer examen: ");
		notaPrimerExamen = System.console().readLine();
		double notaPrimerExamenIntroducida;
		notaPrimerExamenIntroducida = Double.parseDouble( notaPrimerExamen );
		
		System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
		notaPrimerTrimestre = System.console().readLine();
		double notaPrimerTrimestreIntroducida;
		notaPrimerTrimestreIntroducida = Double.parseDouble( notaPrimerTrimestre );
		
		double notaNecesaria;
		notaNecesaria = ((notaPrimerTrimestreIntroducida) - (notaPrimerExamenIntroducida * 0.4)) / 0.6;
		
		System.out.print("Teniendo un " + (String.format("%.2f", notaPrimerExamenIntroducida)) + " en el primer examen, necesitas sacar un " + (String.format("%.2f", notaNecesaria)) + " en el segundo examen si quieres tener un " + (String.format("%.2f", notaPrimerTrimestreIntroducida)) + " en el primer trimestre");
		
	}
}

