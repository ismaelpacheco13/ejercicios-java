
public class Ejercicio21 {

  public static void main(String[] args) {
    
    System.out.println("Programa que genera una secuencia de cinco monedas junto a una posición aleatoria (cara o cruz)");
    System.out.println("------------------------------------------------------------------------------------------------");
    
    int posicionAleatoria;
    String posicion = "";
    String moneda = "";
    
    for (int i = 1; i <= 5; i++) {
      posicionAleatoria = (int)(Math.random() * 2);
      
      switch (posicionAleatoria) {
        case 0:
          posicion = "cara";
          break;
        case 1:
          posicion = "cruz";
          break;
        default:
      }
      switch (i) {
        case 1:
          moneda = "2 céntimos";
          break;
        case 2:
          moneda = "20 céntimos";
          break;
        case 3:
          moneda = "50 céntimos";
          break;
        case 4:
          moneda = "1 euro";
          break;
        case 5:
          moneda = "2 euros";
          break;
        default:
      }
      System.out.println(moneda + " - " + posicion);
    }
  }
  
}
