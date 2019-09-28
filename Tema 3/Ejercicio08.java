
public class Ejercicio08 {
	
	public static void main (String[] args) {
		String horasTrabajadas;
		
		System.out.print("Introduzca las horas trabajadas en esta semana: ");
		horasTrabajadas = System.console().readLine();
		double horasTrabajadasIntroducidas;
		horasTrabajadasIntroducidas = Double.parseDouble( horasTrabajadas );
		
		double salario;
		salario = horasTrabajadasIntroducidas * 12;
		
		System.out.print("Su salario correspondiente a esta última semana es de: " + (String.format("%.2f", salario)) + "€");
	}
}

