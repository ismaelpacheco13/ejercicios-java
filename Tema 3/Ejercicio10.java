
public class Ejercicio10 {
	
	public static void main (String[] args) {
		String megabits;
		
		System.out.print("Introduce la cantidad de Megabits (Mb) que quieres convertir a Kilobits (Kb): ");
		megabits = System.console().readLine();
		int megabitsIntroducidos;
		megabitsIntroducidos = Integer.parseInt( megabits );
		
		int kilobitsCalculados;
		kilobitsCalculados = megabitsIntroducidos * 1024;
		
		System.out.print( megabitsIntroducidos + " Mb son exactamente " + kilobitsCalculados + " Kb");
	}
}

