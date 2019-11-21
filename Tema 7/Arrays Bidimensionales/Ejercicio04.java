
import java.util.Scanner;


public class Ejercicio04 {

  public static void main(String[] args) throws InterruptedException {
    Scanner read = new Scanner(System.in);
    
    int [][] num = new int [4][5];
    
    int fila;
    int columna;
    int sumaColumna = 0;
    int sumaTotal = 0;
    int sumaFila = 0;
    
    // Se piden los valores al usuario y se asignan en el array bidimensional
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        num[fila][columna] = (int)((Math.random() * 901) + 100);
      }
    }
    
    // Se pintan los valores en la tabla y las sumas parciales de las filas
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      Thread.sleep(950);
      System.out.printf("|%7d\n", sumaFila);
    }
    
    // Se pintan las sumas parciales de las columnas
    for (columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");
    
    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%7d   ", sumaColumna);
      Thread.sleep(850);
    }
    Thread.sleep(1100);
    System.out.printf("|%7d   ", sumaTotal);
    System.out.println("");
  }
  
}
