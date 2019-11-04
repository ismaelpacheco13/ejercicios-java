
public class Ejercicio25 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra por pantalla 100 números separados por un espacio");
    System.out.println("Los primos tendrán el siguiente formato '#x#'");
    System.out.println("Los múltiplos de 5 serán de la siguiente manera '[x]'");
    System.out.println("-----------------------------------------------------------------------");
    
    int numeroAleatorio;
    boolean esPrimo;
    
    for (int i = 1; i <= 100; i++) {
      numeroAleatorio = ((int)(Math.random() * 191) + 10);
      esPrimo = true;
      for (int j = 2; j < numeroAleatorio; j++) {
        if ((numeroAleatorio % j) == 0) {
          esPrimo = false;
        }
      }
      
      if ((numeroAleatorio % 5) == 0) {
        System.out.print("[" + numeroAleatorio + "] ");
      } else if (esPrimo) {
        System.out.print("#" + numeroAleatorio + "# ");
      } else {
        System.out.print(numeroAleatorio + " ");
      }
    }
  }
  
}
