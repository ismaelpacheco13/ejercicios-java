

public class Ejercicio05 {
	
	public static void main (String[] args) {
		
    // Programa que resuelve ecuaciones de primer grado
    System.out.print("Introduzca el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    if (a==0) {
      System.out.print("La ecuación no tiene solución real");
    } else {
      System.out.print("x= " + (-b/a));
    }
	}
}

