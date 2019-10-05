
public class Ejercicio29 {
	
	public static void main (String[] args) {
		
    // Introducción programa y entrada de datos
    System.out.println("Calculadora Precio Desayunode100");
    System.out.println("---------------------------------");
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = System.console().readLine();
    String tipoPitufo = "";
    
    if (comida.equalsIgnoreCase("pitufo")) {
      System.out.print("¿Con que se ha tomado el pitufo (aceite o tortilla)?: ");
      tipoPitufo = System.console().readLine();
    }
    
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida = System.console().readLine();
    System.out.println("");
    
    // Calculo precios
    
    //Comidas
    double precioPalmera = 1.40;
    double precioDonut = 1;
    double precioPitufo = 0;
    
    if (tipoPitufo.equalsIgnoreCase("aceite")) { //Precio pitufo aceite
      precioPitufo = 1.20;
    } else if (tipoPitufo.equalsIgnoreCase("tortilla")) { // Precio pitufo tortilla
      precioPitufo = 1.60;
    }
    
    //Bebidas
    double precioCafe = 1.20;
    double precioZumo = 1.50;
    
    
    // Salida a pantalla
    
    String comidaPantalla = "";
    String bebidaPantalla = "";
    double precioComida = 0;
    double precioBebida = 0;
    
    // Salida a pantalla (Comidas)
    
    if (comida.equalsIgnoreCase("palmera")) {
      precioComida = precioPalmera;
      comidaPantalla = "Palmera";
    } else if (comida.equalsIgnoreCase("donut")) {
      precioComida = precioDonut;
      comidaPantalla = "Donut";
    } else if (comida.equalsIgnoreCase("pitufo")) {
        if (tipoPitufo.equalsIgnoreCase("tortilla")) {
          precioComida = precioPitufo;
          comidaPantalla = "Pitufo con tortilla";
        } else if (tipoPitufo.equalsIgnoreCase("aceite")) {
          precioComida = precioPitufo;
          comidaPantalla = "Pitufo con aceite";
        }
    }
    
    System.out.printf("%s:   %6.2f €\n", comidaPantalla, precioComida);
    
    // Salida a pantalla (Bebidas)
    
    if (bebida.equalsIgnoreCase("zumo")) {
      precioBebida = precioZumo;
      bebidaPantalla = "Zumo";
    } else if (bebida.equalsIgnoreCase("café")) {
      precioBebida = precioCafe;
      bebidaPantalla = "Café";
    }
      
    System.out.printf("%s:                  %6.2f €\n", bebidaPantalla, precioBebida);
    
    // Salida a pantalla (total)
    
    double total = precioComida + precioBebida;
    
    System.out.println("-----------------------------");
    System.out.printf("Total desayuno:        %6.2f €\n", total);
    
	}
}

