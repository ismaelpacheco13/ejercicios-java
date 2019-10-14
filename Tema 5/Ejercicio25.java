
import java.util.Scanner;


public class Ejercicio25 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número y te lo mostraré al revés");
    System.out.println("----------------------------------------------");
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    
    int resto;
    int invertido = 0;
    
    while (numeroIntroducido > 0) {
      resto = numeroIntroducido % 10;
      invertido = ((invertido * 10) + resto);
      numeroIntroducido /= 10;
    }
    System.out.println("El número introducido al revés es: " + invertido);
  }
  
}
