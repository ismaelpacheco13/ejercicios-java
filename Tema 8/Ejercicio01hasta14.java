package matematicas;

/**
 * Funciones Matemáticas
 * 
 * @author alumnoismael
 */
public class Ejercicio01hasta14 {
  /**
   * 
   * @param x1 Número decimal (double)
   * @param x2 Número decimal (double)
   * @param x3 Número decimal (double)
   * @return Devuelve la media de los tres números
   */
  public static double media(double x1, double x2, double x3) {
    return (x1 + x2 + x3) / 3;
  }
  
  /**
   * 
   * @param a Array de doubles
   * @return Devuelve la media de todos los números del array
   */
  public static double media(double[] a) {
    double suma = 0;
    for (double d : a) {
      suma += d;
    }
    return suma / a.length;
  }
  
  /**
   * 
   * @param a Array de enteros
   * @return Devuelve la media de todos los números del array
   */
  public static double media(int[] a) {
    double suma = 0;
    for (double d : a) {
      suma += d;
    }
    return suma / a.length;
  }
  
  /**
   * 
   * @param minimo Mínimo del número aleatorio
   * @param maximo Máximo del número aleatorio
   * @return Devuelve el número aleatorio generado dado el mínimo y el máximo
   */
  public static int aleatorio(int minimo, int maximo) {
    return (int)(Math.random() * (maximo - minimo + 1) + minimo);
  }
  
  /**
   * 
   * @param n Números del array
   */
  public static void pintaArray(int[] n) {
    for (int i : n) {
      System.out.println(i + " ");
    }
  }
  
  /**
   * 
   * @param nota Nota del usuario
   * @return Devuelve 5 en caso de haber suspendido, o su nota correspondiente en caso de haber aprobado
   */
  public static double aprobador(double nota) {
    if (nota < 5) {
      return 5;
    } else {
      return nota;
    }
  }
  
  // A partir de aqui empiezo el ejercicio
  // Función para voltear un número
  public static long voltea(long n) {
    long invertido = 0;
    
    while (n > 0) {
      invertido = (invertido * 10) + (n % 10);
      n /= 10;
    }
    return invertido;
  }
  
  // Función para saber si un número es capicua
  public static boolean esCapicua(long n) {
    long numeroVolteado = voltea(n);
    boolean capicua = false;
    
    if (n == numeroVolteado) {
      capicua = true;
    }
    return capicua;
  }
  
  // Función para saber si un número es primo
  public static boolean esPrimo(int n) {
    boolean primo = true;
    
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        primo = false;
      }
    }
    
    if (n == 1) {
      primo = false;
    }
    return primo;
  }
  
  // Función para devolver el siguiente primo al número introducido
  public static int siguientePrimo(int n) {
    int sPrimo = n + 1;
    while (esPrimo(sPrimo) == false) {
      sPrimo++;
    }
    return sPrimo;
  }
}
