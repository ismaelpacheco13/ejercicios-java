
public class Ejercicio15 {
	
	public static void main (String[] args) {
		
    //Introducción y selección del carácter para la pirámide
    System.out.println("Vamos a pintar una pirámide");
    System.out.print("Introduce el cáracter con el que quieres pintar la pirámide: ");
    String caPi = System.console().readLine();
    
    //Orientación de la pirámide
    System.out.println("Estas son las posibles orientaciones para tu pirámide.");
    System.out.println("1. Hacia abajo");
    System.out.println("2. Hacia arriba");
    System.out.println("3. Hacia la izquierda");
    System.out.println("4. Hacia la derecha");
    System.out.print("Elige la orientación que quieras (1,2,3 o 4): ");
    int orPi = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (orPi) {
      case 1: //hacia arriba
        System.out.println(caPi + caPi + caPi + caPi + caPi);
        System.out.println(" " + caPi + caPi + caPi);
        System.out.println("  " + caPi);
        break;
      
      case 2: //hacia abajo
        System.out.println("  " + caPi);
        System.out.println(" " + caPi + caPi + caPi);
        System.out.println(caPi + caPi + caPi + caPi + caPi);
        break;
        
      case 3: //hacia la izquierda
        System.out.println("    " + caPi);
        System.out.println("  " + caPi + " " + caPi);
        System.out.println(caPi + " " + caPi + " " + caPi);
        System.out.println("  " + caPi + " " + caPi);
        System.out.println("    " + caPi);
        break;
        
      case 4: //hacia la derecha
        System.out.println(caPi);
        System.out.println(caPi + " " + caPi);
        System.out.println(caPi + " " + caPi + " " + caPi);
        System.out.println(caPi + " " + caPi);
        System.out.println(caPi);
        break;
      default:
    }
	}
}

