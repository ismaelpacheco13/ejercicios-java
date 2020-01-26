
package Ejercicio13;

public class CuentaCorriente {
  // Atributos
  private String numeroDeCuenta = "";
  private double saldo;
  
  // Métodos
  public CuentaCorriente() {
    this.generaNumero();
    this.saldo = 0;
  }
  
  public CuentaCorriente(double saldo) {
    this.generaNumero();
    this.saldo = saldo;
  }
  
  private void generaNumero() {
    for (int i = 0; i < 10; i++) {
      numeroDeCuenta += (int) (Math.random() * 10);
    }
  }
  
  public void ingreso(double cantidad) {
    this.saldo += cantidad;
  }
  
  public void cargo(double cantidad) {
    this.saldo -= cantidad;
  }
  
  public void transferencia(CuentaCorriente cuenta, double cantidad) {
    cuenta.saldo += cantidad;
    this.saldo -= cantidad;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "Número de cta: " + this.numeroDeCuenta + " Saldo: " + String.format("%.2f", this.saldo) + " €";
  }
  
}
