
public class Ejercicio18 {

  public static void main(String[] args) {
    
    int [] arrayAleatorio = matematicas.funcionesArray.generaArrayInt(10, 0, 200);
    int [] menores = new int[10];
    int [] mayores = new int[10];
    int cuentaMenores = 0;
    int cuentaMayores = 0;
    
    for (int i = 0; i < 10; i++) {
      if (arrayAleatorio[i] <= 100) {
        menores[cuentaMenores++] = arrayAleatorio[i];
      } else {
        mayores[cuentaMayores++] = arrayAleatorio[i];
      }
    }
    
    System.out.println("Array original: \n");
    System.out.print("Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    System.out.print("Valor  ");
    for (int i : arrayAleatorio) {
      System.out.printf("%5d", i);
    }
    
    System.out.println("");
    
    int menoresColocados = 0;
    int mayoresColocados = 0;
    
    int j = 0;
    do {
      if (menoresColocados < cuentaMenores) {
        arrayAleatorio[j++] = menores[menoresColocados++];
      }
      
      if (mayoresColocados < cuentaMayores) {
        arrayAleatorio[j++] = mayores[mayoresColocados++];
      }
    } while (j < 10);
    
    System.out.println("\nArray resultado: \n");
    System.out.print("Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d", i);
    }
    System.out.println("");
    System.out.print("Valor  ");
    for (int i : arrayAleatorio) {
      System.out.printf("%5d", i);
    }
  }
  
}
