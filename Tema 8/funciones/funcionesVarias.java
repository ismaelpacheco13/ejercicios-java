
package matematicas;

public class funcionesVarias {
  
  //Función que convierte números al "sistema de palotes"
  public static String convierteEnPalotes(int n) {
    String resultado = "";
    
    for(int i = 0; i < funcionesMatematicas.digitos(n); i++) {
      for (int j = 0; j < funcionesMatematicas.digitoN(n, i); j++) {
        resultado += "|";
      }
      if (i < funcionesMatematicas.digitos(n) - 1) {
        resultado += "-";
      }
    }
    
    return resultado;
  }
  
  // Función que convierte números al sistema morse
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
  
  // Función que convierte un número en palabras
  public static String convierteEnPalabras(int n) {
    String[] digitos = {
      "cero", "uno", "dos", "tres", "cuatro",
      "cinco", "seis", "siete", "ocho", "nueve"
    };

    String resultado = "";

    int i;
    for (i = 0; i < funcionesMatematicas.digitos(n) - 1; i++) {
      resultado += digitos[funcionesMatematicas.digitoN(n, i)] + ", ";
    }
    resultado += digitos[funcionesMatematicas.digitoN(n, i)];

    return resultado;
  }
}
