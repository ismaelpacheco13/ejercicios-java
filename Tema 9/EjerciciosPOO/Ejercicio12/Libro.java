
package Ejercicio12;

public class Libro extends Publicacion {
  // Atributos
  private boolean prestado = false;
  
  // Métodos
  public Libro(String ISBN, String titulo, int anoPublicacion) {
    super(ISBN, titulo, anoPublicacion);
  }
  
  public void presta() {
    if (this.prestado) {
      System.out.println("Lo siento, ese libro ya está prestado");
    } else {
      this.prestado = true;
    }
  }
  
  public void devuelve() {
    this.prestado = false;
  }
  
  @Override
  public String toString() {
    return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
  }
  
  public boolean estaPrestado() {
    return this.prestado;
  }
}
