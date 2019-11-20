
import java.util.Scanner;


public class Ejercicio12 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [] num = new int [10];
    int numeroIntroducido;
    
    // Pide al usuario los 10 números y los introduce en el array
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un número: ");
      numeroIntroducido = read.nextInt();
      num[i] = numeroIntroducido;
    }
    
    // Pinta el array original
    System.out.println("");
    System.out.println("Array original: ");
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
    
    // Se pide al usuario la posición inicial y la posición final
    System.out.print("Introduce la posición inicial: ");
    int posicionInicial = read.nextInt();
    System.out.print("Introduce la posición final: ");
    int posicionFinal = read.nextInt();
    // Bucle en el caso de que el usuario introduzca una posición inicial mayor que la final
    while (posicionInicial > posicionFinal) {
      System.out.println("ERROR: La posición inicial debe de ser menor que la final");
      System.out.println("");
      System.out.print("Introduce la posición inicial: ");
      posicionInicial = read.nextInt();
      System.out.print("Introduce la posición final: ");
      posicionFinal = read.nextInt();
    }
    
    // Se introduce el número de la posición inicial en la posición final y se rotan el resto de números
    // Introduzco el número de la inicial en la final
    int [] resultado = new int [10];
    int numeroPosicionFinal = num[posicionFinal];
    num[posicionFinal] = num[posicionInicial];
    // Copiamos el array original en el array resultado
    for (int i = 0; i < 10; i++) {
      resultado[i] = num[i];
    }
    
    resultado[posicionFinal] = num[posicionInicial];
    
    for (int i = posicionFinal + 1; i < 10; i++) {
      num[i] = num [i - 1];
    }
    
    // Pinta el array modificado
    System.out.println("");
    System.out.println("Array modificado: ");
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
