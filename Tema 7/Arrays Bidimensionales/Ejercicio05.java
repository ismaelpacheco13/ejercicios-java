
public class Ejercicio05 {

  public static void main(String[] args) {
    
    int [][] arrayAleatorio = matematicas.funcionesArrayBi.generaArrayBiInt(6, 10, 0, 1000);
    int minimo = matematicas.funcionesArrayBi.minimoArrayBiInt(arrayAleatorio);
    int maximo = matematicas.funcionesArrayBi.maximoArrayBiInt(arrayAleatorio);
    int [] coordenadasMinimo = matematicas.funcionesArrayBi.coordenadasEnArrayBiInt(arrayAleatorio, minimo);
    int [] coordenadasMaximo = matematicas.funcionesArrayBi.coordenadasEnArrayBiInt(arrayAleatorio, maximo);
    
    System.out.print("Coordenadas del mínimo: ");
    matematicas.funcionesArray.muestraArrayInt(coordenadasMinimo);
    System.out.print("\nCoordenadas del máximo: ");
    matematicas.funcionesArray.muestraArrayInt(coordenadasMaximo);
  }
  
}
