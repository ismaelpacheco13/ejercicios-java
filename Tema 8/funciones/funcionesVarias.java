
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
  
  /* Función que devuelve el número de veces que aparece un dígito
  dentro de un número (primera función) o bien el número de veces que aparece
  un dígito en una serie de números contenidos en un array (segunda función). */
  public static int ocurrencias(int digito, int n) {
    int repetido = 0;
    
    while (n > 0) {
      if ((n % 10) == digito) {
        repetido++;
      }
      n = n/10;
    }

    return repetido;
  }
  
  public static int ocurrencias(int digito, int[] a) {
    int repetido = 0;
    
    for (int n : a) {
      repetido += ocurrencias(digito, n);
    }
    
    return repetido;
  }
}
