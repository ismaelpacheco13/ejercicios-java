
public class Ejercicio18 {
	
	public static void main (String[] args) {
		
		System.out.println("Introduce dos números enteros para recibir el rango entre ellos dos (incrementando de 7 en 7)");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.print("Introduce el primer número: ");
		int ran1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int ran2 = Integer.parseInt(System.console().readLine());
    
    if (ran1 != ran2) {
      if (ran1 > ran2) {
        for (int i = ran2; i <= ran1; i += 7) {
          System.out.print(i + " ");
        }
      } else if (ran1 < ran2) {
        for (int i = ran1; i <= ran2; i += 7) {
          System.out.print(i + " ");
        }
      }
    } else {
      System.out.print("ERROR: Los números deben ser distintos");
    }
		
	}
}

