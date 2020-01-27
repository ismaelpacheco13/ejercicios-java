
package Ejercicio03;

import java.util.Scanner;

public class Main {
  
  static int N = 100;

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int opcion;
    int primeraLibre;
    int j;
    
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    
    // Array de discos
    Disco album[] = new Disco[N];
    
    // Se crean las celdas del array
    for (int i = 0; i < N; i++) {
      album[i] = new Disco();
    }
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(read.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for (int i = 0; i < N; i++) {
            if (!album[i].getCodigo().equals("LIBRE")) {
              System.out.println(album[i]);
            }
          }
          break;

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          // Busca la primera posicion libre del array
          primeraLibre = -1;
          do {
            primeraLibre++;
          } while (!album[primeraLibre].getCodigo().equals("LIBRE"));

          System.out.println("Introduzca los datos del disco");

          System.out.print("Código: ");
          album[primeraLibre].setCodigo(read.nextLine());
          System.out.print("Autor: ");
          album[primeraLibre].setAutor(read.nextLine());
          System.out.print("Título: ");
          album[primeraLibre].setTitulo(read.nextLine());
          System.out.print("Género: ");
          album[primeraLibre].setGenero(read.nextLine());
          System.out.print("Duración: ");
          album[primeraLibre].setDuracion(Integer.parseInt(read.nextLine()));
          break;

        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("=========");

          System.out.print("Introduzca el código del disco que quiere modificar: ");
          codigoIntroducido = read.nextLine();

          j = -1;
          do {
            j++;
          } while(!album[j].getCodigo().equals(codigoIntroducido));

          System.out.println("Introduzca los nuevos datos del disco o pulse INTRO para dejarlos igual");

          System.out.println("Código: " + album[j].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = read.nextLine();
          if (!codigoIntroducido.equals("")) {
            album[j].setCodigo(codigoIntroducido);
          }

          System.out.println("Autor: " + album[j].getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = read.nextLine();
          if (!autorIntroducido.equals("")) {
            album[j].setAutor(autorIntroducido);
          }

          System.out.println("Titulo: " + album[j].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = read.nextLine();
          if (!tituloIntroducido.equals("")) {
            album[j].setTitulo(tituloIntroducido);
          }

          System.out.println("Género: " + album[j].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = read.nextLine();
          if (!generoIntroducido.equals("")) {
            album[j].setGenero(generoIntroducido);
          }

          System.out.println("Duración: " + album[j].getDuracion());
          System.out.print("Nueva duración: ");
          duracionIntroducidaString = read.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            album[j].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }

          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Introduzca el código del disco que desea borrar: ");
          codigoIntroducido = read.nextLine();

          j = -1;
          do {
            j++;
          } while(!album[j].getCodigo().equals(codigoIntroducido));
          album[j].setCodigo("LIBRE");
          System.out.println("Album borrado.");
          break;

        default:
      }
    } while (opcion != 5);
  }
  
}
