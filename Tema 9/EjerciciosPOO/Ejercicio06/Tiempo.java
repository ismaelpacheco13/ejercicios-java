
package Ejercicio06;

public class Tiempo {
  // Atributos
  private int horas;
  private int minutos;
  private int segundos;
  
  // Metodos
  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  @Override
  public String toString() {
    return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
  }
  
  public void suma(int horas, int minutos, int segundos) {
    this.horas += horas;
    this.minutos += minutos;
    this.segundos += segundos;
    
    while (this.segundos >= 60) {
      this.minutos += 1;
      this.segundos = this.segundos - 60;
    }
    
    while (this.minutos >= 60) {
      this.horas += 1;
      this.minutos = this.minutos - 60;
    } 
  }
  
  public void resta(int horas, int minutos, int segundos) {
    this.horas -= horas;
    this.minutos -= minutos;
    this.segundos -= segundos;
    
    if ((this.horas < 0) || (this.minutos < 0) || (this.segundos < 0)) {
      System.out.println("No se puede realizar esa resta");
      this.horas += horas;
      this.minutos += minutos;
      this.segundos += segundos;
    }
  }
}
