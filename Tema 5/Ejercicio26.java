
import java.util.Scanner;


public class Ejercicio26 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número y un dígito de ese número y te diré cual es su posición (empezando desde la izquierda)");
    System.out.println("-------------------------------------------------------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    System.out.print("Introduce el dígito: ");
    int digitoIntroducido = Integer.parseInt(read.nextLine());
    
    int resto;
    int invertido = 0;
    int i = 0;
    
    while (numeroIntroducido > 0 ) {
      resto = numeroIntroducido % 10;
      invertido = ((invertido * 10) + resto);
      numeroIntroducido /= 10;
    }

    do {
      resto = invertido % 10;
      invertido /= 10;
      i++;
    } while (resto != digitoIntroducido);
    
    System.out.println("El dígito introducido ocupa la posición: " + i);
  }
  
}
