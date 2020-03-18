
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio03 {

  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Uso del programa: Ejercicio03 FICHERO1 FICHERO2 MEZCLA");
      System.exit(-1);
    }
    try {
      BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
      BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

      String linea1 = "";
      String linea2 = "";

      while ((linea1 != null) || (linea2 != null)) {
        linea1 = bf1.readLine();
        linea2 = bf2.readLine();

        if (linea1 != null) {
          bw.write(linea1 + "\n");
        }

        if (linea2 != null) {
          bw.write(linea2 + "\n");
        }
      }

      bf1.close();
      bf2.close();
      bw.close();

    } catch (IOException ioe) {
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}
