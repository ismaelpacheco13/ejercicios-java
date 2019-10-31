
public class Ejercicio15 {

  public static void main(String[] args) {
    
    System.out.println("Programa que genera una melodía");
    System.out.println("--------------------------------");
    
    int numeroAleatorio;
    int compases = (int)(Math.random() * 7) + 1;
    String nota = "";
    String primeraNota = "";
    
    for (int i = 1; i < compases; i++) {
      for (int j = 1; j <= 4; j++) {
        numeroAleatorio = (int)(Math.random() * 7);
        
        switch (numeroAleatorio) {
          case 0:
            nota = "do";
            break;
          case 1:
            nota = "re";
            break;
          case 2:
            nota = "mi";
            break;
          case 3:
            nota = "fa";
            break;
          case 4:
            nota = "sol";
            break;
          case 5:
            nota = "la";
            break;
          case 6:
            nota = "si";
            break;
          default:
        }
        if ((j == 1) && (compases > 1) && (i == 1)) {
          primeraNota = nota;
        }
        
      System.out.print(nota + " ");
     }
      System.out.print("| ");
    }
    
    // Ultimo patrón
    for (int i = 1; i <= 3; i++) {
      numeroAleatorio = (int)(Math.random() * 7);
        
        switch (numeroAleatorio) {
          case 0:
            nota = "do";
            break;
          case 1:
            nota = "re";
            break;
          case 2:
            nota = "mi";
            break;
          case 3:
            nota = "fa";
            break;
          case 4:
            nota = "sol";
            break;
          case 5:
            nota = "la";
            break;
          case 6:
            nota = "si";
            break;
          default:
        }
        if ((compases == 1) && (i == 1)) {
          primeraNota = nota;
        }
        System.out.print(nota + " ");
    }
    System.out.print(primeraNota + " ||");
    System.out.println("");
  }
  
}
