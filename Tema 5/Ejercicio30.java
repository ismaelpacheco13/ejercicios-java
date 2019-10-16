
import java.util.Scanner;


public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Introduce dos horas de dos días de la semana y te diré las horas que hay entre ellos");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.print("Introduce el primer día: ");
        String primerDia = read.nextLine();
        System.out.print("Introduce la hora del primer día (formato 24h): ");
        int primerHora = Integer.parseInt(read.nextLine());
        do {
          if (primerHora < 0) {
            System.out.println("La hora no puede ser menor que 0");
            System.out.print("Introduce la hora del primer día (formato 24h): ");
            primerHora = Integer.parseInt(read.nextLine());
          }
        } while (primerHora < 0);
        System.out.print("Introduce el segundo día: ");
        String segundoDia = read.nextLine();
        System.out.print("Introduce la hora del segundo día (formato 24h): ");
        int segundaHora = Integer.parseInt(read.nextLine());
        do {
          if (segundaHora < 0) {
            System.out.println("La hora no puede ser menor que 0");
            System.out.print("Introduce la hora del segundo día (formato 24h): ");
            segundaHora = Integer.parseInt(read.nextLine());
          }
        } while (segundaHora < 0);
        
        int primerDiaNumerado = 0;
        int segundoDiaNumerado = 0;
        
        switch (primerDia.toLowerCase()) {
          case "lunes":
            primerDiaNumerado = 1;
            break;
          case "martes":
            primerDiaNumerado = 2;
            primerHora += 24;
            break;
          case "miércoles":
            primerDiaNumerado = 3;
            primerHora += 48;
            break;
          case "jueves":
            primerDiaNumerado = 4;
            primerHora += 72;
            break;
          case "viernes":
            primerDiaNumerado = 5;
            primerHora += 96;
            break;
          case "sabado":
            primerDiaNumerado = 6;
            primerHora += 120;
            break;
          case "domingo":
            primerDiaNumerado = 7;
            primerHora += 144;
            break;
        }
        
        switch (segundoDia.toLowerCase()) {
          case "lunes":
            segundoDiaNumerado = 1;
            break;
          case "martes":
            segundoDiaNumerado = 2;
            segundaHora += 24;
            break;
          case "miércoles":
            segundoDiaNumerado = 3;
            segundaHora += 48;
            break;
          case "jueves":
            segundoDiaNumerado = 4;
            segundaHora += 72;
            break;
          case "viernes":
            segundoDiaNumerado = 5;
            segundaHora += 96;
            break;
          case "sabado":
            segundoDiaNumerado = 6;
            segundaHora += 120;
            break;
          case "domingo":
            segundoDiaNumerado = 7;
            segundaHora += 144;
            break;
        }
        
        if (segundaHora > primerHora) {
          System.out.println("Entre el " + primerDia.toUpperCase() + " a las " + primerHora + "h, y el " + segundoDia.toUpperCase() + " a las " + segundaHora + "h, hay " + (segundaHora - primerHora) + " horas.");
        }
        if (primerHora > segundaHora) {
          System.out.println("Entre el " + primerDia.toUpperCase() + " a las " + segundaHora + "h, y el " + segundoDia.toUpperCase() + " a las " + segundaHora + "h, hay " + (primerHora - segundaHora) + " horas.");
        }
    }
    
}
