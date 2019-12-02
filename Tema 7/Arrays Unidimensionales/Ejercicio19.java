
import java.util.Scanner;


public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que inserta un número en una posición concreta de un array");
    System.out.println("--------------------------------------------------------------------");
    
    int [] arrayAleatorio = matematicas.funcionesArray.generaArrayInt(12, 0, 200);
    
    System.out.println("Array original: \n");
    System.out.print("Índice ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    System.out.print("Valor  ");
    for (int i : arrayAleatorio) {
      System.out.printf("%5d", i);
    }
    
    System.out.print("\nIntroduzca el número que quiere insertar: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    System.out.print("Introduzca la posición donde lo quiere insertar (0-11): ");
    int posicionIntroducida = Integer.parseInt(read.nextLine());

    for (int i = 11; i > posicionIntroducida; i--) {
      arrayAleatorio[i] = arrayAleatorio[i - 1];
    }
    arrayAleatorio[posicionIntroducida] = numeroIntroducido;
    
    System.out.println("\nArray resultado: \n");
    System.out.print("Índice ");
    for (int i = 0; i < 12; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    System.out.print("Valor  ");
    for (int i : arrayAleatorio) {
      System.out.printf("%5d", i);
    }
  }
  
}
