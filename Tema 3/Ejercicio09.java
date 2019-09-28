
public class Ejercicio09 {
	
	public static void main (String[] args) {
		String radioCono;
		String alturaCono;
		double numeroPi = 3.1416;
		
		System.out.print("Introduzca el valor en cm del radio del cono: ");
		radioCono = System.console().readLine();
		double radioConoIntroducido;
		radioConoIntroducido = Double.parseDouble( radioCono );
		
		System.out.print("Introduzca el valor en cm de la altura del cono: ");
		alturaCono = System.console().readLine();
		double alturaConoIntroducida;
		alturaConoIntroducida = Double.parseDouble( alturaCono );
		
		double volumenCono;
		volumenCono = (numeroPi * (Math.pow(radioConoIntroducido, 2)) * alturaConoIntroducida) / 3;
		
		System.out.print("El volumen del cono es de: " + (String.format("%.2f", volumenCono)) + " cm³");
	}
}

