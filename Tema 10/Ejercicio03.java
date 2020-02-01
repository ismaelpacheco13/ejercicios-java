
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ejercicio03 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    ArrayList<Integer> numero = new ArrayList<>();
    
    int cantidad = 0;
    
    do {
      System.out.print("Introduce un número: ");
      numero.add(Integer.parseInt(read.nextLine()));
      cantidad++;
    } while (cantidad < 10);
    
    System.out.println("\nLista de números sin ordenar");
    
    for (Integer integer : numero) {
      System.out.print(integer + " ");
    }
    
    System.out.println("\nLista de números ordenada");
    Collections.sort(numero);
    
    for (Integer integer : numero) {
      System.out.print(integer + " ");
    }
  }
  
}
