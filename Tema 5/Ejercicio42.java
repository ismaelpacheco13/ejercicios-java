
import java.util.Scanner;


public class Ejercicio42 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que muestra los 5 números consecutivos al introducido y dice si son primos o no");
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    
    boolean esPrimo;
    int i = 0;
    
    for (i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      esPrimo = true;
      for (int j = 2; j < i; j++) {
        if ((i % j) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        System.out.println(i + " es primo");
      } else {
        System.out.println(i + " no es primo");
      }
    }
  }
  
}
