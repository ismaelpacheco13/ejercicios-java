
public class Ejercicio04 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra 20 números aleatorios entre 0 y 10");
    System.out.println("--------------------------------------------------------");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random() * 10) + " ");
    }
  }
  
}
