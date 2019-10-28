
import java.util.Scanner;


public class Ejercicio14 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que intentará adivinar el número que estás pensando");
    System.out.println("El número deberá ser un número entre 0 y 100");
    System.out.println("El programa tiene 5 oportunidades para adivinarlo");
    System.out.println("-------------------------------------------------------------");
    
    boolean acierto = false;
    int oportunidades = 5;
    int numeroAleatorio;
    int opcion;
    int minimo = 0;
    int maximo = 100;
    
    while (!acierto && (oportunidades > 0)) {
      numeroAleatorio = (int)((Math.random() * (maximo - minimo)) + minimo);
      
      System.out.println("¿Es el " + numeroAleatorio + "?");
      System.out.println("1) Mayor 2) Menor 3) Es ese");
      opcion = Integer.parseInt(read.nextLine());
      oportunidades--;
      if ((opcion == 1) && (oportunidades > 0)) {
        minimo = numeroAleatorio + 1;
      } else if ((opcion == 2) && (oportunidades > 0)) {
        maximo = numeroAleatorio - 1;
      } else if ((opcion == 3) && (oportunidades > 0)) {
        acierto = true;
        System.out.println("");
        System.out.println("Jeje, ¡yo nunca fallo!");
      }
    }
    if (!acierto) {
      System.out.println("");
      System.out.println("Vaya, ¡seguro que has hecho trampas!");
    }
  }
  
}
