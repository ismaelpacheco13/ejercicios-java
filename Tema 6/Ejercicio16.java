
public class Ejercicio16 {

  public static void main(String[] args) {
    
    System.out.println("Simulador de tragaperras simplificada");
    System.out.println("--------------------------------------");
    
    int cartaAleatoria;
    String carta = "";
    int carta1 = 0;
    int carta2 = 0;
    int carta3 = 0;
    
    for (int i = 1; i <= 3; i++) {
      cartaAleatoria = (int)(Math.random() * 5);
      
      switch(cartaAleatoria) {
        case 0:
          carta = "corazón";
          break;
        case 1:
          carta = "diamante";
          break;
        case 2:
          carta = "herradura";
          break;
        case 3:
          carta = "campana";
          break;
        case 4:
          carta = "limón";
          break;
        default:
      }
      
      switch(i) {
        case 1:
          carta1 = cartaAleatoria;
          break;
        case 2:
          carta2 = cartaAleatoria;
          break;
        case 3:
          carta3 = cartaAleatoria;
          break;
        default:
      }
      System.out.print(carta + " ");
    }
    System.out.println("");
    if ((carta1 != carta2) && (carta1 != carta3) && (carta2 != carta3)) {
      System.out.println("Lo siento, ha perdido");
    } else if ((carta1 == carta2) && (carta1 == carta3)) {
      System.out.println("¡Enhorabuena, ha ganado 10 monedas!");
    } else {
      System.out.println("Bien, ha recuperado su moneda");
    }
  }
  
}
