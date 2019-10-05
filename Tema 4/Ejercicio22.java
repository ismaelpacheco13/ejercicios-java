
public class Ejercicio22 {
	
	public static void main (String[] args) {
		
    // Introducción programa y entrada de datos (día y hora)
    System.out.println("Vamos a calcular cuánto queda para que llegue el fin de semana (Viernes-15:00)");
    System.out.println("Para ello se te pedirá el día de la semana y la hora en la que te encuentras.");
    System.out.println("El día sera (lunes-viernes) y la hora deberá ser introducida en formato 24h digital.");
    System.out.println("");
    System.out.print("Introduce el día de la semana en el que te encuentras: ");
    String dia = System.console().readLine();
    System.out.print("Introduce la hora en la que te encuentras: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce los minutos en los que te encuentras: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int finDeSemana = 6660; //Del lunes al viernes a las 15:00 hay 6660 minutos
    int minutosIntroducidos = ((hora * 60) + minutos); //Calculo de los minutos dadas las horas y minutos (sin contar el día aún)
    int lunes = 0;
    int martes = 1440;
    int miercoles = 1440 * 2;
    int jueves = 1440 * 3;
    int viernes = 1440 * 4;
    
    switch (dia.toLowerCase()) {
      case "lunes":
        System.out.print("Quedan: " + ((finDeSemana)-(lunes + minutosIntroducidos)) + " minutos");;
        break;
    
      case "martes":
        System.out.print("Quedan: " + ((finDeSemana)-(martes + minutosIntroducidos)) + " minutos");;
        break;
        
      case "miercoles": //¿Tilde?
        System.out.print("Quedan: " + ((finDeSemana)-(miercoles + minutosIntroducidos)) + " minutos");;
        break;
        
      case "jueves":
        System.out.print("Quedan: " + ((finDeSemana)-(jueves + minutosIntroducidos)) + " minutos");;
        break;
        
      case "viernes":
        System.out.print("Quedan: " + ((finDeSemana)-(viernes + minutosIntroducidos)) + " minutos");;
        break;
    }
    
    
	}
}

