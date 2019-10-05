

public class Ejercicio27 {
	
	public static void main (String[] args) {
		
    // Introducción programa y entrada de datos
    System.out.println("Calculadora precio TartaLandia.es");
    System.out.println("----------------------------------");
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String saborTarta = System.console().readLine();
    
    // Calculo precio según tipo de tarta
    
    double precioTarta = 0;
    String tipoTarta = "";
    
    if (saborTarta.equalsIgnoreCase("manzana")) { //tarta manzana
      precioTarta = 18;
      tipoTarta = "manzana";
    } else if (saborTarta.equalsIgnoreCase("fresa")) { //tarta fresa
      precioTarta = 16;
      tipoTarta = "fresa";
    } else if (saborTarta.equalsIgnoreCase("chocolate")) { //tarta chocolate
      System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
      String chocolateTarta = System.console().readLine();
        if (chocolateTarta.equalsIgnoreCase("negro")) { //tarta chocolate (negro)
          precioTarta = 14;
          tipoTarta = "chocolate negro";
        } else if (chocolateTarta.equalsIgnoreCase("blanco")) { //tarta chocolate (blanco)
          precioTarta = 15;
          tipoTarta = "chocolate blanco";
        }
    }
    
    System.out.print("¿Quiere nata? (si o no): ");
    String nataTarta = System.console().readLine();
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    String nombreTarta = System.console().readLine();
    System.out.println("");
    
    // Suma de precio de los complementos (nataTarta y nombreTarta)
    
    double sumaNataTarta = 0;
    double sumaNombreTarta = 0;
    String nata = "";
    String nombre = "";
    
    if (nataTarta.equalsIgnoreCase("si")) { //Nata si
      sumaNataTarta = 2.50;
      nata = "Con nata";
    } else if (nataTarta.equalsIgnoreCase("no")) { //Nata no
      sumaNataTarta = sumaNataTarta;
      nata = "Sin nata";
    }
    
    if (nombreTarta.equalsIgnoreCase("si")) { //Nombre si
      sumaNombreTarta = 2.75;
      nombre = "Con nombre";
    } else if (nombreTarta.equalsIgnoreCase("no")) { //Nombre no
      sumaNombreTarta = sumaNombreTarta;
      nombre = "Sin nombre";
    }
    
    // Calculo precio final
    
    double precioFinal = precioTarta + sumaNataTarta + sumaNombreTarta;
    
    // Salida de la factura a pantalla
    
    System.out.printf("Tarta de %s:    %6.2f €\n", tipoTarta, precioTarta);
    System.out.printf("%s:          %6.2f €\n", nata, sumaNataTarta);
    System.out.printf("%s:        %6.2f €\n", nombre, sumaNombreTarta);
    System.out.println("");
    System.out.printf("Total:             %6.2f €\n", precioFinal);
    
	}
}

