
import java.util.Scanner;


public class Ejercicio36 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que determina si un número es capicúa o no");
    System.out.println("----------------------------------------------------");
    System.out.print("Introduce el número: ");
    long numeroIntroducido = Long.parseLong(read.nextLine());
    
    long numero = numeroIntroducido;
    long invertido = 0;
    
    while (numero > 0) {
      invertido = (invertido * 10) + (numero % 10);
      numero /= 10;
    }
    if (numeroIntroducido == invertido) {
      System.out.println("El " + numeroIntroducido + " es capicúa");
    } else {
      System.out.println("El " + numeroIntroducido + " no es capicúa");
    }
  }
  
}
