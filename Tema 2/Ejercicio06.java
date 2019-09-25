
public class Ejercicio06 {
	
	public static void main (String[] args) {
		double base = 525.34;
		double iva = 0.21;
		double ivaproducto = (base*iva);
		
		System.out.print("El total de su producto comprado valorado en " + base + " es de " + (String.format("%.2f" ,ivaproducto+base)) + "€ tras sumarle el IVA del 21%");
	}
}

