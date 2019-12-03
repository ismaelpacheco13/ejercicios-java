
import java.util.Scanner;


public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    // Definición de constantes para representar el contenido de las celdas
    
    final int VACIO = 0;
    final int MINA = 1;
    final int TESORO = 2;
    final int INTENTO = 3;
    
    int x;
    int y;
    int[][] cuadrante = new int[5][4];
    
    // Colocación de la mina
    int minaX = (int)(Math.random() * 5);
    int minaY = (int)(Math.random() * 4);
    cuadrante[minaX][minaY] = MINA;
    
    // Colocación del tesoro
    int tesoroX;
    int tesoroY;
    do {
      tesoroX = (int)(Math.random() * 5);
      tesoroY = (int)(Math.random() * 4);
    } while ((minaX == tesoroX) && (minaY == tesoroY));
    cuadrante[tesoroX][tesoroY] = TESORO;
    
    // Inicio del juego
    System.out.println("¡LA BÚSQUEDA DEL TESORO PERDIDO!");
    
    boolean salir = false;
    String c = "";
    
    do {
      // Se pinta el cuadrante
      for (y = 3; y >= 0; y--) {
        System.out.print(y + "|");
        for (x = 0; x < 5; x++) {
          if (cuadrante[x][y] == INTENTO) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println("");
      }
      System.out.println("  ----------\n  0 1 2 3 4\n");
      
      // Se piden las coordenadas
      do {
        System.out.print("Coordenada X: ");
        x = read.nextInt();
      } while (x > 4);
      do {
        System.out.print("Coordenada Y: ");
        y = read.nextInt();
      } while (y > 3);
      
      // Se comprueba el contenido de las coordenadas indicadas por el usuario
      switch(cuadrante[x][y]) {
        case VACIO:
          cuadrante[x][y] = INTENTO;
          if ((Math.abs(x - minaX) < 2) && (Math.abs(y - minaY) < 2)) {
            System.out.println("Cuidado, hay una mina cerca.");
          }
          break;
        case MINA:
          System.out.println("Lo siento, has perdido.");
          salir = true;
          break;
        case TESORO:
          System.out.println("¡Enhorabuena! ¡Encontraste el tesoro!");
          salir = true;
          break;
        default:
      }
    } while (!salir);
    
    // Se pinta el cuadrante con todas las soluciones
    for (y = 3; y >= 0; y--) {
      System.out.print(y + "|");
      for (x = 0; x < 5; x++) {
        switch(cuadrante[x][y]) {
          case VACIO:
            c = "  ";
            break;
          case MINA:
            c = "* ";
            break;
          case TESORO:
            c = "€ ";
            break;
          case INTENTO:
            c = "X ";
            break;
          default:
        }
        System.out.print(c);
      }
      System.out.println("");
    }
    System.out.println("  ----------\n  0 1 2 3 4\n");
  }
  
}
