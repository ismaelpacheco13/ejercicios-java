
package Ejercicio12;

public class Revista extends Publicacion {
  // Atributos
  private int numero;
  
  // Métodos
  public Revista(String ISBN, String titulo, int anoPublicacion, int numero) {
    super(ISBN, titulo, anoPublicacion);
    this.numero = numero;
  }
}
