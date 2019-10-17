
import java.util.Scanner;


public class Ejercicio34 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce dos números (de igual longitud) y los mezclaré en dos números diferentes con los dígitos pares y con los impares");
    System.out.println("---------------------------------------------------------------------------------------------------------------------------");
    System.out.print("Introduce el primer número: ");
    long numeroIntroducido1 = Long.parseLong(read.nextLine());
    System.out.print("Introduce el segundo número: ");
    long numeroIntroducido2 = Long.parseLong(read.nextLine());
    
    long invertido1 = 0;
    long invertido2 = 0;
    int longitud1 = 0;
    int longitud2 = 0;
    int digito1;
    int digito2;
    long numeroPar = 0;
    long numeroImpar = 0;
    
    if (numeroIntroducido1 == 0) {
      longitud1 = 1;
    }
    
    while (numeroIntroducido1 > 0) {
      invertido1 = ((invertido1 * 10) + (numeroIntroducido1 % 10));
      numeroIntroducido1 /= 10;
      longitud1++;
    }
    
    if (numeroIntroducido2 == 0) {
      longitud2 = 1;
    }
    
    while (numeroIntroducido2 > 0) {
      invertido2 = ((invertido2 * 10) + (numeroIntroducido2 % 10));
      numeroIntroducido2 /= 10;
      longitud2++;
    }
    
    for (int i = 0; ((i < longitud1) && (i < longitud2)); i++) {
      
      if (i < longitud1) { // Lectura primer dígito
        digito1 = (int)invertido1 % 10;
        if ((digito1 % 2) == 0) {
          numeroPar = ((numeroPar * 10) + (digito1 * 10));
        } else {
          numeroImpar = ((numeroImpar * 10) + (digito1 * 10));
        }
        invertido1 /= 10;
      }
      
      if (i < longitud2) { // Lectura segundo dígito
        digito2 = (int)invertido2 % 10;
        if ((digito2 % 2) == 0) {
          numeroPar = ((numeroPar * 10) + (digito2 * 10));
        } else {
          numeroImpar = ((numeroImpar * 10) + (digito2 * 10));
        }
        invertido2 /= 10;
      }
    }
    System.out.println("El número formado por los dígitos pares es: " + numeroPar / 10);
    System.out.println("El número formado por los dígitos impares es: " + numeroImpar / 10);
  }
  
}
