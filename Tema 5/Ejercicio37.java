
import java.util.Scanner;


public class Ejercicio37 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que convierte números (enteros) del sistema decimal al sistema de palotes");
    System.out.println("-----------------------------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    
    int numero = numeroIntroducido;
    int invertido = 0;
    int invertido2 = 0;
    
    while (numero > 0) { // Primera inversión del número
      invertido = (invertido * 10) + (numero % 10);
      numero /= 10;
    }
    
    System.out.print("El " + numeroIntroducido + " en decimal es el ");
    
    while (invertido > 0) { // Inversión del invertido y cambio al sistema de palotes
      for (int i = 0; i < invertido % 10; i++) {
        System.out.print("| ");
      }
      System.out.print("- ");
      invertido2 = (invertido2 * 10) + (invertido % 10);
      invertido /= 10;
    }
    System.out.println("en el sistema de palotes.");
  }
  
}
