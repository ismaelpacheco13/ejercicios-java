
import java.util.HashMap;
import java.util.Scanner;


public class Ejercicio06 {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    
    HashMap<String, String> login = new HashMap<>();
    
    String nombreUsuario;
    String contrasena;
    int intentos = 3;
    
    login.put("Ismael", "Pacheco");
    
    System.out.println("LOGIN");
    System.out.println("=====");
    System.out.print("Introduce el nombre de usuario (Ismael): ");
    nombreUsuario = read.nextLine();
    while (!login.containsKey(nombreUsuario)) {
      System.out.println("El nombre de usuario introducido no existe.");
      System.out.print("Vuelve a introducir el nombre de usuario: ");
      nombreUsuario = read.nextLine();
    }
    
    System.out.print("\nIntroduce la contraseña (Pacheco): ");
    contrasena = read.nextLine();
    while (!login.containsValue(contrasena) && intentos > 1) {
      intentos--;
      System.out.println("La contraseña introducida no es correcta.");
      System.out.println("Te quedan " + intentos + " intentos.");
      System.out.print("\nVuelve a introducir la contraseña: ");
      contrasena = read.nextLine();
    }
    
    if (login.containsValue(contrasena) && login.containsKey(nombreUsuario)) {
      System.out.println("Ha iniciado sesión correctamente");
    } else {
      System.out.println("\nAgotaste los intentos, bloqueando la cuenta..");
    }
  }
  
}
