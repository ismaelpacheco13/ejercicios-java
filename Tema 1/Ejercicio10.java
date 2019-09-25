
public class Ejercicio10 {
	public static void main (String[] args) {
		
		String rojo = "\033[31m";
		String verde = "\033[32m";
		String naranja = "\033[33m";
		String azul = "\033[34m";
		String morado = "\033[35m";
		String cyan = "\033[36m";
		String blanco = "\033[37m";
		
		System.out.printf(azul +"|\n");
		System.out.printf(azul + "|\n");
		System.out.printf(azul + "|\n");
		System.out.printf(azul + "|\n");
		System.out.printf(azul + "|\n");
		System.out.printf(azul + "|" + naranja +       "|   |                                              🌠\n");
		System.out.printf(azul + "|" + naranja +   "------------" + blanco +        "😌" + verde +      "***\n");
		System.out.printf(azul + "|" + naranja +  "|   🔥🔥🔥   |" + blanco +      "/**" + verde +     "*****\n");
		System.out.printf(azul + "|" + naranja +  "|   🔥🔥🔥   |" + blanco +     "/ **"   + verde +   "*******\n");
		System.out.printf(azul + "|" + naranja +  "|___🔥🔥🔥___|" + blanco +      "|  |"  + verde +  "*********\n");
		System.out.printf(azul + "|_____________________________📦📦📦________");
		System.out.printf(rojo);
	}
}

