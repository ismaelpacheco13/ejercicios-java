
public class Ejercicio14 {
	
	public static void main (String[] args) {
		
    System.out.println("Vamos a averiguar si el número es par o divisible entre 5: ");
    System.out.print("Introduce el número(entero): ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero % 2) == 0) {
      System.out.println("El número es par.");
    } else {
      System.out.println("El número es impar.");
    }
    
    if ((numero % 5) == 0) {
      System.out.print("El número es divisible entre 5.");
    } else {
      System.out.print("El número no es divisible entre 5.");
    }
	}
}

