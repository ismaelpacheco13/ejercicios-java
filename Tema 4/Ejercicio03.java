
public class Ejercicio03 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca un número del 1 al 7 y lo asociaremos a su correspondiente día de la semana: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaDeLaSemana;
    
    switch (dia) {
      case 1:
        diaDeLaSemana = "Lunes";
        break;
      case 2:
        diaDeLaSemana = "Martes";
        break;
      case 3:
        diaDeLaSemana = "Miércoles";
        break;
      case 4:
        diaDeLaSemana = "Jueves";
        break;
      case 5:
        diaDeLaSemana = "Viernes";
        break;
      default:
        diaDeLaSemana = "\n ERROR: No existe ese día de la semana";
    }
    System.out.print("El día " + dia + " de la semana se corresponde al " + diaDeLaSemana);
	}
}

