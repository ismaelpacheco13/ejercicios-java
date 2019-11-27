
package matematicas;

public class Ejercicio15 {

  public static void main(String[] args) {
    System.out.println("Programa que muestra los números primos que hay entre 1 y 1000");
    System.out.println("---------------------------------------------------------------");
    
    for (int i = 1; i <= 1000; i++) {
      if (Ejercicio01hasta14.esPrimo(i)) {
        System.out.print(i + " ");
      }
    }
  }
  
}
