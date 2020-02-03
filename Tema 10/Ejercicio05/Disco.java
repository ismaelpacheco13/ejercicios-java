
package Ejercicio05;

import java.util.Objects;

public class Disco implements Comparable<Disco> {
  // Atributos
  private String codigo;
  private String autor;
  private String titulo;
  private String genero;
  private int duracion; // duración en minutos
  
  // Métodos

  public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
    this.codigo = codigo;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }
  
  public Disco(String codigo) {
    this.codigo = codigo;
  }
  
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getDuracion() {
    return duracion;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  @Override
  public String toString() {
    String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        
     return cadena;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 47 * hash + Objects.hashCode(this.codigo);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Disco other = (Disco) obj;
    if (!Objects.equals(this.codigo, other.codigo)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Disco t) {
    return (this.codigo).compareTo(t.codigo);
  }
  
  
  
}
