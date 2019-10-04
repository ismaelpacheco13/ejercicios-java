
public class Ejercicio19 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduce un número positivo o negativo y te diremos cuantas cifras tiene: ");
    int num = Integer.parseInt(System.console().readLine());
    int cifras = 0;
    
    if ((num >= 0) && (num < 10)) {
      cifras = 1;
    } else if ((num >= 10) && (num < 100)) {
      cifras = 2;
    } else if ((num >=100) && (num < 1000)) {
      cifras = 3;
    } else if ((num >= 1000) && (num < 10000)) {
      cifras = 4;
    } else if ((num >= 10000) && (num < 100000)) {
      cifras = 5;
    }
    
    System.out.print("El número introducido tiene " + cifras + " cifras");
	}
}

