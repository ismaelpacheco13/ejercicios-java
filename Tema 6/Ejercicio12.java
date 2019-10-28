
public class Ejercicio12 {

  public static void main(String[] args) throws InterruptedException {
    
    System.out.println("Programa que llena la pantalla de caracteres aleatorios");
    System.out.println("--------------------------------------------------------");
    
    int numeroAleatorio;
    char caracterAleatorio;
    
    
    
    for (int i = 1; i <= 100; i++) {
      System.out.print("\033[32m");
      for (int j = 1; j <= 100; j++) {
        numeroAleatorio = (int)((Math.random() * 95) + 32);
        caracterAleatorio = (char)numeroAleatorio;
        System.out.print(caracterAleatorio);
        Thread.sleep(6);
      }
      System.out.println("");
    }
  }
  
}
