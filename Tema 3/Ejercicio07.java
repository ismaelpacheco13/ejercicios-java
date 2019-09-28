
public class Ejercicio07 {
	
	public static void main (String[] args) {
		String baseImponible;
		
		System.out.print("Introduzca la base imponible del producto: ");
		baseImponible = System.console().readLine();
		double baseImponibleIntroducida;
		baseImponibleIntroducida = Double.parseDouble( baseImponible );
		
		double ivaProducto;
		ivaProducto = baseImponibleIntroducida * 0.21;
		double productoConIva;
		productoConIva = baseImponibleIntroducida + ivaProducto;
		
		System.out.print("El precio de su producto tras sumarle el iva es de: " + (String.format("%.2f", productoConIva)) + "€");
	}
}

