
public class Ejercicio03 {
	
	public static void main (String[] args) {
		String pesetas;
		double pesetasEuros = 0.006;
		
		System.out.print("Introduce la cantidad de pesetas que quieres convertir a euros: ");
		pesetas = System.console().readLine();
		double pesetasIntroducidas;
		pesetasIntroducidas = Double.parseDouble( pesetas );
		
		double pesetasConvertidas;
		pesetasConvertidas = pesetasIntroducidas * pesetasEuros;
		
		System.out.print("La cantidad de pesetas introducidas: " + pesetasIntroducidas + " pesetas, se corresponde a " + (String.format("%.3f", pesetasConvertidas)) + "€");
		
	}
}

