
package Ejercicio02;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    Gato[] gato = new Gato[4];
    
    gato[0] = new Gato("Cuqui", "Negro manchas blancas/amarillas", "Europeo");
    gato[1] = new Gato("Per", "Naranja", "Persa");
    gato[2] = new Gato("Chus", "Anaranjado", "Chausie");
    gato[3] = new Gato("Tonki", "Grisáceo", "Tonkinés");
    
    System.out.println("\nDatos de los gatos.");
    
    for (int i = 0; i < 4; i++) {
      System.out.println("\nGato nº " + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
    }
  }
  
}
