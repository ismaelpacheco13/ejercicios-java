
package matematicas;

import java.util.Scanner;

public class Ejercicio17 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que pasa de binario a decimal");
    System.out.println("---------------------------------------");
    
    System.out.print("Introduce el número binario: ");
    long binario = read.nextLong();
    
    int bits = Ejercicio01hasta14.digitos(binario);
    int decimal = 0;
    
    for (int i = 0; i < bits; i++) {
      decimal += Ejercicio01hasta14.digitoN(binario, bits - i - 1) * Ejercicio01hasta14.potencia(2, i);
    }
    System.out.println("Binario: " + binario);
    System.out.println("Decimal: " + decimal);
  }
  
}
