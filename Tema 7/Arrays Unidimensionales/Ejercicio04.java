
public class Ejercicio04 {

  public static void main(String[] args) {
    
    int [] numero = new int [20];
    int [] cuadrado = new int [20];
    int [] cubo = new int [20];
    
    int numeroAleatorio;
    
    for (int i = 0; i < 20; i++) { // Calcula los números de los arrays
      numeroAleatorio = (int)(Math.random() * 101);
      numero [i] = numeroAleatorio;
      cuadrado [i] = (int)Math.pow(numeroAleatorio, 2);
      cubo [i] = (int)Math.pow(numeroAleatorio, 3);
    }
    
    System.out.printf("%-10s %-15s %-20s\n", "Número", "Cuadrado", "Cubo");
    for (int i = 0; i < 20; i++) { // Pinta los arrays en tres columnas
      System.out.printf("%-10s %-15s %-20s\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
  
}
