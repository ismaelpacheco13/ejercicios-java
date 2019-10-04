

public class Ejercicio20 {
	
	public static void main (String[] args) {
    
    boolean capicua = false;
    
    System.out.print("Introduce un número entero positivo (hasta 5 cifras) y te diremos si es capicúa: ");
    int num = Integer.parseInt(System.console().readLine());
    
    
    // 1 cifra
    if (num < 10) {
      capicua = true;
    }
    
    // 2 cifras
    if ((num >= 10) && (num < 100)) {
      if ((num / 10) == (num % 10)) {
        capicua = true;
      }
    }

    // 3 cifras
    if ((num >= 100) && (num < 1000)) {
      if ((num / 100) == (num % 10)) {
        capicua = true;
      }
    }

    // 4 cifras
    if ((num >= 1000) && (num < 10000)) {
      if (((num / 1000) == (num % 10)) && ((( num / 100 ) % 10)== (( num / 10) % 10))) {
        capicua = true;
      }
    }
    
    // 5 cifras
    if (num >= 10000) {
      if (((num / 10000) == (num % 10) ) && ((((num / 1000) % 10)) == ((num / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("El número introducido es capicúa.");
    } else {
      System.out.println("El número introducido no es capicúa.");
    }
	}
}

