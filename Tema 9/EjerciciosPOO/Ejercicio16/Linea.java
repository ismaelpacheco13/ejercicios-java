
package Ejercicio16;

public class Linea {
  // Atributos
  private Punto p1;
  private Punto p2;
  
  // Métodos
  public Linea(Punto p1, Punto p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  @Override
  public String toString() {
    return "Linea formada por los puntos " + p1 + " y " + p2;
  }
  
  
}
