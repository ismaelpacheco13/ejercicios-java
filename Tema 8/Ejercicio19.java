
package matematicas;

import java.util.Scanner;

public class Ejercicio19 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    String resultado = "";
    long numeroIntroducido = 0;
    
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = Integer.parseInt(read.nextLine());
    
    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = read.nextLine();
    
    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    
    switch (opcion) {
      case 1:
        resultado = Long.toString(Ejercicio01hasta14.binarioAOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(Ejercicio01hasta14.binarioADecimal(numeroIntroducido));
        break;
      case 3:
        resultado = Ejercicio01hasta14.binarioAHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(Ejercicio01hasta14.octalABinario(numeroIntroducido));
        break;
      case  5:
        resultado = Long.toString(Ejercicio01hasta14.binarioADecimal(Ejercicio01hasta14.octalABinario(numeroIntroducido)));
        break;
      case  6:
        resultado = Ejercicio01hasta14.binarioAHexadecimal(Ejercicio01hasta14.octalABinario(numeroIntroducido));
        break;
      case  7:
        resultado = Long.toString(Ejercicio01hasta14.decimalABinario(numeroIntroducido));
        break;
      case  8:
        resultado = Long.toString(Ejercicio01hasta14.binarioAOctal(Ejercicio01hasta14.decimalABinario(numeroIntroducido)));
        break;
      case  9:
        resultado = Ejercicio01hasta14.binarioAHexadecimal(Ejercicio01hasta14.decimalABinario(numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(Ejercicio01hasta14.hexadecimalABinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(Ejercicio01hasta14.binarioAOctal(Ejercicio01hasta14.hexadecimalABinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(Ejercicio01hasta14.binarioADecimal(Ejercicio01hasta14.hexadecimalABinario(numeroIntroducidoString)));
        break;
    }
    System.out.println(resultado);
  }
  
}
