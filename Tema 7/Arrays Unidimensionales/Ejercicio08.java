
import java.util.Scanner;


public class Ejercicio08 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Diagrama de barras de la temperatura media de cada mes de un determinado año");
    System.out.println("-----------------------------------------------------------------------------");
    
    String [] mes = {
      "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    int [] temperatura = new int [12];
    
    for (int i = 0; i < 12; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
      temperatura [i] = read.nextInt();
    }
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%12s" + " |", mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("▄");
      }
      System.out.println(" " + temperatura[i] + "ºC");
    }
  }
  
}
