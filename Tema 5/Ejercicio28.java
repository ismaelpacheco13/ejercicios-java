
import java.util.Scanner;


public class Ejercicio28 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número y te mostraremos el factorial de ese número");
    System.out.println("----------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    
    int j = 1;
    int multiplicacion = 0;
    
    for (int i = 2; i <= numeroIntroducido; i++) {
      multiplicacion = (j*i);
      j = multiplicacion;
    }
    System.out.println("El factorial de " + numeroIntroducido + " es " + multiplicacion);
  }
  
}
