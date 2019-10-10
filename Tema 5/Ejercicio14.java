
public class Ejercicio14 {
	
	public static void main (String[] args) {
		
    System.out.println("Calculadora de potencias");
    System.out.println("-------------------------");
    System.out.print("Introduce la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
    
    //Hay tres casos
    
    //Exponente = 0
    if (exponente == 0) {
      potencia = 1;
    }
    //Exponente > 0
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    //Exponente < 0
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
	}
}

