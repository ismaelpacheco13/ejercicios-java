
public class Ejercicio19 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra 50 números aleatorios entre el -100 y el 200");
    System.out.println("También mostrará el máximo de los pares y el mínimo de los impares, así como la media");
    System.out.println("--------------------------------------------------------------------------------------");
    
    int numeroAleatorio;
    int suma = 0;
    int maximoPares = -100;
    int minimoImpares = 200;
    
    for (int i = 1; i <= 50; i++) {
      numeroAleatorio = (int)((Math.random() * 301) - 100);
      System.out.print(numeroAleatorio + " ");
      if (((numeroAleatorio % 2) == 0) && (numeroAleatorio > maximoPares)) {
        maximoPares = numeroAleatorio;
      } else if (((numeroAleatorio % 2) != 0) && (numeroAleatorio < minimoImpares)) {
        minimoImpares = numeroAleatorio;
      }
      suma += numeroAleatorio;
    }
    
    int media = suma / 50;
    
    System.out.println("");
    System.out.println("El máximo de los pares es: " + maximoPares);
    System.out.println("El mínimo de los impares es: " + minimoImpares);
    System.out.println("La media de todos los números generados es: " + media);
  }
  
}
