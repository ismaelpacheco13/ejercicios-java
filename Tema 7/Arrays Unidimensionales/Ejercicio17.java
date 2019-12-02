
import java.util.Scanner;


public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [] arrayAleatorio = matematicas.funcionesArray.generaArrayInt(10, 0, 100);
    
    System.out.println("Array original: \n");
    System.out.print("Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    System.out.print("Valor  ");
    for (int i : arrayAleatorio) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    
    int numeroIntroducido;
    do {
      System.out.print("\nIntroduce un número que este dentro del array: ");
      numeroIntroducido = Integer.parseInt(read.nextLine());
    } while ((matematicas.funcionesArray.estaEnArrayInt(arrayAleatorio, numeroIntroducido)) == false);
    
    // Rota los números del array hasta que el número introducido se coloque en la posición 0
    while (arrayAleatorio[0] != numeroIntroducido) {
      int aux = arrayAleatorio[9];
      // Rotación a la derecha
      for (int i = 9; i > 0; i--) {
        arrayAleatorio[i] = arrayAleatorio[i -1];
      }
      arrayAleatorio[0] = aux;
    }
    
    System.out.println("\nArray resultado: \n");
    System.out.print("Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    System.out.print("Valor  ");
    for (int i : arrayAleatorio) {
      System.out.printf("%5d", i);
    }
  }
  
}
