
import static matematicas.funcionesMatematicas.digitoN;
import static matematicas.funcionesMatematicas.digitos;


public class Ejercicio35 {

  public static void main(String[] args) {
    int[] numeros = {470213, 0, 11, 24, 867024};
    
    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + convierteEnPalotes(numero));
      System.out.println(" en el sistema de palotes.");
    }
  }
  
  
  public static String convierteEnPalotes(int n) {
    String resultado = "";
    
    for(int i = 0; i < digitos(n); i++) {
      for (int j = 0; j < digitoN(n, i); j++) {
        resultado += "|";
      }
      if (i < digitos(n) - 1) {
        resultado += "-";
      }
    }
    
    return resultado;
  }
  
}
