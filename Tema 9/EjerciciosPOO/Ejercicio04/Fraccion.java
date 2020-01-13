
package Ejercicio04;

public class Fraccion {
  
  // Atributos
  int numerador;
  int denominador;
  
  // Métodos
  
  // Método invertir
  public void invertir() {
    System.out.println("\nEl invertido de " + this.numerador + "/" + this.denominador + " es: " + this.denominador + "/" + this.numerador + ".");
  }
  
  // Método simplificar
  public void simplificar(int simplificador) {
    int nm2 = 0;
    int dn2 = 0;
    if ((numerador % simplificador == 0) && (denominador % simplificador == 0)) {
      nm2 = numerador / simplificador;
      dn2 = denominador / simplificador;
      System.out.println("\nLa fracción simplificada por " + simplificador + " da como resultado: " + nm2 + "/" + dn2 + ".");
    } else {
      System.out.println("\nLa fracción no se puede simplificar entre " + simplificador + ".");
    }
  }
  
  // Método multiplicar por otra fracción
  public void multiplicar(int nm2, int dn2) {
    System.out.print("\nLa fracción multiplicada por " + nm2 + "/" + dn2 + " da como resultado: " + numerador * nm2 + "/" + denominador * dn2 + ".");
  }
  
  // Método dividir por otra fracción
  public void dividir(int nm2, int dn2) {
    System.out.print("\nLa fracción dividida por " + nm2 + "/" + dn2 + " da como resultado: " + numerador * dn2 + "/" + denominador / nm2 + ".");
  }
}
