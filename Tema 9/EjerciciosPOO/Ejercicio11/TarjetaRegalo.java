
package Ejercicio11;

public class TarjetaRegalo {
  // Atributos
  private int numero;
  private double saldo;
  
  // Métodos
  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;
    this.numero = (int)(Math.random() * 100000);
  }
  
  public TarjetaRegalo() {
    
  }
  
  public TarjetaRegalo fusionaCon(TarjetaRegalo t2) {
    TarjetaRegalo t3 = new TarjetaRegalo();
    t3.numero = (int)(Math.random() * 100000);
    t3.saldo += t2.saldo + this.saldo;
    this.saldo = 0;
    t2.saldo = 0;
    return t3;
  }
  
  public void gasta(double saldo) {
    if (saldo <= this.saldo) {
      this.saldo -= saldo;
    } else {
      System.out.println("No tiene suficiente saldo para gastar " + String.format("%.2f", saldo) + "€");
    }
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "Tarjeta nº " + this.numero + " - Saldo " + String.format("%.2f", this.saldo) + "€";
  }
  
}
