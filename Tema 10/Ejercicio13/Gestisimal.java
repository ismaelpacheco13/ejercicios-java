package Ejercicio13;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestisimal {

  public static void main(String[] args) throws InterruptedException {
    Scanner read = new Scanner(System.in);

    int opcion;
    int primeraLibre;
    int i;
    int stockIntroducido;
    double precioDeCompraIntroducido;
    double precioDeVentaIntroducido;
    String codigo;
    String codigoIntroducido = "";
    String descripcionIntroducida;
    String precioDeCompraIntroducidoString;
    String precioDeVentaIntroducidoString;
    String stockIntroducidoString;
    boolean existeCodigo;

    //Crea el array de artículos
    ArrayList<Articulo> articulo = new ArrayList<>();

    // Menu
    do {
      System.out.println("\n\nG E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Venta");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(read.nextLine());

      switch (opcion) {

        /////////////////////////////////////////////////////////////////////////////
        // LISTADO //////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");

          for (Articulo articulo1 : articulo) {
            System.out.println(articulo1);
          }

          break;

        /////////////////////////////////////////////////////////////////////////////
        // ALTA /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 2:
          System.out.println("\nNUEVO ARTÍCULO");
          System.out.println("==============");

          // Introducción de datos 
          System.out.println("Por favor, introduzca los datos del artículo.");
          System.out.print("Código: ");
          codigoIntroducido = read.nextLine();

          // Comprueba que el código introducido no se repita
          while (articulo.contains(new Articulo(codigoIntroducido))) {
            System.out.println("Ese código ya existe en la base de datos.");
            System.out.print("Introduzca otro código: ");
            codigoIntroducido = read.nextLine();
          }

          System.out.print("Descripcion: ");
          descripcionIntroducida = read.nextLine();

          System.out.print("Precio de compra: ");
          precioDeCompraIntroducido = Double.parseDouble(read.nextLine());

          System.out.print("Precio de venta: ");
          precioDeVentaIntroducido = Double.parseDouble(read.nextLine());

          System.out.print("Stock: ");
          stockIntroducido = Integer.parseInt(read.nextLine());

          articulo.add(new Articulo(codigoIntroducido, descripcionIntroducida, precioDeCompraIntroducido, precioDeVentaIntroducido, stockIntroducido));

          break;

        /////////////////////////////////////////////////////////////////////////////
        // BAJA /////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 3:
          System.out.println("\nBAJA");
          System.out.println("====");

          System.out.print("Por favor, introduzca el código del artículo que desea dar de baja: ");
          codigoIntroducido = read.nextLine();

          if (!articulo.contains(new Articulo(codigoIntroducido))) {
            System.out.println("Lo siento, el código introducido no existe");
          } else {
            articulo.remove(new Articulo(codigoIntroducido));
            System.out.println("Artículo eliminado");
          }

          break;

        /////////////////////////////////////////////////////////////////////////////
        // MODIFICACIÓN /////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 4:
          System.out.println("\nMODIFICACIÓN");
          System.out.println("============");

          System.out.print("Por favor, introduzca el código del artículo cuyos datos desea cambiar: ");
          codigoIntroducido = read.nextLine();

          if (!articulo.contains(new Articulo(codigoIntroducido))) {
            System.out.println("El código introducido no existe.");
          } else {
            i = articulo.indexOf(new Articulo(codigoIntroducido));

            System.out.println("Introduzca los nuevos datos del artículo o INTRO para dejarlos igual.");

            System.out.println("Código: " + articulo.get(i).getCodigo());
            System.out.print("Nuevo código: ");
            codigoIntroducido = read.nextLine();
            if (!codigoIntroducido.equals("")) {
              articulo.get(i).setCodigo(codigoIntroducido);
            }

            System.out.println("Descripción: " + articulo.get(i).getDescripcion());
            System.out.print("Nueva descripción: ");
            descripcionIntroducida = read.nextLine();
            if (!descripcionIntroducida.equals("")) {
              articulo.get(i).setDescripcion(descripcionIntroducida);
            }

            System.out.println("Precio de compra: " + articulo.get(i).getPrecioDeCompra());
            System.out.print("Nuevo precio de compra: ");
            precioDeCompraIntroducidoString = read.nextLine();
            if (!precioDeCompraIntroducidoString.equals("")) {
              articulo.get(i).setPrecioDeCompra(Double.parseDouble(precioDeCompraIntroducidoString));
            }
            System.out.println("Precio de venta: " + articulo.get(i).getPrecioDeVenta());
            System.out.print("Nuevo precio de venta: ");
            precioDeVentaIntroducidoString = read.nextLine();
            if (!precioDeVentaIntroducidoString.equals("")) {
              articulo.get(i).setPrecioDeVenta(Double.parseDouble(precioDeVentaIntroducidoString));
            }
            System.out.println("Stock: " + articulo.get(i).getStock());
            System.out.print("Nuevo stock: ");
            stockIntroducidoString = read.nextLine();
            if (!stockIntroducidoString.equals("")) {
              articulo.get(i).setStock(Integer.parseInt(stockIntroducidoString));
            }
          }
          break;

        /////////////////////////////////////////////////////////////////////////////
        // ENTRADA DE MERCANCÍA /////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 5:
          System.out.println("\nENTRADA DE MERCANCÍA");
          System.out.println("====================");

          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = read.nextLine();

          i = articulo.indexOf(new Articulo(codigoIntroducido));

          if (!articulo.contains(new Articulo(codigoIntroducido))) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.println("Entrada de mercancía del siguiente artículo: ");
            System.out.println(articulo.get(i));
            System.out.print("Introduzca el número de unidades que entran al almacén: ");
            stockIntroducidoString = read.nextLine();
            articulo.get(i).setStock(Integer.parseInt(stockIntroducidoString) + articulo.get(i).getStock());
            System.out.println("La mercancía ha entrado en el almacén.");
          }

          break;

        /////////////////////////////////////////////////////////////////////////////
        // SALIDA DE MERCANCÍA //////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////
        case 6:
          System.out.println("\nVENTA");
          System.out.println("=====");

          System.out.print("Por favor, introduzca el código del artículo: ");
          codigoIntroducido = read.nextLine();

          i = articulo.indexOf(new Articulo(codigoIntroducido));

          if (!articulo.contains(new Articulo(codigoIntroducido))) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            System.out.println("Venta del siguiente artículo: ");
            System.out.println(articulo.get(i));
            System.out.print("Introduzca el número de unidades que desea vender: ");
            stockIntroducido = Integer.parseInt(read.nextLine());
            if (articulo.get(i).getStock() - stockIntroducido > 0) {
              articulo.get(i).setStock(articulo.get(i).getStock() - stockIntroducido);
              System.out.println("La venta ha sido realizada.");
              System.out.print("Generando factura");
              Thread.sleep(650); System.out.print(".");Thread.sleep(650); System.out.print(".");Thread.sleep(650); System.out.print(".");Thread.sleep(650); System.out.print(".");Thread.sleep(650); System.out.print(".");
              double precioSinIva = (articulo.get(i).getPrecioDeVenta()) * stockIntroducido;
              double iva = ((articulo.get(i).getPrecioDeVenta()) * (stockIntroducido)) * 0.21;
              System.out.println("\n\nFACTURA DE VENTA");
              System.out.println("================");
              System.out.println("Cod. Articulo: " + codigoIntroducido);
              System.out.println("Precio: " + String.format("%.2f", articulo.get(i).getPrecioDeVenta()) + "€");
              System.out.println("Cantidad: " + stockIntroducido);
              System.out.println("Precio sin IVA: " + String.format("%.2f", precioSinIva) + "€");
              System.out.println("IVA: " + String.format("%.2f", iva) + "€");
              System.out.println("----------------------");
              System.out.println("Precio Final: " + String.format("%.2f", (precioSinIva + iva)) + "€");
            } else {
              System.out.println("Lo siento, no se pueden sacar tantas unidades.");
            }
          }

          break;
      } // switch
    } while (opcion != 7);
  }
}
