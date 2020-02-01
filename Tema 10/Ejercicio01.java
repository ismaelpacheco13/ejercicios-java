
import java.util.ArrayList;


public class Ejercicio01 {

  public static void main(String[] args) {
    
    ArrayList<String> nombre = new ArrayList<>();
    
    nombre.add("Juan");
    nombre.add("Diego");
    nombre.add("Ismael");
    nombre.add("Javi");
    nombre.add("Pablo");
    nombre.add("Miguel");
    
    for (String string : nombre) {
      System.out.println(string);
    }
  }
  
}
