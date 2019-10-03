
public class Ejercicio06 {
	
	public static void main (String[] args) {
		
		System.out.println("Vamos a calcular el tiempo (t) que tarda en caer un objeto desde una determinada altura en la Tierra.");
		System.out.print("Introduce la altura desde la que caerá el objeto (en m): ");
		double altura = Double.parseDouble(System.console().readLine());
		
		double gravedadTierra = 9.81;
		double ecuacionTiempo = Math.sqrt((2*altura)/gravedadTierra);
		
		System.out.print("El objeto tardará en caer " + String.format("%.2f", ecuacionTiempo) + "s");
	}
}

