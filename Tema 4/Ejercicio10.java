

public class Ejercicio10 {
	
	public static void main (String[] args) {
		
		System.out.print("Vamos a descubrir tu signo del zodiaco: ");
		System.out.print("Introduce tu día de nacimiento: ");
		int dia = Integer.parseInt(System.console().readLine());
		System.out.print ("Introduce tu mes de nacimiento: ");
		int mes = Integer.parseInt(System.console().readLine());
		
		if ((dia >= 21) && (mes == 03) || (dia <= 20) && (mes == 04)) {
			System.out.print("Tu signo del zodiaco es Aries");
		} else if ((dia >= 21) && (mes == 04) || (dia <= 20) && (mes == 05)) {
			System.out.print("Tu signo del zodiaco es Tauro");
		} else if ((dia >= 21) && (mes == 05) || (dia <= 21) && (mes == 06)) {
			System.out.print("Tu signo del zodiaco es Géminis");
		} else if ((dia >= 22) && (mes == 06) || (dia <= 22) && (mes == 07)) {
			System.out.print("Tu signo del zodiaco es Cáncer");
		} else if ((dia >= 23) && (mes == 7) || (dia <= 23) && (mes == 8)) {
			System.out.print("Tu signo del zodiaco es Leo");
		} else if ((dia >= 24) && (mes == 8) || (dia <= 22) && (mes == 9)) {
			System.out.print("Tu signo del zodiaco es Virgo");
		} else if ((dia >= 23) && (mes == 9) || (dia <= 22) && (mes == 10)) {
			System.out.print("Tu signo del zodiaco es Libra");
		} else if ((dia >= 23) && (mes == 10) || (dia <= 22) && (mes == 11)) {
			System.out.print("Tu signo del zodiaco es Escorpio");
		} else if ((dia >= 23) && (mes == 11) || (dia <= 21) && (mes == 12)) {
			System.out.print("Tu signo del zodiaco es Sagitario");
		} else if ((dia >= 22) && (mes == 12) || (dia <= 20) && (mes == 01)) {
			System.out.print("Tu signo del zodiaco es Capricornio");
		} else if ((dia >= 21) && (mes == 01) || (dia <= 19) && (mes == 02)) {
			System.out.print("Tu signo del zodiaco es Acuario");
		} else if ((dia >= 20) && (mes == 02) || (dia <= 20) && (mes == 03)) {
			System.out.print("Tu signo del zodiaco es Piscis");
		}
		
		
		
	}
}

