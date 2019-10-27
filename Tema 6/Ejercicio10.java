
public class Ejercicio10 {

  public static void main(String[] args) {
    
    System.out.println("Programa que pinta diez líneas formadas por caracteres");
    System.out.println("-------------------------------------------------------");
    
    String caracter = "";
    int longitud;
    int numeroCaracter;
    
    for (int i = 1; i <= 10; i++) {
      
      longitud = (int)((Math.random() * 40) + 1);
      numeroCaracter = (int)(Math.random() * 6);
      
      switch (numeroCaracter) {
        case 0:
          caracter = "*";
          break;
        case 1:
          caracter = "-";
          break;
        case 2:
          caracter = "=";
          break;
        case 3:
          caracter = ".";
          break;
        case 4:
          caracter = "|";
          break;
        case 5:
          caracter = "@";
          break;
        default:
      }
      
      for (int j = 1; j <= longitud; j++) {
        System.out.print(caracter);
      }
      System.out.println("");
    }
  }
  
}
