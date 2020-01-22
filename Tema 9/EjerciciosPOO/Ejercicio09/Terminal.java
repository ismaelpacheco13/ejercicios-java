
package Ejercicio09;

public class Terminal {
  // Atributos
  private int tiempoConversacion;
  private String numero;
  
  // Métodos
  public Terminal(String numero) {
    this.numero = numero;
    this.tiempoConversacion = 0;
  }
  
  public void llama(Terminal t, int segundosDeLlamada) {
    this.tiempoConversacion += segundosDeLlamada;
    t.tiempoConversacion += segundosDeLlamada;
  }

  @Override
  public String toString() {
    return "Nº " + this.numero + " - " + this.tiempoConversacion + "s de conversación";
  }
  
  public String getNumero() {
    return numero;
  }
  
  public void setNumero(String numero) {
    this.numero = numero;
  }
  
  public int getTiempoDeConversacion() {
    return tiempoConversacion;
  }
  
  public void setTiempoDeConversacion(int tiempoDeConversacion) {
    this.tiempoConversacion = tiempoDeConversacion;
  }
  
}
