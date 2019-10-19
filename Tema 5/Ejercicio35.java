
import java.util.Scanner;


public class Ejercicio35 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que pinta una X hecha de asteriscos a partir de una altura 'n'");
    System.out.println("------------------------------------------------------------------------");
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(read.nextLine());
    
    while ((alturaIntroducida < 3) || ((alturaIntroducida % 2) == 0)) {
      System.out.println("ERROR: La altura introducida debe ser un número impar mayor o igual a 3");
      System.out.print("Introduce la altura: ");
      alturaIntroducida = Integer.parseInt(read.nextLine());
    }
    
    int altura = 1;
    int i = 0;
    int espaciosInternos = alturaIntroducida - 1;
    int espaciosPorDelante = 0;
    
    while (altura < ((alturaIntroducida / 2) + 1)) {
      
      // Espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // Pinta la línea de asteriscos
      System.out.print("*");
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      
      System.out.println("");
      altura++;
      espaciosInternos -= 2;
      espaciosPorDelante++;
    } // While de la parte de arriba
    
    // Parte de abajo
    espaciosInternos = 0;
    espaciosPorDelante = alturaIntroducida / 2;
    altura = 1;
    
    while (altura <= alturaIntroducida / 2 + 1) {
        
      // Espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
        
      // Pinta la línea de asteriscos
      System.out.print("*");
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
        
      if(altura>1) {
        System.out.print("*");
      }
        
      System.out.println();
      altura++;
      espaciosPorDelante--;
      espaciosInternos+=2;
    } // While de la parte de abajo
  }
}
