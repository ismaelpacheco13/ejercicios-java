
public class Ejercicio13 {
	
	public static void main (String[] args) {
		
    System.out.println("Vamos a ordenar de mayor a menor tres números enteros");
    System.out.print("Introduce el primer número: ");
    int n1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int n2 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el tercer número: ");
    int n3 = Integer.parseInt(System.console().readLine());
    
    if ((n1>n2) && (n2>n3)) {
      System.out.print("Estarían ordenados tal que así: " + n1 + ", " + n2 + ", " + n3);
    } else if ((n1<n2) && (n2<n3)) {
      System.out.print("Estarían ordenados tal que así: " + n3 + ", " + n2 + ", " + n1);
    } else if ((n2>n1) && (n1<n3)) {
      System.out.print("Estarían ordenados tal que así: " + n2 + ", " + n3 + ", " + n1);
    } else if ((n3>n1) && (n1>n2)) {
      System.out.print("Estarían ordenados tal que así: " + n3 + ", " + n1 + ", " + n2);
    } else if ((n2>n1) && (n1>n3)) {
      System.out.print("Estarían ordenados tal que así: " + n2 + ", " + n1 + ", " + n3);
    } else if ((n1>n3) && (n2<n3)) {
      System.out.print("Estarían ordenados tal que así: " + n1 + ", " + n3 + ", " + n2);
    }
	}
}

