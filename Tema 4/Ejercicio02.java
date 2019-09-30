
public class Ejercicio02 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduzca la hora en la que se encuentra: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >=6) && (hora <=12)) { 
      System.out.print("Buenos días");
    }
    if ((hora >=13) && (hora<=20)) {
      System.out.print("Buenas tardes");
    }
    if (((hora >=21) && (hora <24)) || ((hora >=0) && (hora <=5))) {
      System.out.print("Buenas noches");
    }
    if ((hora >=24) || (hora <0)) {
      System.out.print ("La hora introducida no es correcta");
    }
	}
}
