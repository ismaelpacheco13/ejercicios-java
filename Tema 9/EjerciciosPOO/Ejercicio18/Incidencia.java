
package Ejercicio18;

public class Incidencia {
  // Atributos
  private int codigo;
  private int numeroDePuesto;
  private String estado;
  private String descripcion;
  private String resolucion;
  
  private static int contadorCodigos = 1;
  private static int pendientes = 0;
  
  // Métodos
  public Incidencia(int numeroDePuesto, String descripcion) {
    this.numeroDePuesto = numeroDePuesto;
    this.descripcion = descripcion;
    this.estado = "Pendiente";
    this.codigo = contadorCodigos++;
    pendientes++;
  }
  
  public void resuelve(String resolucion) {
    this.resolucion = resolucion;
    this.estado = "Resuelta";
    pendientes--;
  }

  @Override
  public String toString() {
    return "Incidencia " + codigo + " - Puesto: " + numeroDePuesto + " - " + descripcion
      + " - " + estado + (estado.equals("Resuelta") ? " - " + resolucion : "");
  }

  public static int getPendientes() {
    return pendientes;
  }
          
}
