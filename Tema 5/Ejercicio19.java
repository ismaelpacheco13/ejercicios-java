
public class Ejercicio19 {
	
	public static void main (String[] args) {
		
    System.out.println("Programa que pinta una pirámide dada la altura y el carácter de relleno");
    System.out.println("------------------------------------------------------------------------");
    
    int altura = 0;
    String caracter = "";
    
    // Bucle de pedir datos mientras que la altura sea menor o igual a 0
    do {
      System.out.print("Introduce la altura: ");
      altura = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el carácter de relleno: ");
      caracter = System.console().readLine();
      if (altura <= 0) {
        System.out.println("La altura no puede ser menor o igual a 0");
        System.out.println("");
      }
    } while (altura <= 0);
  
    int espacios = altura-1;
    int longitudLinea = 1;
    int planta = 1;
    
    while (planta <= altura) {
      // Espacios
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
    
      // Pinta la línea
      for (int i = 1; i <= longitudLinea; i++) {
        System.out.print(caracter);
      }
    
      System.out.println("");
    
      planta++;
      espacios--;
      longitudLinea += 2;
    }
	}
}

