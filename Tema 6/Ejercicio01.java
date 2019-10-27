
public class Ejercicio01 {

  public static void main(String[] args) {
    System.out.println("Tirada de tres dados: ");
    
    int tirada;
    int suma = 0;
    
    for (int i = 1; i <= 3; i++) {
      System.out.print("Dado " + i + ": ");
      tirada = (int)((Math.random() * 6) + 1);
      System.out.println(tirada);
      suma += tirada;
    }
    System.out.println("La suma de los dados es: " + suma);
  }
  
}
