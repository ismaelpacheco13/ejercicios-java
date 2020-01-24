
package Ejercicio12;

public class Publicacion {
  // Atributos
  private String ISBN;
  private String titulo;
  private int anoPublicacion;
  
  // Métodos
  public Publicacion(String ISBN, String titulo, int anoPublicacion) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.anoPublicacion = anoPublicacion;
  }

  @Override
  public String toString() {
    return "ISBN: " + ISBN + ", titulo: " + titulo + ", año de publicacion: " + anoPublicacion;
  }
  
  
  
}
