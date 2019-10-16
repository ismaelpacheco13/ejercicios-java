
import java.util.Scanner;


public class Ejercicio33 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que pinta una U a partir de introducir la altura 'n'");
    System.out.println("--------------------------------------------------------------");
    System.out.print("Introduce la altura (n): ");
    int alturaIntroducida = Integer.parseInt(read.nextLine());
    
    int altura = alturaIntroducida;
    int espacios = altura;
    int i = 1;
    
    while (i < altura) {
      System.out.print("* ");
      for (int j = 2; j < espacios; j++) {
        System.out.print("  ");
      }
      System.out.println("*");
      i++;
    }
    System.out.print("  ");
    for (int j = 2; j < espacios; j++) {
        System.out.print("* ");
    }
    System.out.println("");
  }
  
}
