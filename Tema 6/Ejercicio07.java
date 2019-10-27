
public class Ejercicio07 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra tres apuestas de la quiniela en tres columnas");
    System.out.println("-------------------------------------------------------------------");
    
    int resultadoPartido;
    int columnas = 3;
    
    for (int i = 1; i <= 15; i++) {
      System.out.printf("%4d. |", i);
      
      if (i == 15) {
        columnas = 1;
      }
    
      for (int j = 1; j <= columnas; j++) {
        resultadoPartido = (int)((Math.random() * 3) + 1);

        switch (resultadoPartido) {
          case 1:
            System.out.print("1  |");
            break;
          case 2:
            System.out.print("  2|");
            break;
          case 3:
            System.out.print(" X |");
            break;
          default:
        }
      }
      System.out.println("");
    }
  }
  
}
