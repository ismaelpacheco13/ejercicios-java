
public class Ejercicio11 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra 20 notas generadas al azar");
    System.out.println("------------------------------------------------");
    
    int notaNumerica;
    String nota = "";
    int insuficientes = 0;
    int bien = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for (int i = 1; i <= 20; i++) {
      
      notaNumerica = (int)((Math.random() * 10) + 1);
      
      switch (notaNumerica) {
        case 1:
        case 2:
        case 3:
        case 4:
          nota = "Insuficiente";
          insuficientes++;
          break;
        case 5:
        case 6:
          nota = "Bien";
          bien++;
          break;
        case 7:
        case 8:
          nota = "Notable";
          notables++;
          break;
        case 9:
        case 10:
          nota = "Sobresaliente";
          sobresalientes++;
          break;
        default:
      }
      System.out.println("Nota = " + notaNumerica + " - " + nota);
    }
    System.out.println("");
    System.out.println("Número de insuficientes: " + insuficientes);
    System.out.println("Número de bien: " + bien);
    System.out.println("Número de notables: " + notables);
    System.out.println("Número de sobresalientes: " + sobresalientes);
  }
  
}
