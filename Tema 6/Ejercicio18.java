
public class Ejercicio18 {

  public static void main(String[] args) {
    
    System.out.println("Programa que genera de forma aleatoria una secuencia de tres colores");
    System.out.println("---------------------------------------------------------------------");
    
    int colorAleatorio;
    String color = "";
    int color1 = -1;
    int color2 = -1;
    
    for (int i = 1; i <= 3; i++) {
      colorAleatorio = (int)(Math.random() * 6);
      
      switch (colorAleatorio) {
        case 0:
          color = "rojo";
          break;
        case 1:
          color = "azul";
          break;
        case 2:
          color = "verde";
          break;
        case 3:
          color = "amarillo";
          break;
        case 4:
          color = "violeta";
          break;
        case 5:
          color = "naranja";
          break;
        default:
      }
      if (i == 1) {
        color1 = colorAleatorio;
        System.out.print(color + " ");
      } else if ((i == 2) && (color1 != colorAleatorio)) {
        color2 = colorAleatorio;
        System.out.print(color + " ");
      } else if ((i == 3) && (color1 != colorAleatorio) && (color2 != colorAleatorio)) {
        System.out.print(color + " ");
      } else {
        i--;
      }
    }
    System.out.println("");
  }
  
}
