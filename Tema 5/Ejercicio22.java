
public class Ejercicio22 {
	
	public static void main (String[] args) {
		
    System.out.println("Programa que muestra todos los números primos entre el 2 y el 100");
    System.out.println("------------------------------------------------------------------");


    
    for (int i = 2; i <= 100; i++) {
      int primo = 1;
      for (int j = 1; j < i; j++) {
        if ((i % j) == 0) {
           primo++;
         }
       }
        if (primo == 2) {
          System.out.print(i + " ");
        }
     }
    }
  }


