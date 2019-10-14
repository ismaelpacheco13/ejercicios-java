
public class Ejercicio21 {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce números enteros positivos y te devolveremos por pantalla la media de los impares y el mayor de los pares");
    System.out.println("Cuando no quieras introducir más datos, deberás introducir un número negativo");
    System.out.println("-------------------------------------------------------------------------------------------------");
    
    int cantidadNumeros = 0;
    int mayorPares = 0;
    int auxMayor = 0;
    int cantidadNumerosImpares = 0;
    int sumaImpares = 0;
    int numeroIntroducido;
    
    do {
      System.out.print("Introduce un número: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (((numeroIntroducido % 2) == 0) && (numeroIntroducido > 0)) {  // Sacar el mayor de los pares
        auxMayor = numeroIntroducido;
        cantidadNumeros++;
        if (auxMayor >= mayorPares) {
          mayorPares = auxMayor;
        }
      } else if (((numeroIntroducido % 2) != 0) && (numeroIntroducido > 0)) { // Media de los impares
        sumaImpares += numeroIntroducido;
        cantidadNumerosImpares++;
        cantidadNumeros++;
      }
    } while (numeroIntroducido >= 0);
    
    int mediaImpares = (sumaImpares / cantidadNumerosImpares);
    
    // Salida a pantalla de datos
    
    System.out.println("Has introducido " + cantidadNumeros + " números");
    System.out.println("La media de los números impares es: " + mediaImpares);
    System.out.println("El mayor de los números pares es: " + mayorPares);
	}
}

