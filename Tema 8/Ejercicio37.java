
package matematicas;

public class Ejercicio37 {
  
  public static void main(String[] args) {
    int[] numeros = {213, 0, 11, 24, 86};
    
    for (int numero : numeros) {
      System.out.print("El " + numero + " es el " + convierteEnMorse(numero));
      System.out.println(" en morse.");
    }
  }
  
  public static String convierteEnMorse(int n) {
    String[] morse = {
	  "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _",
      ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .", "_ _ _ _ ."
    };
    
    String resultado = "";
    
    for(int i = 0; i < funcionesMatematicas.digitos(n); i++) {
      resultado += morse[funcionesMatematicas.digitoN(n, i)];
    }
    
    return resultado;
  }
}
