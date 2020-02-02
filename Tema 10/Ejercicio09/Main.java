
package Ejercicio09;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    
    ArrayList<Carta> carta = new ArrayList<>();
    
    for (int i = 0; i < 10; i++) {
      Carta cartaGenerada = new Carta();
      
      do {
        cartaGenerada = new Carta();
      } while (carta.contains(cartaGenerada));
      carta.add(cartaGenerada);
      
      System.out.println(cartaGenerada);
    }
    
    System.out.println("\nLista de cartas ordenadas");
    Collections.sort(carta);
    
    for (Carta carta1 : carta) {
      System.out.println(carta1);
    }
  }
  
}
