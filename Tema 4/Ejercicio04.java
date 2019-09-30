
public class Ejercicio04 {
	
	public static void main (String[] args) {
		
		System.out.print("Introduzca las horas trabajadas en esta semana: ");
		int horasTrabajadas = Integer.parseInt(System.console().readLine());
    int salario;
		
    
    if (horasTrabajadas<40) {
      salario = (horasTrabajadas * 12);
    } else {
      salario = ((40 * 12) + (horasTrabajadas - 40) * 16);
    }
    
		
		System.out.print("Su salario correspondiente a esta última semana es de: " + salario + "€");
	}
}

