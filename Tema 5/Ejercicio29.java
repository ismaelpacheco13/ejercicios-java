
import java.util.Scanner;


public class Ejercicio29 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce dos números y te mostraré todos aquellos positivos menores al primer número que no sean divisibles por el segundo");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    System.out.print("Introduce el primer número: ");
    int primerNumero = Integer.parseInt(read.nextLine());
    System.out.print("Introduce el segundo número: ");
    int segundoNumero = Integer.parseInt(read.nextLine());
    
    for (int i = 0; i < primerNumero; i++) {
      if ((i % segundoNumero) != 0) {
        System.out.print(i + " ");
      }
    }
  }
}
