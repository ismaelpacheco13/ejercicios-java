
public class Ejercicio21 {

  public static void main(String[] args) {
    
    System.out.println("Programa que devuelve un array 'cincuerizado', es decir cambiando los números por sus múltiplos de 5 más proximos");
    System.out.println("------------------------------------------------------------------------------------------------------------------");
    
    int [] arrayAleatorio = matematicas.funcionesArray.generaArrayInt(15, 0, 500);
    
    System.out.println("Array original:");
    for (int i : arrayAleatorio) {
      System.out.print(i + " ");
    }
    
    System.out.println("");
    System.out.println("Array cincuerizado:");
    for (int i = 0; i < 15; i++) {
      if ((arrayAleatorio[i] % 5) != 0) {
        do {
          arrayAleatorio[i]++;    
        } while ((arrayAleatorio[i] % 5) != 0);
      }
      System.out.print(arrayAleatorio[i] + " ");
    }
  }
  
}
