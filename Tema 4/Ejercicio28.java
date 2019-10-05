
public class Ejercicio28 {
	
	public static void main (String[] args) {
		
    // Introducción programa y entrada de datos
    System.out.println("¡Vamos a jugar al piedra, papel o tijera!");
    System.out.println("------------------------------------------");
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String turno1 = System.console().readLine();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String turno2 = System.console().readLine();
    
    // Calculo del resultado según elecciones
    
    if (turno1.equalsIgnoreCase(turno2)) {
      System.out.print("Empate");
    } else {
    int ganador = 1;
    
    switch (turno2.toLowerCase()) {
      case "piedra":
        if (turno1.equalsIgnoreCase("tijera")) {
          ganador = 2;
        }
        break;
      case "papel":
        if (turno1.equalsIgnoreCase("piedra")) {
          ganador = 2;
        }
        break;
      case "tijera":
        if (turno1.equalsIgnoreCase("papel")) {
          ganador = 2;
        }
        break;
      default:
        System.out.println("ERROR: Ese movimiento no existe");
    }
    
    System.out.print("Gana el jugador " + ganador);
      }
    
	}
}

