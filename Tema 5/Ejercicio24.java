
import java.util.Scanner;


public class Ejercicio24 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número n para mostrarte una pirámide de números de n filas");
    System.out.println("------------------------------------------------------------------------");
    System.out.print("Introduce el número 'n': ");
    int nAltura = Integer.parseInt(read.nextLine());
    
    int espaciosDelante = nAltura - 1;
    int relleno = 1;
    int altura = 1;
    int i = 0;
    
    while (altura <= nAltura) {
      
      // Espacios delante
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      
      // Líneas de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println("");
      
      altura ++;
      espaciosDelante--;
    }
  }
  
}
