
public class Ejercicio23 {

  public static void main(String[] args) {
    
    System.out.println("Programa que simula 5 veces la tirada de un dado de poker");
    System.out.println("----------------------------------------------------------");
    
    int numeroAleatorio;
    String caraDado = "";
    
    for (int i = 1; i <= 5; i++) {
      numeroAleatorio = (int)(Math.random() * 6);
      
      switch (numeroAleatorio) {
        case 0:
          caraDado = "As";
          break;
        case 1:
          caraDado = "K";
          break;
        case 2:
          caraDado = "Q";
          break;
        case 3:
          caraDado = "J";
          break;
        case 4:
          caraDado = "7";
          break;
        case 5:
          caraDado = "8";
          break;
        default:
      }
      System.out.print(caraDado + " ");
    }
  }
  
}
