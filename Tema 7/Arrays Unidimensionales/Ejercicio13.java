
import java.util.Scanner;


public class Ejercicio13 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    int [] arrayAleatorio = matematicas.funcionesArray.generaArrayInt(100, 0, 500);
    matematicas.funcionesArray.muestraArrayInt(arrayAleatorio);
    
    System.out.print("¿Qué quiere destacar? (1 - mínimo, 2 - máximo): ");
    int opcionElegida = Integer.parseInt(read.nextLine());
    
    switch (opcionElegida) {
      case 1:
        for (int i = 0; i < 100; i++) {
          if (arrayAleatorio[i] == matematicas.funcionesArray.minimoArrayInt(arrayAleatorio)) {
            System.out.print("*" + arrayAleatorio[i] + "* ");
          } else {
            System.out.print(arrayAleatorio[i] + " ");
          }
        }
        break;
      case 2:
        for (int i = 0; i < 100; i++) {
          if (arrayAleatorio[i] == matematicas.funcionesArray.maximoArrayInt(arrayAleatorio)) {
            System.out.print("*" + arrayAleatorio[i] + "* ");
          } else {
            System.out.print(arrayAleatorio[i] + " ");
          }
        }
        break;
      default:
    }
  }
  
}
