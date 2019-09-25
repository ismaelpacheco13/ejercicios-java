
public class Ejercicio5 {
	public static void main (String[] args) {
		
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String cyan = "\033[36m";
		String blanco = "\033[37m";
		
		System.out.printf("%-9s %-10s %-13s %-10s %-10s \n" , "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
		System.out.println("-------------------------------------------------------");
		System.out.printf("%-14s %-15s %-18s %-15s %-10s \n" , morado + "PRO", verde + "EDD", morado + "PRO", morado + "PRO", rojo + "SINF");
		System.out.printf("%-14s %-15s %-18s %-15s %-10s \n" , morado + "PRO", naranja + "LM", morado + "PRO", morado + "PRO", rojo + "SINF");
		System.out.printf("%-14s %-15s %-18s %-15s %-10s \n" , morado + "PRO", naranja + "LM", morado + "PRO", verde + "EDD", rojo + "SINF");
		System.out.printf("%-14s %-15s %-18s %-15s %-10s \n" , azul + "BBDD", rojo + "SINF", azul + "BBDD", verde + "EDD", cyan + "FOL");
		System.out.printf("%-14s %-15s %-18s %-15s %-10s \n" , azul + "BBDD", rojo + "SINF", azul + "BBDD", naranja + "LM", cyan + "FOL");
		System.out.printf("%-14s %-15s %-18s %-15s %-10s " , azul + "BBDD", rojo + "SINF", azul + "BBDD", naranja + "LM", cyan + "FOL");
		System.out.printf(blanco +"");
	}
}

