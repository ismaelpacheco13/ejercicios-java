
import java.util.Scanner;


public class Ejercicio05 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce 10 números por teclado y te los mostraré");
    System.out.println("El máximo y el mínimo serán especificados justo al lado del número correspondiente");
    System.out.println("-----------------------------------------------------------------------------------");
    
    int [] num = new int [10];
    int numeroIntroducido;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    
    for (int i = 0; i < 10; i++) { // Bucle para dar valores por teclado al array
      System.out.print("Introduce el número " + (i + 1) + " de la lista: ");
      numeroIntroducido = read.nextInt();
      if (numeroIntroducido > maximo) {
        maximo = numeroIntroducido;
      }
      if (numeroIntroducido < minimo) {
        minimo = numeroIntroducido;
      }
      num[i] = numeroIntroducido;
    }
    System.out.println("");
    for (int i = 0; i < 10; i++) { // Bucle para mostrar los valores introducidos
      if (num[i] == maximo) {
        System.out.print(num[i] + "(máximo) ");
      } else if (num[i] == minimo) {
        System.out.print(num[i] + "(mínimo) ");
      } else {
        System.out.print(num[i] + " ");
      }
    }
  }
  
}
