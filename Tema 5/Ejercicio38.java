
import java.util.Scanner;


public class Ejercicio38 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que pinta un reloj de arena a partir de una altura 'n' (numero impar mayor o igual a 3)");
    System.out.println("----------------------------------------------------------------");
    System.out.print("Introduce la altura: ");
    int alturaIntroducida = Integer.parseInt(read.nextLine());
    
    while ((alturaIntroducida < 3) || ((alturaIntroducida % 2) == 0)) {
      System.out.println("ERROR: La altura debe ser un número impar mayor o igual a 3");
      System.out.print("Introduce la altura: ");
      alturaIntroducida = Integer.parseInt(read.nextLine());
    }
    
    int altura = 1;
    int linea = alturaIntroducida;
    int i = 0;
    int espaciosDelante = 0;
    
    // Parte de arriba
    while (altura <= (alturaIntroducida / 2)) {
      // Espacios delante
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      
      // Pinta la línea
      for (i = 1; i <= linea; i++) {
        System.out.print("*");
      }
      
      System.out.println("");
      altura++;
      espaciosDelante++;
      linea -= 2;
    }
    
    // Parte de abajo
    altura = ((alturaIntroducida / 2) + 1);
    espaciosDelante = (alturaIntroducida / 2);
    
    while (altura <= alturaIntroducida) {
      // Espacios delante
      for (i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }
      
      // Pinta la línea
      for (i = 1; i <= linea; i++) {
        System.out.print("*");
      }
      
      System.out.println("");
      altura++;
      espaciosDelante--;
      linea += 2;
    }
    
  }
  
}
