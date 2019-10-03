
public class Ejercicio12 {
	
	public static void main (String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();
		
		System.out.println("Vamos a realizar un pequeño tipo test sobre el curso");
		Thread.sleep (3000);
		System.out.println("Cada pregunta tendrá 4 posibles respuestas, que deberás responder con a, b, c, d");
		Thread.sleep (4350);
		System.out.println("Tienes el tiempo que quieras para responder cada pregunta, piénsatelas bien!");
		Thread.sleep (4000);
		System.out.println("¡Empecemos!");
		System.out.println("------------------------------------");
		
		int nota = 0;
    
    System.out.println("1.- ¿Qué tipo de sentencia es el if?");
		System.out.println("a) Sí afirmativo b) Si condicional c) Si neutro d) Si interrogativo");
		String respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("b")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println("");  
    System.out.println("2.- ¿Cómo se declara una variable entera?");
		System.out.println("a) Con while b) Con double c) Con long d) Con int");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("d")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println(""); 
    System.out.println("3.- ¿Qué lenguaje de programación es el más usado en la actualidad?");
		System.out.println("a) Python b) Ruby c) Java d) C++");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("c")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
     
    System.out.println(""); 
    System.out.println("4.- ¿Cuál suele ser el primer programa escrito por todo programador?");
		System.out.println("a) Hola Mundo b) Cálculo de un área c) Ecuación de segundo grado d) Suma de variables");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("a")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
		
    System.out.println(""); 
    System.out.println("5.- ¿Qué significado tiene este operador lógico '!'?");
		System.out.println("a) Y b) No c) O d) Si");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("b")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println(""); 
    System.out.println("6.- ¿Cuáles de estos IDE hemos usado en clase?");
		System.out.println("a) Sublime b) NetBINS c) Atom d) Geany");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("d")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println("");   
    System.out.println("7.- ¿Cuál es la asignatura con más horas en la semana?");
		System.out.println("a) Base de Datos b) Sistemas Informáticos c) Programación d) FOL");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("c")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println("");   
    System.out.println("8.- ¿En qué asignatura estamos aprendiendo HTML?");
		System.out.println("a) Lenguaje de Marcas b) Entornos de Desarrollo c) Sistemas Informáticos d) Programación");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("a")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println("");   
    System.out.println("9.- ¿Cuál de estas sentencias es un bucle?");
		System.out.println("a) Do-for b) For c) Whale d) Loop");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("b")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    
    System.out.println("");   
    System.out.println("10.- ¿Cómo se calcula una raíz cuadrada en Java?");
		System.out.println("a) Math.srqt b) Math.srtq c) Math.sqrt d) Math.raiz");
    respuesta = System.console().readLine();
		
    if (respuesta.equalsIgnoreCase("c")) {
			System.out.println("¡Correcto! 1 punto más para el marcador");
      nota++;
		}	else {
				System.out.println("Has fallado, más suerte para la próxima");
			}
    Thread.sleep(3000);
    System.out.print("\033[H\033[2J");  
    System.out.flush();
    System.out.println("");  
    System.out.print("Calculando nota.");
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.print(".");
    Thread.sleep(1000);
    System.out.println(".");
    Thread.sleep(1000);
    
    if (nota < 5) {
      System.out.println("Deja el FIFA y ponte a estudiar anda, que has sacado un " + nota);
    } else if ((nota >= 5) && (nota <= 8)) {
      System.out.println("Menudo fenómeno, has sacado un increíble " + nota);
    } else if ((nota == 9) || (nota == 10)) {
      System.out.println("Eres el puto amo has sacado un " + nota + ", eres de otro planeta!");
    }
      Thread.sleep (3000);
    
    System.out.println("");   
    System.out.print("Programa realizado por Ismael Pacheco Torrecilla");
      
	}
}

