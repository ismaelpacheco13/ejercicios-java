
public class Ejercicio09 {
	
	public static void main (String[] args) {
		
		System.out.println("Vamos a calcular una ecuación de segundo grado.");
		System.out.print("Introduce el valor de a: ");
		double a = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce el valor de b: ");
		double b = Double.parseDouble(System.console().readLine());
		System.out.print("Introduce el valor de c: ");
		double c = Double.parseDouble(System.console().readLine());
		
		double raizEcuacion = ((b*b)-4*a*c);
		double ecuacionPositiva = ((-b + Math.sqrt(raizEcuacion)) / 2*a);
		double ecuacionNegativa = ((-b - Math.sqrt(raizEcuacion)) / 2*a);
		
		if (a == 0) {
			System.out.print("La ecuación no tiene solución");
		} else if (raizEcuacion < 0) {
			System.out.print("La ecuación no tiene solución real");
		} else {
			System.out.println("La primera solución es: " + String.format("%.2f", ecuacionPositiva));
			System.out.print("La segunda solución es: " + String.format("%.2f", ecuacionNegativa));
		}
	}
}

