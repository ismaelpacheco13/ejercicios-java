
import java.util.Scanner;


public class Ejercicio27 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    System.out.println("Programa para jugar al piedra, papel o tijera (1 jugador)");
    System.out.println("El jugador deberá introducir su jugada (piedra, papel o tijera)");
    System.out.println("----------------------------------------------------------");
    
    System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
    String jugadaIntroducida = read.nextLine(); // Jugada del jugador en pantalla
    while ((!jugadaIntroducida.toLowerCase().equals("piedra")) && (!jugadaIntroducida.toLowerCase().equals("papel")) && (!jugadaIntroducida.toLowerCase().equals("tijera"))) {
      System.out.println("ERROR: Debe introducir piedra, papel o tijera");
      System.out.println("");
      System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
      jugadaIntroducida = read.nextLine();
    }
    
    int jugadaAleatoriaMaquina = (int)(Math.random() * 3);
    String jugadaMaquina = "";
    
    switch (jugadaAleatoriaMaquina) { // Cálculo de la jugada de la maquina
      case 0:
        jugadaMaquina = "piedra";
        break;
      case 1:
        jugadaMaquina = "papel";
        break;
      case 2:
        jugadaMaquina = "tijera";
        break;
      default:
    }
    
    System.out.println("Turno de la maquina: " + jugadaMaquina);
    
    switch (jugadaIntroducida.toLowerCase()) { // Elección del resultado
      case "piedra":
        if (jugadaAleatoriaMaquina == 0) {
          System.out.println("Empate");
        } else if (jugadaAleatoriaMaquina == 1) {
          System.out.println("Perdiste");
        } else {
          System.out.println("Ganaste");
        }
        break;
      case "papel":
        if (jugadaAleatoriaMaquina == 0) {
          System.out.println("Ganaste");
        } else if (jugadaAleatoriaMaquina == 1) {
          System.out.println("Empate");
        } else {
          System.out.println("Perdiste");
        }
        break;
      case "tijera":
        if (jugadaAleatoriaMaquina == 0) {
          System.out.println("Perdiste");
        } else if (jugadaAleatoriaMaquina == 1) {
          System.out.println("Ganaste");
        } else {
          System.out.println("Empate");
        }
        break;
      default:
    }
    System.out.println("");
  }
  
}
