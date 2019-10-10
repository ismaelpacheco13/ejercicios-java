
public class Ejercicio13 {
	
	public static void main (String[] args) {
		
    System.out.println("El Akinator de los positivos y los negativos");
    System.out.println("---------------------------------------------");
    
    int positivo = 0;
    int negativo = 0;
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce el número: ");
      int numero = Integer.parseInt(System.console().readLine());
      if (numero >= 0) {
        positivo++;
      } else if (numero < 0) {
        negativo++;
      }
    }
    System.out.println("----------------------------");
    System.out.println("Cantidad números positivos: " + positivo);
    System.out.println("Cantidad números negativos: " + negativo);
	}
}

