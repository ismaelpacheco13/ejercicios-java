
public class Ejercicio25 {
	
	public static void main (String[] args) {
		
    // Presentación programa y entrada de datos
    System.out.println("Calculadora Precio BanderaDeEspaña.es");
    System.out.println("--------------------------------------");
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int alturaBandera = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura: ");
    int anchuraBandera = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere escudo bordado (s/n): ");
    String siNo = System.console().readLine();
    
    String escudo = "";
    float precioEscudo = 0;
    
    if (siNo.equalsIgnoreCase("s")) {
      precioEscudo = 2.50f;
      escudo = "Con escudo";
    } else if (siNo.equalsIgnoreCase("n")) {
      precioEscudo = precioEscudo;
      escudo = "Sin escudo";
    }
    
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.println("");
    System.out.printf("Bandera de %5d cm²: %6.2f €\n", alturaBandera * anchuraBandera, (float) anchuraBandera * alturaBandera / 100);
    System.out.printf("%s:           %6.2f €\n", escudo, precioEscudo);
    System.out.printf("Gastos de envío:      %6.2f €\n", 3.25);
    System.out.printf("Total:                %6.2f €\n", (float)anchuraBandera * alturaBandera / 100 + precioEscudo + 3.25);
    
	}
}

