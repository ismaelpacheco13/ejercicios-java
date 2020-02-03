
package Ejercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int opcion;
    int j;
    
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    
    // Lista de discos
    ArrayList<Disco> album = new ArrayList<>();
    
    album.add(new Disco("EU30", "Delaossa", "La Placita", "Rap", 3));
    album.add(new Disco("EU31", "Kidd Keo", "Trap Life", "Trap", 3));
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
          for (Disco disco : album) {
            System.out.println(disco);
          }
          break;

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          System.out.println("Introduzca los datos del disco");

          System.out.print("Código: ");
          codigoIntroducido = read.nextLine();
          System.out.print("Autor: ");
          autorIntroducido = read.nextLine();
          System.out.print("Título: ");
          tituloIntroducido = read.nextLine();
          System.out.print("Género: ");
          generoIntroducido = read.nextLine();
          System.out.print("Duración: ");
          duracionIntroducida = Integer.parseInt(read.nextLine());
          
          album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
          break;

        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("=========");

          System.out.print("Introduzca el código del disco que quiere modificar: ");
          codigoIntroducido = read.nextLine();
          j = album.indexOf(new Disco(codigoIntroducido));

          System.out.println("Introduzca los nuevos datos del disco o pulse INTRO para dejarlos igual");

          System.out.println("Código: " + album.get(j).getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = read.nextLine();
          if (!codigoIntroducido.equals("")) {
            album.get(j).setCodigo(codigoIntroducido);
          }

          System.out.println("Autor: " + album.get(j).getAutor());
          System.out.print("Nuevo autor: ");
          autorIntroducido = read.nextLine();
          if (!autorIntroducido.equals("")) {
            album.get(j).setAutor(autorIntroducido);
          }

          System.out.println("Titulo: " + album.get(j).getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = read.nextLine();
          if (!tituloIntroducido.equals("")) {
            album.get(j).setTitulo(tituloIntroducido);
          }

          System.out.println("Género: " + album.get(j).getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = read.nextLine();
          if (!generoIntroducido.equals("")) {
            album.get(j).setGenero(generoIntroducido);
          }

          System.out.println("Duración: " + album.get(j).getDuracion());
          System.out.print("Nueva duración: ");
          duracionIntroducidaString = read.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            album.get(j).setDuracion(Integer.parseInt(duracionIntroducidaString));
          }

          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Introduzca el código del disco que desea borrar: ");
          album.remove(new Disco(read.nextLine()));
          System.out.println("Album borrado.");
          break;

        default:
      }
    } while (opcion != 5);
  }
  
}
