
public class Ejercicio17 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduce un número entero y te devolveremos por pantalla su última cifra: ");
    int numEnt = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número entero introducido es el " + (numEnt % 10));
    
	}
}

