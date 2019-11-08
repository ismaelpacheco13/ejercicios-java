
import java.util.Scanner;


public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce 15 números enteros y los avanzaré una posición");
    System.out.println("El ultimo volverá a la primera posición de la lista");
    System.out.println("----------------------------------------------------");
    
    int [] num = new int [15];
    int numeroIntroducido;
    
    for (int i = 0; i < 15; i++) {
      System.out.print("Introduce el número " + (i + 1) + ": ");
      numeroIntroducido = read.nextInt();
      num[i] = numeroIntroducido;
    }
    System.out.print(num[14] + " ");
    for (int i = 0; i < 14; i++) {
      System.out.print(num [i] + " ");
    }
  }
  
}
