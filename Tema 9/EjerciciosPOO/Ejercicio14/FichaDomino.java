
package Ejercicio14;

public class FichaDomino {
  // Atributos
  private int lado1;
  private int lado2;
  
  // Métodos
  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }
  
  public FichaDomino voltea() {
    return new FichaDomino (lado2, lado1);
  }
  
  public boolean encaja(FichaDomino f2) {
    if (this.lado1 == f2.lado1) {
      return true;
    } else if (this.lado1 == f2.lado2) {
      return true;
    } else if (this.lado2 == f2.lado1) {
      return true;
    } else if (this.lado2 == f2.lado2) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    if (this.lado1 == 0) { 
      return "[ " + "|" + this.lado2 + "]";
    } else if (this.lado2 == 0) {
      return "[" + this.lado1 + "|" + " ]";
    } else {
      return "[" + this.lado1 + "|" + this.lado2 + "]";
    }
  }
  
  
  
}
