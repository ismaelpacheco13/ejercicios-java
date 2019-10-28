
public class Ejercicio13 {

  public static void main(String[] args) {
    
    System.out.println("Programa que lanza dos dados a la vez");
    System.out.println("El programa continuará hasta que los dos dados sean iguales");
    System.out.println("------------------------------------------------------------");
    
    int tiradaDado1 = 0;
    int tiradaDado2 = 1;
    String dado1 = "";
    String dado2 = "";
    
    while (tiradaDado1 != tiradaDado2) {
      tiradaDado1 = (int)((Math.random() * 6) + 1);
      tiradaDado2 = (int)((Math.random() * 6) + 1);
      
      switch (tiradaDado1) {
        case 1:
          dado1 = "⚀";
          break;
        case 2:
          dado1 = "⚁";
          break;
        case 3:
          dado1 = "⚂";
          break;
        case 4:
          dado1 = "⚃";
          break;
        case 5:
          dado1 = "⚄";
          break;
        case 6:
          dado1 = "⚅";
      }
      
      switch (tiradaDado2) {
        case 1:
          dado2 = "⚀";
          break;
        case 2:
          dado2 = "⚁";
          break;
        case 3:
          dado2 = "⚂";
          break;
        case 4:
          dado2 = "⚃";
          break;
        case 5:
          dado2 = "⚄";
          break;
        case 6:
          dado2 = "⚅";
      }
      System.out.println("Dado 1: " + dado1 + "   Dado 2: " + dado2);
    }
  }
  
}
