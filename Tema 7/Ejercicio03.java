
import java.util.Scanner;


public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce 10 números por teclado y los mostraré al revés");
    System.out.println("---------------------------------------------------------");
    
    int [] num = new int [10];
    int numeroIntroducido;
    
    for (int i = 0; i < 10 ; i++) {
      System.out.print("Introduce el número " + (i + 1) + " de la lista: ");
      numeroIntroducido = read.nextInt();
      num [i] = numeroIntroducido;
    }
    for (int i = 9; i >= 0; i--) {
      System.out.print(num[i] + " ");
    }
  }
  
}
