
public class Ejercicio20 {
	
	public static void main (String[] args) {
		
    System.out.println("Programa que pinta una pirámide hueca dada la altura y el carácter de contorno");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el carácter de contorno: ");
    String contorno = System.console().readLine();
    
    int altura = 1;
    int i = 0;
    int espaciosDelante = alturaIntroducida - 1;
    int espaciosRelleno = 0;
    
    while (altura < alturaIntroducida) {
      // Espacios delante
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      
      // Pinta la línea
      System.out.print(contorno);
      for (i = 1; i < espaciosRelleno; i++) {
        System.out.print(" ");
      }
      
      if (altura > 1) {
        System.out.print(contorno);
      }
      
      System.out.println("");
      
      altura++;
      espaciosDelante--;
      espaciosRelleno += 2;
    }
      
    // Base de la pirámide
    for (i = 1; i < altura*2; i++) {
      System.out.print(contorno);
    }
	}
}

