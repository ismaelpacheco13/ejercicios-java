
import java.util.Scanner;


public class Ejercicio09 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce 8 números enteros y te diré si son pares o impares");
    System.out.println("-------------------------------------------------------------");
    
    int [] num = new int [8];
    int numeroIntroducido;
    
    for (int i = 0; i < 8; i++) {
      System.out.print((i + 1) + ".- Introduce el número: ");
      numeroIntroducido = read.nextInt();
      num[i] = numeroIntroducido;
    }
    System.out.println("");
    for (int i = 0; i < 8; i++) {
      if ((num[i] % 2) == 0) {
        System.out.println(num[i] + " (par)");
      } else {
        System.out.println(num[i] + " (impar)");
      }
    }
  }
  
}
