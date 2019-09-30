
public class Ejercicio01 {
	
  public static void main (String[] args) {
		
    System.out.print("Introduce el día de la semana del cual quieres saber la asignatura que darás a primera hora: ");
		String dia = System.console().readLine();
    
    if (dia.equalsIgnoreCase("Lunes")) {
      System.out.print("El Lunes a primera hora tienes Programación");
    }
    if (dia.equalsIgnoreCase("Martes")) {
      System.out.print("El Martes a primera hora tienes Entornos de Desarrollo");
    }
    if (dia.equalsIgnoreCase("Miércoles")) { //Problema con la tilde de Miércoles
      System.out.print("El Miércoles a primera hora tienes Programación");
    }
    if (dia.equalsIgnoreCase("Jueves")) {
      System.out.print("El Jueves a primera hora tienes Programación");
    }
    if (dia.equalsIgnoreCase("Viernes")) {
      System.out.print("El Viernes a primera hora tienes Sistemas Informáticos");
    }
	}
}

