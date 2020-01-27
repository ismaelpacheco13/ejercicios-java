
package Ejercicio16;

public class Punto {
  // Atributos
  private double x;
  private double y;
  
  // Métodos
  public Punto(double coordenadaX, double coordenadaY) {
    this.x = coordenadaX;
    this.y = coordenadaY;
  }

  @Override
  public String toString() {
    return "(" + String.format("%.2f", x) + ", " + String.format("%.2f", y) + ")";
  }
  
  
}
