
public class Ejercicio05 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra 50 números enteros aleatorios entre 100 y 199");
    System.out.println("También muestra el máximo, mínimo y la media de esos números");
    System.out.println("-------------------------------------------------------------------");
    
    int numeroAleatorio;
    int maximo = 0;
    int minimo = 199;
    int suma = 0;
    
    for (int i = 1; i <= 50; i++) {
      numeroAleatorio = (int)((Math.random() * 100) + 100);
      if (numeroAleatorio > maximo) {
        maximo = numeroAleatorio;
      }
      if (numeroAleatorio < minimo) {
        minimo = numeroAleatorio;
      }
      suma += numeroAleatorio;
      System.out.print(numeroAleatorio + " ");
    }
    System.out.println("");
    System.out.println("El máximo es: " + maximo);
    System.out.println("El mínimo es: " + minimo);
    System.out.println("La media es: " + (suma / 50));
  }
  
}
