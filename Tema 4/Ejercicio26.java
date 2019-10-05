
public class Ejercicio26 {
	
	public static void main (String[] args) {
		
    System.out.println("Calculadora Precio Entrada de Cine");
    System.out.println("-----------------------------------");
    System.out.print("Número de entradas: ");
    int numeroEntradas = Integer.parseInt(System.console().readLine());
    System.out.print("Día de la semana: ");
    String diaSemana = System.console().readLine();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    String tarjetaCampa = System.console().readLine();
    System.out.println("");
    
    // Calculo precio base entradas según día
    
    int entradasIndividuales = numeroEntradas;
    int entradasPareja = 0;
    double precioBaseEntrada = 0;
    double precioBaseEntradaPareja = 11;
    String tipoEntrada = "";
    
    switch (diaSemana.toLowerCase()) {
      case "lunes":
        precioBaseEntrada = 8.00;
        break;
      case "martes":
        precioBaseEntrada = 8.00;
        break;
      case "miércoles":
        precioBaseEntrada = 5.00;
        break;
      case "jueves":
        precioBaseEntrada = 8.00;
        entradasPareja = numeroEntradas / 2;
        entradasIndividuales = numeroEntradas % 2;
        break;
      case "viernes":
        precioBaseEntrada = 8.00;
        break;
      default:
        System.out.println("No existe ese día de la semana");
    }
    
    double totalSinDescuento;
    totalSinDescuento = (precioBaseEntrada * entradasIndividuales) + (precioBaseEntradaPareja * entradasPareja);
    
    // Calculo descuento por tarjeta CineCampa
    
    double descuento = 0;
    
    if (tarjetaCampa.equalsIgnoreCase("s")) {
      descuento = totalSinDescuento * 0.1;
    } else if (tarjetaCampa.equalsIgnoreCase("n")) {
      descuento = descuento;
    }
    
    double total = totalSinDescuento - descuento;
    
    // Salida de la factura por pantalla
    
    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    
    if (entradasPareja > 0) {
      System.out.printf("Entradas de pareja             %2d\n", entradasPareja);
      System.out.printf("Precio por entrada de pareja  %6.2f €\n", precioBaseEntradaPareja);
    }
    
    if (entradasIndividuales > 0) {
      System.out.printf("Entradas individuales %2d\n", entradasIndividuales);
      System.out.printf("Precio por entrada individual %6.2f €\n", precioBaseEntrada);
    }
    
    System.out.printf("Total                         %6.2f €\n", totalSinDescuento);
    System.out.printf("Descuento                     %6.2f €\n", descuento);
    System.out.printf("A pagar                       %6.2f €\n", total);  
    
    
    
	}
}

