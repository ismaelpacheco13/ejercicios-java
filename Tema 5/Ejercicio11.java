
public class Ejercicio11 {
	
	public static void main (String[] args) {
		
		System.out.println("Calculadora del cuadrado y el cubo de los 5 primeros números introducidos");
		System.out.println("--------------------------------------------------------------------------");
		
		int numero = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%-10s\n", "Número");
      System.out.printf("%s", "");
			numero = Integer.parseInt(System.console().readLine());
      double cuadrado = (Math.pow(numero, 2));
      double cubo = (Math.pow(numero, 3));
      System.out.printf("%-10s %10s\n", "Cuadrado", "Cubo");
      System.out.printf("%s   %15s\n", cuadrado, cubo);
      System.out.println("");
      System.out.println("-----------------");
    }
	}
}

