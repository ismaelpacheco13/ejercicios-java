
import java.util.Scanner;


public class Ejercicio11 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    boolean esPrimo;
    int [] num = new int [10];
    int [] primo = new int [10];
    int [] noPrimo = new int [10];
    int primos = 0;
    int noPrimos = 0;
    
    // Pide los 10 números al usuario
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce el número: ");
      num[i] = read.nextInt();
      esPrimo = true;
      // Calcula si el número es primo o no
      for (int j = 2; j < num[i]; j++) {
        if (((num[i] % i) == 0) || (num[i] <= 1)) { // no entiendo porque aun así sigue metiendo el 0 y el 1 como primos
          esPrimo = false;
        }
      }
      // Asigna al array correspondiente (primo o no primo) el número
      if (esPrimo) {
        primo[primos++] = num[i];
      } else {
        noPrimo[noPrimos++] = num[i];
      }
    }
    
    System.out.println("");
    System.out.println("Array original: ");
    // Pinta el array original
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("  Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.printf("  Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    // Se meten los primos en las primeras posiciones del array original
    for (int i = 0; i < primos; i++) {
      num[i] = primo[i];
    }
    
    // Se meten los NO primos detras de los primos
    for (int i = primos; i < primos + noPrimos; i++) {
      num[i] = noPrimo[i - primos];
    }
    System.out.println("");
    System.out.println("Array modificado con primos delante y no primos detras: ");
    // Pinta el array modificado con primos delante y no primos detras
    System.out.println("┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("  Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", i);
    }
    System.out.println("\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.printf("  Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("|%4d ", num[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
  
}
