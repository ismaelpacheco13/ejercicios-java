
package matematicas;

import java.util.Scanner;

public class Ejercicio18 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que pasa de decimal a binario");
    System.out.println("---------------------------------------");
    System.out.print("Introduce el número decimal: ");
    int decimal = read.nextInt();
    
    System.out.println("Decimal: " + decimal);
    System.out.println("Binario: " + decimalABinario(decimal));
    
  }
  
  public static long decimalABinario(int decimal) {
    
    if (decimal == 0) {
      return 0;
    }
    
    long binario = 1;
    
    while (decimal > 1) {
      binario = Ejercicio01hasta14.pegaPorDetras(binario, decimal % 2);
      decimal /= 2;
    }
    binario = Ejercicio01hasta14.pegaPorDetras(binario, 1);
    binario = Ejercicio01hasta14.voltea(binario);
    binario = Ejercicio01hasta14.quitaPorDetras(binario, 1);
    
    return binario;
  }
}
