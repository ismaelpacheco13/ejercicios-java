
import java.util.Scanner;


public class Ejercicio27 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Introduce un número y te mostraré todos los múltiplos de 3 entre 1 y ese número");
    System.out.println("--------------------------------------------------------------------------------");
    System.out.print("Introduce el número: ");
    int numeroIntroducido = Integer.parseInt(read.nextLine());
    
    int multiploTres;
    int contador = 0;
    int suma = 0;
    
    for (int i = 1; i <= numeroIntroducido; i++) {
      multiploTres = i % 3;
      if (multiploTres == 0) {
        System.out.print(i + " ");
        contador++;
        suma += i;
      }
    }
    System.out.println("");
    System.out.println("En el intervalo del 1 al " + numeroIntroducido + " hay exactamente '" + contador + "' múltiplos de tres");
    System.out.println("La suma de todos ellos da la cifra: " + suma);
  }
}
