
public class Ejercicio15 {
	
	public static void main (String[] args) {
		
		System.out.println("Calculadora potencias (rango entre 1 y exponente introducido)");
		System.out.println("--------------------------------------------------------------");
		System.out.print("Introduce la base: ");
		double baseIntroducida = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce el exponente: ");
		int exponenteIntroducido = Integer.parseInt(System.console().readLine());
		
		int potencia;
		int exponente;
		
		for (int i = 1; i <= exponenteIntroducido; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= baseIntroducida;
      }
      
      System.out.println(baseIntroducida + "^" + i + " = " + potencia);
    }
	}
}

