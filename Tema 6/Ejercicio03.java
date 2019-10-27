
public class Ejercicio03 {

  public static void main(String[] args) {
    
    System.out.println("Programa que muestra al azar el nombre de una carta de la baraja española");
    System.out.println("--------------------------------------------------------------------------");
    
    String palo = "";
    String carta = "";
    
    int numeroPalo = (int)((Math.random() * 4));
    switch (numeroPalo) {
      case 0:
        palo = "oros";
        break;
      case 1:
        palo = "copas";
        break;
      case 2:
        palo = "bastos";
        break;
      case 3:
        palo = "espadas";
        break;
      default:
    }
    
    int numeroCarta = (int)((Math.random() * 11) + 1);
    switch (numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
  
}

