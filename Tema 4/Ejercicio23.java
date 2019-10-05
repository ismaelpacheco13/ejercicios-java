
public class Ejercicio23 {
	
	public static void main (String[] args) {
		
    // Introducción programa y entrada de datos de la factura
    System.out.println("Programa para calcular el precio final de un producto según la base imponible");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.print("Introduzca la base imponible: ");
    double baseImpo = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el tipo de IVA (general (21%), reducido (10%), o superreducido (4%): ");
    String iva = System.console().readLine();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = System.console().readLine();
    System.out.println("");
    
    int IVAnume = 0;
    
    // Calculo de IVA
    switch (iva.toLowerCase()) {
      case "general":
        IVAnume = 21;
        break;
      case "reducido":
        IVAnume = 10;
        break;
      case "superreducido":
        IVAnume = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no existe.");
    }
    
    double ivaCalc = baseImpo * IVAnume / 100;
    double precioSinDescuento = baseImpo + ivaCalc;
    
    // Calculo del descuento
    
    double descuento = 0;
    
    switch (codigo.toLowerCase()) {
      case "nopro":
        break;
      case "mitad":
        descuento = precioSinDescuento / 2;
        break;
      case "meno5":
        descuento = precioSinDescuento - 5;
        break;
      case "5porc":
        descuento = precioSinDescuento * 0.05;
        break;
      default:
        System.out.println("El código promocional introducido no existe.");
    }
    
    // Generación factura
    
    double total = precioSinDescuento - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", baseImpo);
    System.out.printf("IVA (%2d%%)            %6.2f\n", IVAnume, ivaCalc);
    System.out.printf("Precio con IVA       %6.2f\n", precioSinDescuento);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", codigo, descuento);
    System.out.printf("TOTAL                %6.2f", total);
      
	}
}

