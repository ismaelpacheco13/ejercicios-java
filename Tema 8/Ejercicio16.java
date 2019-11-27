
package matematicas;

public class Ejercicio16 {

  public static void main(String[] args) {
    System.out.println("Programa que muestra los números capicúa que hay entre 1 y 99999");
    System.out.println("-----------------------------------------------------------------");
    
    int contadorParaLinea = 0;
    
    for (int i = 1; i < 100000; i++) {
      if (Ejercicio01hasta14.esCapicua(i)) {
        System.out.print(i + " ");
        contadorParaLinea++;
        if (contadorParaLinea == 20) {
          System.out.println("");
          contadorParaLinea = 0;
        }
      }
    }
  }
  
}
