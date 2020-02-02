
package Ejercicio08;

import java.util.ArrayList;

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
  }
  
}
