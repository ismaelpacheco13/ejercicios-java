
import java.util.Scanner;


public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que piensa un número al azar entre 0 y 100");
    System.out.println("El usuario tiene 5 oportunidades para descubrir el número");
    System.out.println("Cada intento fallido el programa dirá si el número es mayor o menor al introducido");
    System.out.println("-----------------------------------------------------------------------------------");
    
    int numeroAleatorio = (int)(Math.random() * 100);
    int numeroIntroducido = 0;
    int i = 5;
    
    while ((numeroIntroducido != numeroAleatorio) && (i > 0)) {
      System.out.print("Introduce el número que piensas que es: ");
      numeroIntroducido = Integer.parseInt(read.nextLine());
      
      if (numeroIntroducido == numeroAleatorio) {
        System.out.println("Bien, ¡acertaste el número!");
      } else {
        System.out.println("Mala suerte, no has acertado");
        if (numeroIntroducido > numeroAleatorio) {
          System.out.println("El número que estás buscando es menor al introducido");
        } else {
          System.out.println("El número que estás buscando es mayor al introducido");
        }
        i--;
        System.out.println("Te quedan " + i + " oportunidades.");
        System.out.println("");
      }
    }
  }
  
}
