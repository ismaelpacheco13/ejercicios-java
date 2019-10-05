
public class Ejercicio21 {
	
	public static void main (String[] args) {
		
    //Introducción programa y entrada de datos de notas
    System.out.println("Boletín 1er Trimestre Programación.");
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la nota del segundo examen: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    double media = ((nota1 + nota2) / 2);
    
    if ((media >=5) && (media <=10)) {
      System.out.print("Tu nota media de Programación es: " + (String.format("%.2f", media)));
    } else if ((media >=0) && (media <5)) {
      System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
      String resRec = System.console().readLine();
      System.out.println("");
        if (resRec.equalsIgnoreCase("apto")) {
          System.out.print("Tu nota de programación es: 5");
        } else if (resRec.equalsIgnoreCase("no apto")) {
          System.out.print("Tu nota de programación es: " + (String.format("%.2f", media)));
        }
      }
    
    
	}
}

