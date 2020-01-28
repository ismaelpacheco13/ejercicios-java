
package Ejercicio04;

import java.util.Scanner;

public class Main {
  
  static int N = 100;

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int opcion;
    int opcion2;
    int opcionIntroducida;
    int primeraLibre;
    int j;
    int libres;
    boolean codigoExiste;
    boolean autorExiste;
    boolean generoExiste;
    int p = 0;
    int t = 0;
    
    String codigoIntroducido;
    String autorIntroducido;
    String tituloIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    
    // Array de discos
    Disco album[] = new Disco[N];
    
    // Array de autores
    String[] autor = new String[N];
    
    // Array de géneros
    String[] genero = new String[N];
    
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
          System.out.println("¿Desea ver el listado completo o buscar por autor o género?");
          System.out.println("1. Listado completo");
          System.out.println("2. Búsqueda por autor");
          System.out.println("3. Búsqueda por género");
          System.out.print("Introduzca una opción: ");
          opcion2 = Integer.parseInt(read.nextLine());
          
          switch (opcion2) {
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
              System.out.println("\nAUTORES");
              System.out.println("=======");
              for (p = 0; p < 100; p++) {
                if (autor[p] != null) {
                  System.out.println(p + ".-" + autor[p]);
                }
              }
              
              System.out.print("Selecciona el autor que desees: ");
              opcionIntroducida = Integer.parseInt(read.nextLine());
              System.out.println("\nLISTADO DE " + autor[opcionIntroducida].toUpperCase());
              System.out.println("==========================");
              for (int i = 0; i < N; i++) {
                if (album[i].getAutor().equals(autor[opcionIntroducida])) {
                  System.out.println(album[i]);
                }
              }
            
          }
          
          
          
          break;

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          // Busca la primera posicion libre del array
          primeraLibre = -1;
          libres = 100;
          codigoExiste = false;
          autorExiste = false;
          generoExiste = false;
          for (int i = 0; i < 100; i++) { // Control de los espacios libres del album
            if (!album[i].getCodigo().equals("LIBRE")) {
              libres--;
            }
          }
          
          if (libres == 0) {
            System.out.println("No quedan espacios en el album, debes borrar algun disco de la lista primero");
          } else {
            do {
              primeraLibre++;
            } while (!album[primeraLibre].getCodigo().equals("LIBRE"));

            System.out.println("Introduzca los datos del disco");

            do {
              codigoExiste = false;
              System.out.print("Código: ");
              codigoIntroducido = read.nextLine();

              for (int i = 0; i < 100; i++) { // Se comprueba si el código introducido existe ya o no
                if (album[i].getCodigo().equals(codigoIntroducido)) {
                  codigoExiste = true;
                }
              }

              if (codigoExiste) {
                System.out.println("Lo sentimos, el código introducido ya existe, introduzca otro");
              } else {
                album[primeraLibre].setCodigo(codigoIntroducido);
              }
            } while (codigoExiste);
            
            System.out.print("Autor: ");
            autorIntroducido = read.nextLine();
            album[primeraLibre].setAutor(autorIntroducido);
            
            for (int i = 0; i < N; i++) { // Se comprueba si el autor introducido existe ya o no para meterlo en el array de autores
              if (album[i].getAutor().equals(autorIntroducido)) {
                autorExiste = true;
              }
            }
            
            if (autorExiste == false) {
              autor[p++] = autorIntroducido;
            }
            
            System.out.print("Título: ");
            album[primeraLibre].setTitulo(read.nextLine());
            System.out.print("Género: ");
            generoIntroducido = read.nextLine();
            album[primeraLibre].setGenero(generoIntroducido);
            
            for (int i = 0; i < 100; i++) { // Se comprueba si el género introducido existe ya o no para meterlo en el array de géneros
              if (genero[i].equals(generoIntroducido)) {
                generoExiste = true;
              }
            }
            
            if (generoExiste == false) {
              genero[t++] = generoIntroducido;
            }
            
            System.out.print("Duración: ");
            album[primeraLibre].setDuracion(Integer.parseInt(read.nextLine()));
          }
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
          
          codigoExiste = false;
          
          for (int i = 0; i < 100; i++) {
            if (album[i].getCodigo().equals(codigoIntroducido)) {
              codigoExiste = true;
            }
          }
          
          if (codigoExiste) {
            j = -1;
            do {
              j++;
            } while(!album[j].getCodigo().equals(codigoIntroducido));
            album[j].setCodigo("LIBRE");
            System.out.println("Album borrado.");
          } else {
            System.out.println("El código introducido no existe");
          }
          break;

        default:
      }
    } while (opcion != 5);
  }
  
}
