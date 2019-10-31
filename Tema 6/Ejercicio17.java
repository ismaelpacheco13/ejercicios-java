
import java.util.Scanner;


public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que pinta una pecera con un pececito aleatorio dentro");
    System.out.println("---------------------------------------------------------------");
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alturaIntroducida = read.nextInt();
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchuraIntroducida = read.nextInt();
    
    int espaciosRelleno = anchuraIntroducida - 2;
    int yAleatoria = (int)((Math.random() * alturaIntroducida) + 1);
    int xAleatoria = (int)((Math.random() * anchuraIntroducida) + 1);
    
    // Pinta el techo
    for (int i = 1; i <= anchuraIntroducida; i++) {
      System.out.print(" *");
    }
    System.out.println("");
    // Pinta las paredes y el relleno
    for (int i = 1; i <= alturaIntroducida - 2; i++) {
      System.out.print(" *");
      for (int j = 1; j <= espaciosRelleno; j++) {
        if ((i != yAleatoria) && (j != xAleatoria)) {
          System.out.print("  ");
        } else {
          System.out.print(" &");
        }
      }
      System.out.print(" *");
      System.out.println("");
    }
    for (int i = 1; i <= anchuraIntroducida; i++) {
      System.out.print(" *");
    }
    System.out.println("");
  }
  
}
