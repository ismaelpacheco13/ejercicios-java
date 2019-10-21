
import java.util.Scanner;


public class Ejercicio41 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que calcula cuántos dígitos pares e impares hay en un número introducido por teclado");
    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    long numeroIntroducido = Long.parseLong(read.nextLine());
    
    long numero = numeroIntroducido;
    int digito;
    int contadorPares = 0;
    int contadorImpares = 0;
    
    while (numero > 0) {
      digito = (int)numero % 10;
      numero /= 10;
      if ((digito % 2) == 0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }
    }
    System.out.println("El " + numeroIntroducido + " contiene " + contadorPares + " dígitos pares y " + contadorImpares + " dígitos impares.");
  }
  
}
