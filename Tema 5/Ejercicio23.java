
import java.util.Scanner;


public class Ejercicio23 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa que calcula el total acumulado, el contador de números introducidos y la media de los números introducidos (hasta 10000)");
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
    
    int sumaNumero = 0;
    int contadorNumeros = 0;
    int numero;
    
    do {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(read.nextLine());
      sumaNumero += numero;
      contadorNumeros++;
      if ((sumaNumero > 10000) && (numero < 0)) {
        sumaNumero -= numero;
        contadorNumeros--;
        System.out.println("ERROR: La suma de los números no puede superar el valor de 10000");
        System.out.println("Lleva una cantidad de: " + sumaNumero + " ,si quiere acabar puede insertar un número negativo");
        System.out.println("");
      } if (numero < 0) {
          sumaNumero -= numero;
          contadorNumeros--;
      }
    } while ((sumaNumero >= 1 && sumaNumero < 10000) && (numero > 0));
    
    System.out.println("La suma de los números introducidos es: " + sumaNumero);
    System.out.println("Has introducido un total de " + contadorNumeros + " números");
    System.out.println("La media de los números introducidos es: " + (sumaNumero / contadorNumeros));
    
  }
}
