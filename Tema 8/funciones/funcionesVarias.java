
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
  
}
