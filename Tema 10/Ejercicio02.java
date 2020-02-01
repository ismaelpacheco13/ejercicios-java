
import java.util.ArrayList;


public class Ejercicio02 {

  public static void main(String[] args) {
    
    ArrayList<Integer> numero = new ArrayList<>();
    
    int suma = 0;
    int maximo = 0;
    int minimo = 100;
    
    for (int i = 0; i < (int)(Math.random() * 11 + 10); i++) {
      numero.add((int)(Math.random() * 101));
    }
    
    for (Integer integer : numero) {
      suma += integer;
      if (integer > maximo) {
        maximo = integer;
      }
      if (integer < minimo) {
        minimo = integer;
      }
    }
    
    System.out.println("La suma es: " + suma);
    System.out.println("La media es: " + suma/numero.size());
    System.out.println("El máximo es: " + maximo);
    System.out.println("El mínimo es: " + minimo);
  }
  
}
