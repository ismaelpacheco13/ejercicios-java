
public class Ejercicio11 {
	
	public static void main (String[] args) {
		
		System.out.println("Vamos a calcular los segundos restantes para medianoche: ");
		System.out.print("Introduce la hora en la que te encuentras (formato 24h): ");
		int hora = Integer.parseInt(System.console().readLine());
		System.out.print("Introduce los minutos en los que te encuentras: ");
		int minutos = Integer.parseInt(System.console().readLine());
		
		int horaSegundos = hora*3600;
		int minutosSegundos = minutos*60;
		int medianoche = 24*3600;
		int segundosHastaMedianoche = (medianoche - (horaSegundos + minutosSegundos));
		
		System.out.print("Quedan exactamente " + segundosHastaMedianoche + "s para llegar a medianoche");
	}
}

