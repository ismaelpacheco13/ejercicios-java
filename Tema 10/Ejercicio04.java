
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ejercicio04 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    ArrayList<String> palabra = new ArrayList<>();
    
    int cantidad = 0;
    
    do {
      System.out.print("Introduce una palabra: ");
      palabra.add(read.nextLine());
      cantidad++;
    } while (cantidad < 10);
    
    System.out.println("\nLista de palabras sin ordenar");
    
    for (String string : palabra) {
      System.out.print(string + " ");
    }
    
    System.out.println("\nLista de palabras ordenada");
    Collections.sort(palabra);
    
    for (String string : palabra) {
      System.out.print(string + " ");
    }
  }
  
}
