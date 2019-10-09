
public class Ejercicio07 {
	
	public static void main (String[] args) {
		
    System.out.println("Control de acceso a caja fuerte");
    System.out.println("--------------------------------");
    
    int combinacion = 8369;
    int i = 4;
    int combinacionIntroducida;
    
    do {
      System.out.print("Escribe la combinación de 4 cifras para abrir la caja fuerte: ");
      combinacionIntroducida = Integer.parseInt(System.console().readLine());
      
      if (combinacionIntroducida == combinacion) {
        System.out.print("La caja fuerte se ha abierto satisfactoriamente.");
      } else {
        System.out.println("Lo siento, esa no es la combinación.");
        i --;
        System.out.println("Te quedan " + i + " oportunidades.");
        System.out.println("");
      }
    } while ((combinacion != combinacionIntroducida) && (i > 0));
	}
}

