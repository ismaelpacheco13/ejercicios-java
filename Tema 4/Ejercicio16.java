
public class Ejercicio16 {
	
	public static void main (String[] args) {
		
    int nota = 0;
    //Introducción programa
    System.out.println("Vamos a descubrir si tu pareja te está siendo infiel.");
    System.out.println("A continuación te haremos una serie de preguntas que revelarán si se esta produciéndo una infidelidad o no.");
    System.out.println("Debes de contestar con 'Verdadero' o 'Falso'.");
    System.out.println("------------------------------------------------------------------------------");
    
    //Inicio preguntas test
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.print("Respuesta: ");
    String respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("9. Has notado que últimamente se perfuma más.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    System.out.print("Respuesta: ");
    respuesta = System.console().readLine();
    System.out.println("");
    
    if (respuesta.equalsIgnoreCase("Verdadero")) {
      nota++; nota++; nota++;
    } else {
      nota = nota;
    }
    
    //Nota y veredicto final
    System.out.println("Tienes una puntuación de " + nota);
    
    if ((nota>=0) && (nota<=10)) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } else if ((nota>=11) && (nota<=22)) {
      System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if ((nota>=23) && (nota<=30)) {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }
	}
}

