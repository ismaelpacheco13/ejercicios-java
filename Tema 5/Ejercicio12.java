
public class Ejercicio12 {
	
	public static void main (String[] args) {
		
    System.out.println("Espiral de fibonacci de n números");
    System.out.println("----------------------------------");
    System.out.print("Introduce cuántos números quieres que constituyan la espiral: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("");
    System.out.print("0");
    
    int f1 = 0;
    int f2 = 1;
    int aux;
    
    for (int i = 1; i <= (n - 1); i++) {
      aux = f1;
      f1 = f2;
      f2 = aux + f2;
      System.out.print(", " + f2);
    }
	}
}

