
public class Ejercicio02 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra al azar el nombre de una carta de la baraja francesa");
    System.out.println("--------------------------------------------------------------------------");
    
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)((Math.random() * 4) + 1);
    switch (numeroPalo) {
      case 1:
        palo = "picas";
        break;
      case 2:
        palo = "corazones";
        break;
      case 3:
        palo = "diamantes";
        break;
      case 4:
        palo = "tréboles";
        break;
      default:
    }
    
    int numeroCarta = (int)((Math.random() * 13) + 1);
    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
  
}
