
import java.util.Scanner;


public class Ejercicio20 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.print("Introduzca el número total de reyes: ");
    int numeroTotalReyes = Integer.parseInt(read.nextLine());
    System.out.println("Vaya introduciendo los nombres de los reyes: ");
    String[] nombresDeReyes = new String[numeroTotalReyes];
    
    for (int i = 0; i < numeroTotalReyes; i++) {
      nombresDeReyes[i] = read.nextLine();
    }
    
    System.out.println("");
    
    for (int i = 0; i < numeroTotalReyes; i++) {
      int numeroDeRey = 1;
      String nombreActual = nombresDeReyes[i];
      
      for (int j = 0; j < i; j++) {
        if (nombreActual.equals(nombresDeReyes[j])) {
          numeroDeRey++;
        }
      }
      System.out.println(nombresDeReyes[i] + " " + numeroDeRey + "º");
    }
  }
  
}
