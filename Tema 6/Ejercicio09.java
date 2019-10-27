
public class Ejercicio09 {

  public static void main(String[] args) {
    
    System.out.println("Programa que genera números aleatorios pares entre 0 y 100");
    System.out.println("El programa no terminará hasta que no salga el 24.");
    System.out.println("---------------------------------------------------");
    
    int numeroAleatorio = 0;
    int contador = 0;
    
    while (numeroAleatorio != 24) {
      numeroAleatorio = (int)(Math.random() * 100);
      if ((numeroAleatorio % 2) == 0) {
        System.out.print(numeroAleatorio + " ");
        contador++;
      }
    }
    System.out.println("");
    System.out.println("Se han generado un total de " + contador + " números hasta llegar al 24.");
  }
  
}
