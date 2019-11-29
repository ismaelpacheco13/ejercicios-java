
package matematicas;

public class funcionesArray {
  
  // Muestra por pantalla todos los números de un array de números enteros
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
  
  // Crea un array de tamaño n y los reyena con números aleatorios dentro de un rango pedido al usuario
  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] x = new int[n];

    for(int i = 0; i < n; i++) {
      x[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
    }
      
    return x;
  }

  // Devuelve el mínimo del array que se pasa como parámetro
  public static int minimoArrayInt(int[] x) {
    int minimo = Integer.MAX_VALUE;
    
    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }
    return minimo;
  }
  
  // Devuelve el máximo del array que se pasa como parámetro
  public static int maximoArrayInt(int[] x) {
    int maximo = Integer.MIN_VALUE;
    
    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }
      
    return maximo;
  }
  
  // Función que devuelve la media de los números del array que se pasa como parámetro
  public static double mediaArrayInt(int[] x) {
    int suma = 0;
    
    for (int n : x) {
      suma += n;
    }
      
    return (double)suma / x.length;
  }
  
  // Función que dice si un número está dentro o no de un array
  public static boolean estaEnArrayInt(int[] x, int n) {
    for (int numero : x) {
      if (numero == n) {
        return true;
      }
    }
    return false;
  }
  
  // Función que busca un número en un array y devuelve la posición (índice) en la que se encuentra
  public static int posicionEnArrayInt(int[] x, int n) {
    for(int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i;
      }
    }
    return -1;
  }
  
  // Función que voltea un array de enteros
  public static int[] volteaArrayInt(int[] x) {
    int[] a = new int[x.length];
    
    for(int i = 0; i < x.length; i++) {
      a[x.length - i - 1] = x[i];
    }
      
    return a;
  }
  
  // Función que rota n posiciones a la derecha los números de un array
  public static int[] rotaDerechaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return a;
  }
  
  // Función que rota n posiciones a la izquierda los números de un array
  public static int[] rotaIzquierdaArrayInt(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
  
  // Función que filtra primos de un array de enteros
  public static int[] filtraPrimos(int x[]) {
    int[] primos = new int[x.length];
    
    int cuentaPrimos = 0;
    for (int numero : x) {
      if (funcionesMatematicas.esPrimo(numero)) {
        primos[cuentaPrimos++] = numero;
      }
    }
    
    int[] resultado = new int[cuentaPrimos];
    
    for (int i = 0; i < cuentaPrimos; i++) {
      resultado[i] = primos[i];
    }
   
    return resultado;
  }
  
  // Función que filtra los números capicua de un array de enteros
  public static int[] filtraCapicuas(int x[]) {
    int[] capicuas = new int[x.length];
    
    int cuentaCapicuas = 0;
    for (int numero : x) {
      if (funcionesMatematicas.esCapicua(numero)) {
        capicuas[cuentaCapicuas++] = numero;
      }
    }
    
    int[] resultado = new int[cuentaCapicuas];
    
    for (int i = 0; i < cuentaCapicuas; i++) {
      resultado[i] = capicuas[i];
    }
   
    return resultado;
  }
  
  // Función que filtra los números que tengan 7 del array
  public static int[] filtraCon7(int x[]) {
    int[] con7 = new int[x.length];

    int numerosCon7 = 0;
    for (int numero : x) {
      if (contieneEl7(numero)) {
        con7[numerosCon7++] = numero;
      }
    }

    int[] resultado = new int[numerosCon7];

    for (int i = 0; i < numerosCon7; i++) {
      resultado[i] = con7[i];
    }
    
    if (numerosCon7 == 0) {
      int [] resultadoN = {-1};
      return resultadoN;
    } else {
      return resultado;
    }

  }

  public static boolean contieneEl7(int n) {
    return funcionesMatematicas.posicionDeDigito(n, 7) != -1;
  }

  public static boolean contieneEl7(long n) {
    return funcionesMatematicas.posicionDeDigito(n, 7) != -1;
  }
  
  // Función que convierte un array en string
  public static String convierteArrayEnString(int[] a) {
    String resultado = "";
    for (int digito : a) {
      resultado += digito;
    }
    return resultado;
  }
  
  // Función que concatena dos arrays
  public static int[] concatena(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];

    for (int i = 0; i < a.length; i++) {
      resultado[i] = a[i];
    }

    for (int i = 0; i < b.length; i++) {
      resultado[i + a.length] = b[i];
    }

    return resultado;
  }
  
  // Función que mezcla dos arrays (número de uno, despues número del otro y así sucesivamente)
  public static int[] mezcla(int[] a, int[] b) {
    int[] resultado = new int[a.length + b.length];

    int colocadosDeA = 0;
    int colocadosDeB = 0;
    int i = 0;
    
    do {
      if (colocadosDeA < a.length) {
        resultado[i++] = a[colocadosDeA++];
      }
      
      if (colocadosDeB < b.length) {
        resultado[i++] = b[colocadosDeB++];
      }
    } while (i < a.length + b.length);

    return resultado;
  }
  
  // Función que devuelve un número aleatorio del array
  public static int aleatorioDeArray(int[] a) {
    return a[(int)(Math.random() * a.length)];
  }
  
  /*Implementa una función con nombre nEsimo que busque el número que hay
  dentro de un array bidimensional en la posición n-ésima contando de izquierda
  a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
  es el 0. Si la posición donde se busca no existe en el array, la función debe
  devolver -1. */
  public static int nEsimo(int[][] n, int posicion) {
	int filas = n.length;
    int columnas = n[0].length;
    
    if ((posicion < 0) || (posicion > filas * columnas - 1)) {
      return -1;
    } else {
      return n[posicion / columnas][posicion % columnas];
    }
  }
  
  /* Realiza una función que tome como parámetro un array de cadenas de carac-
  teres y que devuelva otro array con los mismos valores habiendo eliminado
  las posibles repeticiones. Se distinguen mayúsculas de minúsculas, por tanto
  “hola” es distinto de “Hola”. */
  public static String[] sinRepetir(String[] s) {
    String[] vacio = {};
    if (s.length == 0) {
      return vacio;
    }
    
    String[] resultado = new String[s.length];
    
    resultado[0] = s[0];
    int j = 1;
    for (int i = 1; i < s.length; i++) {
      if (!contiene(resultado, s[i])) {
        resultado[j++] = s[i];
      }
    }
    
    return compacta(resultado);
  }
  
  public static boolean contiene(String[] lista, String cadena) {
     
    for (String elemento : lista) {
      if ((elemento != null) && (elemento.equals(cadena))) {
        return true;
      }
    }
    return false;
  }
  
  /**
   * Quita los elementos nulos consecutivos por el final.
   * 
   * @param s array que puede tener nulos al final
   * @return array sin nulos
   */
  public static String[] compacta(String[] s) {
    
    int i = s.length - 1;
    
    while (s[i] == null) {
      i--;
    }
    String[] resultado = new String[i + 1];
    System.arraycopy(s, 0, resultado, 0, i + 1);
    
    return resultado;
  }
  
  // Función que saca la "corteza" del array (números del marco del array)
  public static int[] corteza(int[][] n) {
    int filas = n.length;
    int columnas = n[0].length;
    
    int[] resultado = new int[2 * filas + 2 * columnas - 4];
    
    int j = 0;
    
    // Fila superior
    for (int i = 0; i < columnas - 1; i++) {
      resultado[j++] = n[0][i];
    }
    
    // Columna derecha
    for (int i = 0; i < filas - 1; i++) {
      resultado[j++] = n[i][columnas - 1];
    }
    
    // Fila inferior
    for (int i = columnas - 1; i > 0; i--) {
      resultado[j++] = n[filas - 1][i];
    }
    
    // Columna izquierda
    for (int i = filas - 1; i > 0; i--) {
      resultado[j++] = n[i][0];
    }
    return resultado;
  }
}
