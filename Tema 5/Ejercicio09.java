
public class Ejercicio09 {
	
	public static void main (String[] args) {
		
    System.out.println("Contador dígitos número introducido");
    System.out.println("------------------------------------");
    System.out.print("Introduce el número del cual quieras saber su cantidad de dígitos: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int n = numeroIntroducido;
    int numeroDigitos = 1;
    
    while (n >= 10) {
      n /= 10;
      numeroDigitos++;
    }
    
    System.out.print("El número introducido tiene " + numeroDigitos + " dígito/s");
      
	}
}

