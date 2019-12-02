
import java.util.Scanner;


public class Ejercicio16 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [] arrayAleatorio = matematicas.funcionesArray.generaArrayInt(20, 0, 400);
    
    for (int i : arrayAleatorio) {
      System.out.print(i + " ");
    }
    
    System.out.print("\n¿Qué números quiere resaltar? (1 - los múltiplos de 5, 2 - los múltiplos de 7): ");
    int multiploIntroducido = Integer.parseInt(read.nextLine());
    int multiplo = 0;
    
    switch (multiploIntroducido) {
      case 1:
        multiplo = 5;
        break;
      case 2:
        multiplo = 7;
        break;
      default:
    }
    
    for (int i = 0; i < 20; i++) {
      if ((arrayAleatorio[i] % multiplo) == 0) {
        System.out.print("[" + arrayAleatorio[i] + "] ");
      } else {
        System.out.print(arrayAleatorio[i] + " ");
      }
    }
  }
  
}
