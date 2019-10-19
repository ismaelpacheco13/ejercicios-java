
import java.util.Scanner;


public class Ejercicio39 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que calcula el factorial en un intervalo desde el 1 hasta el número introducido");
    System.out.println("-------------------------------------------------------------------------");
    System.out.print("Introduce el número máximo del intervalo: ");
    int numeroMaximo = Integer.parseInt(read.nextLine());
    System.out.println("");
    
    int factorial = 1;
    
    for (int i = 1; i <= numeroMaximo; i++) { 
      for (int j = i; j <= i; j++) {
        factorial *= j;
      }
      System.out.println(i + "! = " + factorial);
    }
  }
  
}
