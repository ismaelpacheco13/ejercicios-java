
public class Ejercicio10 {

  public static void main(String[] args) {
    
    int [] num = new int [20];
    
    for (int i = 0; i < 20; i++) {
      num[i] = (int)(Math.random() * 101);
    }
    
    // Pinta el array original
    System.out.print("Array números aleatorios sin ordenar: ");
    for (int i = 0; i < 20; i++) {
      if (i < 19) {
        System.out.print(num[i] + ", ");
      } else if (i == 19) {
        System.out.print(num[i] + ".");
      }
    }
    
    System.out.println("");
    // Pinta el array ordenado
    System.out.print("Array números aleatorios ordenados: ");
    for (int i : num) {
      if ((i % 2) == 0) {
        System.out.print(i + ", ");
      }
    }
    for (int i : num) {
      if ((i % 2) != 0) {
        System.out.print(i + ", ");
      }
    }
    
    System.out.println("");
  }
  
}
