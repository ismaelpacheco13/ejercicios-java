
public class Ejercicio08 {
	
	public static void main (String[] args) {
		
    System.out.println("Generador de tablas de multiplicar");
    System.out.println("-----------------------------------");
    System.out.print("Introduce un número del 1 al 10 para generar su tabla de multiplicar: ");
    int numeroTabla = Integer.parseInt(System.console().readLine());
    
    int i = 1;
    
    do {
      if ((numeroTabla >= 1) && (numeroTabla <=10)) {
        System.out.println("- " + numeroTabla + " x " + i + " = " + (numeroTabla*i));
        i++;
      } else {
        System.out.println("El número introducido no está entre el 1 y el 10");
      }
    } while (((numeroTabla >= 1) && (numeroTabla <= 10)) && ((i >=1) && (i <= 10)));
	}
}

