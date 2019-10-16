
import java.util.Scanner;


public class Ejercicio31 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número 'n' que será la altura de la letra 'L'");
    System.out.println("-----------------------------------------------------------");
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(read.nextLine());
    
    int baseL = 1;
    
    for (int i = 1; i <= alturaIntroducida; i++) {
      if (i < alturaIntroducida) {
      System.out.println("*");
      } if (i == alturaIntroducida) {
        baseL = ((alturaIntroducida / 2) + 1);
        for (int j = 1; j <= baseL; j++) {
          System.out.print("* ");
        }
       }
      }
    System.out.println("");
    }
    
  
}
