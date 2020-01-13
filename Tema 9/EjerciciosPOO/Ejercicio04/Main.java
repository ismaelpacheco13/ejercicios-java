
package Ejercicio04;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int opcion;
    int nm2 = 0;
    int dn2 = 0;
    int salida = 0;
    Fraccion f1 = new Fraccion();
    
    System.out.print("Introduce el numerador de la fracción: ");
    f1.numerador = read.nextInt();
    System.out.print("Introduce el denominador de la fracción: ");
    f1.denominador = read.nextInt();
    
    do {
      System.out.println("\n¿Qué deseas hacer?");
      System.out.println("1.- Invertir la fracción");
      System.out.println("2.- Simplificar la fracción");
      System.out.println("3.- Multiplicar por otra fracción");
      System.out.println("4.- Dividir por otra fracción");
      System.out.println("5.- Cambiar la fracción");
      System.out.println("6.- Salir del programa");
      System.out.print("Introduce una opción (1, 2, 3, 4): ");
      opcion = read.nextInt();

      switch(opcion) {
        case 1: // Invertir
          f1.invertir();
          break;
        case 2: // Simplificar
          System.out.print("¿Por cuánto quieres simplificar la fracción?: ");
          int simplificador = read.nextInt();
          f1.simplificar(simplificador);
          break;
        case 3: // Multiplicar por otra fracción
          System.out.print("Introduce el numerador de la segunda fracción: ");
          nm2 = read.nextInt();
          System.out.print("Introduce el denominador de la segunda fracción: ");
          dn2 = read.nextInt();
          f1.multiplicar(nm2, dn2);
          break;
        case 4: // Dividir por otra fracción
          System.out.print("Introduce el numerador de la segunda fracción: ");
          nm2 = read.nextInt();
          System.out.print("Introduce el denominador de la segunda fracción: ");
          dn2 = read.nextInt();
          f1.dividir(nm2, dn2);
          break;
        case 5: // Modificar la fracción
          System.out.print("Introduce el numerador de la fracción: ");
          f1.numerador = read.nextInt();
          System.out.print("Introduce el denominador de la fracción: ");
          f1.denominador = read.nextInt();
          break;
        case 6: // Salir del programa
          System.exit(0);
          break;
        default:
      }
      if (opcion < 5) {
        System.out.print("¿Desea continuar? (1.- Sí, 2.- No): ");
        salida = read.nextInt();
      }
    } while (salida == 1);
  }
  
}
