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
  
  // Función que dada una base y el exponente da la potencia
  public static double potencia(int n, int p) { // Dado un número entero
    return Math.pow(n,p);
  }
  
  // Función que cuenta el número de dígitos que hay en un número
  public static int digitos(long n) {
    int digitos = 0;
    
    if (n < 0) {
      n = -n;
    }
    
    if (n == 0) {
      digitos = 1;
    } else {
      while (n > 0) {
        n /= 10;
        digitos++;
      }
    }
    return digitos;
  }
  
  public static int digitos(int n) {
    int digitos = 0;
    
    if (n < 0) {
      n = -n;
    }
    
    if (n == 0) {
      digitos = 1;
    } else {
      while (n > 0) {
        n /= 10;
        digitos++;
      }
    }
    return digitos;
  }
  
  // Función que devuelve el dígito que está en la posición n de un número entero
  public static int digitoN(long n, int p) {
    n = voltea(n);
    
    while (p-- > 0) {
      n /= 10;
    }
    return (int)n % 10;
  }
  
  public static int digitoN(int n, int p) {
    return digitoN((long)n, p);
  }
  
  // Función que da la posición de la primera ocurrencia de un dígito dentro de un número entero
  public static int posicionDeDigito(long n, int p) {
    int i;

    for (i = 0; (i < digitos(n)) && (digitoN(n, i) != p); i++) {};

    if (i == digitos(n)) {
      return -1;
    } else {
      return i;
    }
  }
  
  public static int posicionDeDigito(int n, int p) {
    return posicionDeDigito((long)n, p);
  }
  
  // Función que quita a un número n dígitos por detras (por la derecha)
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }
  
  public static int quitaPorDetras(int x, int n) {
    return (int)quitaPorDetras((long) x, n);
  }
  
  // Función que quita a un número n dígitos por delante (por la izquierda)
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }
  
  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }
  
  // Función que añade un dígito a un número por detrás
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }
  
  public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
  }
  
  // Función que añade un dígito a un número por delante
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }
  
  public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
  }
  
  // Función que toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }
  
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
  }
  
  // Función que pega dos números para forma uno
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }
  
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
}

