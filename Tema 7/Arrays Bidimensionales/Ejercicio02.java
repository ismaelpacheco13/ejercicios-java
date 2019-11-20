
import java.util.Scanner;


public class Ejercicio02 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [][] num = new int [4][5];
    
    int fila;
    int columna;
    int numeroIntroducido;
    int sumaColumna = 0;
    int sumaTotal = 0;
    int sumaFila = 0;
    
    // Se piden los valores al usuario y se asignan en el array bidimensional
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.print("Introduce el número de la columna " + columna + ", fila " + fila + ": ");
        numeroIntroducido = read.nextInt();
        num[fila][columna] = numeroIntroducido;
      }
    }
    
    // Se pintan los valores en la tabla y las sumas parciales de las filas
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%7d   ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
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
    }
    System.out.printf("|%7d   ", sumaTotal);
    System.out.println("");
  }
  
}
