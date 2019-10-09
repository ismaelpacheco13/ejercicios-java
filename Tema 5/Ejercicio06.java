
public class Ejercicio06 {
	
	public static void main (String[] args) {
		
		System.out.println("Números del 320 al 160 restando 20 hacia atrás con do-while");
		System.out.println("------------------------------------------------------------");
		
		int i = 320;
		
		do {
			System.out.println("- " + i);
			i-=20;
		} while (i >=160);
	}
}

