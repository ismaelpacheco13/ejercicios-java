
public class Ejercicio12 {
	
	public static void main (String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();
		
		System.out.println("Vamos a realizar un pequeño tipo test sobre el curso");
		Thread.sleep (3000);
		System.out.println("Cada pregunta tendrá 4 posibles respuestas, que deberás responder con a, b, c, d");
		Thread.sleep (6000);
		System.out.println("Tienes 15s para responder cada pregunta, si tardas más seras descalificado");
		Thread.sleep (4000);
		System.out.println("¡Empecemos!");
		System.out.println("------------------------------------");
		
		System.out.println("1.- ¿Qué tipo de sentencia es el if?");
		System.out.println("a) Sí afirmativo b) Si condicional c) Si neutro d) Si interrogativo");
		String respuesta1 = System.console().readLine();
		
		if (Thread.sleep
		if (respuesta1.equalsIgnoreCase("b")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			} 
			
		
	}
}

