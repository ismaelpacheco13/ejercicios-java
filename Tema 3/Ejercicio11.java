
public class Ejercicio11 {
	
	public static void main (String[] args) {
		String kilobits;
		
		System.out.print("Introduce la cantidad de Kilobits (Kb) que quieres convertir a Megabits (Mb): ");
		kilobits = System.console().readLine();
		int kilobitsIntroducidos;
		kilobitsIntroducidos = Integer.parseInt( kilobits );
		
		int megabitsCalculados;
		megabitsCalculados = kilobitsIntroducidos / 1024;
		
		System.out.print( kilobitsIntroducidos + " Kb son exactamente " + megabitsCalculados + " Mb");
	}
}

