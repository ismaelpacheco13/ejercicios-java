
import java.util.Scanner;


public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [] num = new int [100];
    int numeroAleatorio;
    int contadorLinea = 0;
    String verde = "\033[32m";
    String blanco = "\033[37m";
    
    for (int i = 0; i < 100; i++) {
      numeroAleatorio = (int)(Math.random() * 21);
      num[i] = numeroAleatorio;
      if (contadorLinea >= 20) {
        System.out.println("");
        System.out.print(num[i] + " ");
        contadorLinea = 0;
      } else {
        System.out.print(num[i] + " ");
      }
      contadorLinea++;
    }
    
    System.out.println("");
    System.out.print("Introduce un número que haya aparecido en la lista: ");
    int numeroIntroducido = read.nextInt();
    System.out.print("Introduce el número con el que lo quieres reemplazar: ");
    int numeroReemplazo = read.nextInt();
    
    for (int i = 0; i < 100; i++) {
      if (contadorLinea >= 20) {
        System.out.println("");
        if (num[i] == numeroIntroducido) {
          num[i] = numeroReemplazo;
          System.out.print(verde + "\"" + num[i] + "\" ");
          contadorLinea = 0;
        } else {
          System.out.print(blanco + num[i] + " ");
          contadorLinea = 0;
        }
      } else {
        if (num[i] == numeroIntroducido) {
          num[i] = numeroReemplazo;
          System.out.print(verde + "\"" + num[i] + "\" ");
        } else {
          System.out.print(blanco + num[i] + " ");
        }
      }
      contadorLinea++;
    }
    
    System.out.println("");
  }
  
}
