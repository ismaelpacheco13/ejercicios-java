
package Ejercicio07;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int opcion = 0;
    int opcionZona = 0;
    int numeroEntradas = 0;
    
    Zona principal = new Zona(1000);
    Zona compraventa = new Zona(200);
    Zona vip = new Zona(25);
    
    do {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = read.nextInt();
      while ((opcion <= 0) || (opcion > 3)) {
        System.out.print("Elige una opción: ");
        opcion = read.nextInt();
      }

      switch (opcion) {
        case 1:
          System.out.println("\nEntradas disponibles");
          System.out.println("--------------------");
          System.out.println("Zona Principal: " + principal.getEntradasPorVender());
          System.out.println("Zona Compra-Venta: " + compraventa.getEntradasPorVender());
          System.out.println("Zona VIP: " + vip.getEntradasPorVender());
          System.out.println();
          break;
        case 2:
          System.out.println("1. Principal");
          System.out.println("2. Compra-Venta");
          System.out.println("3. VIP");
          System.out.print("Elige una opción: ");
          opcionZona = read.nextInt();

          while ((opcionZona <= 0) || (opcionZona > 3)) {
            System.out.print("Elige una opción: ");
            opcionZona = read.nextInt();
          }

          switch (opcionZona) {
            case 1:
              System.out.print("¿Cuántas entradas quieres?: ");
              numeroEntradas = read.nextInt();
              principal.vender(numeroEntradas);
              break;
            case 2:
              System.out.print("¿Cuántas entradas quieres?: ");
              numeroEntradas = read.nextInt();
              compraventa.vender(numeroEntradas);
              break;
            case 3:
              System.out.print("¿Cuántas entradas quieres?: ");
              numeroEntradas = read.nextInt();
              vip.vender(numeroEntradas);
              break;
            default:
          }
          break;
        case 3:
          System.exit(0);
          break;
        default:
      }
    } while (opcion != 3);
  }
  
}
