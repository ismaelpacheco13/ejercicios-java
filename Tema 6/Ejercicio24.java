
import java.util.Scanner;


public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que elige al azar uno de los dígitos de un número introducido por teclado");
    System.out.println("-----------------------------------------------------------------------------------");
    
    System.out.print("Introduce un número entero positivo: ");
    int numeroIntroducido = read.nextInt();
    while (numeroIntroducido <= 0) {
      System.out.println("ERROR: Debe de ser un número mayor que 0");
      System.out.print("Introduce un número entero positivo: ");
      numeroIntroducido = read.nextInt();
    }
    
    int numero = numeroIntroducido;
    int invertido = 0;
    int contadorDigitos = 0;
    
    while (numero > 0) { // Primera inversión para contar los dígitos del número
      invertido = (invertido * 10) + (numero % 10);
      numero /= 10;
      contadorDigitos++;
    }
    
    int digitoAleatorio = (int)((Math.random() * contadorDigitos) + 1);
    numero = invertido;
    int digito = 0;
    
    for (int i = 1; i <= digitoAleatorio; i++) {
      digito = (numero % 10);
      numero /= 10;
    }
    
    System.out.println(digito);
  }
  
}
