
package Ejercicio10;

public class Ameba {
  // Atributos
  private int peso;
  
  // Métodos
  public Ameba() {
    this.peso = 3;
  }
  
  public void come(int pesoComida) {
    this.peso += pesoComida - 1;
  }
  
  public void come(Ameba amebaComida) {
    this.peso += amebaComida.peso - 1;
    amebaComida.peso = 0;
  }

  @Override
  public String toString() {
    return "Soy una ameba y peso " + this.peso + " microgramos.";
  }
}
