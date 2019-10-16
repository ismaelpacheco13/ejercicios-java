
import java.util.Scanner;


public class Ejercicio32 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número y te sacaré en orden todos sus dígitos pares y la suma de ellos");
    System.out.println("------------------------------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    long numeroIntroducido = Long.parseLong(read.nextLine());
    
    long numero = numeroIntroducido;
    long resto;
    long invertido = 0;
    int sumaResto = 0;
    int longitud = 0;
    int digito;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      resto = numero % 10;
      invertido = ((invertido * 10) + resto);
      numero /= 10;
      longitud ++;
    }
    
    for (int i = 0; i < longitud; i++) {
        
        digito = (int)(invertido % 10);
        
        if ((digito % 2) == 0) {
          System.out.print(digito + " ");
          sumaResto += digito;
        }
        invertido /= 10;
      }

    System.out.println("");
    System.out.println("La suma de los dígitos pares es: " + sumaResto);
  }
  
}
