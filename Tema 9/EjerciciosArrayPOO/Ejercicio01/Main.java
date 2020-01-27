
package Ejercicio01;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    Gato[] gato = new Gato[4];
    
    System.out.println("Introduzca los datos de los gatos");
    
    for (int i = 0; i < 4; i++) {
      gato[i] = new Gato();
      System.out.println("\nGato nº " + (i + 1));
      System.out.print("Nombre: ");
      gato[i].setNombre(read.nextLine());
      System.out.print("Color: ");
      gato[i].setColor(read.nextLine());
      System.out.print("Raza: ");
      gato[i].setRaza(read.nextLine());
    }
    
    System.out.println("\nDatos de los gatos.");
    
    for (int i = 0; i < 4; i++) {
      System.out.println("\nGato nº " + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
    }
  }
  
}
