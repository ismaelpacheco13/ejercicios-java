
public class Ejercicio18 {
	
	public static void main (String[] args) {
		
    System.out.print("Introduce un número entero positivo y te devolveremos por pantalla su primera cifra (se permiten hasta 5 cifras): ");
    int numEnt = Integer.parseInt(System.console().readLine());
    
    int priEnt = 0; //Variable entera que representará la primera cifra del número entero introducido
    
    if ((numEnt >= 0) && (numEnt < 10)) {
      priEnt = numEnt;
    } else if ((numEnt >= 10) && (numEnt < 100)) {
      priEnt = numEnt / 10;
    } else if ((numEnt >=100) && (numEnt < 1000)) {
      priEnt = numEnt / 100;
    } else if ((numEnt >= 1000) && (numEnt < 10000)) {
      priEnt = numEnt / 1000;
    } else if ((numEnt >= 10000) && (numEnt < 100000)) {
      priEnt = numEnt / 10000;
    }
    
    System.out.println("La primera cifra del número introducido es el " + priEnt); //Salida a pantalla del resultado (primera cifra núm introducido)
    
	}
}

