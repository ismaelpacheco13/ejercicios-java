package Ejercicio13;

import java.util.Objects;

public class Articulo implements Comparable<Articulo> {
  private String codigo = "LIBRE";
  private String descripcion;
  private double precioDeCompra;
  private double precioDeVenta;
  private int stock;
  
  public Articulo(String codigo) {
    this.codigo = codigo;
  }
  
  public Articulo(String codigo, String descripcion, double precioDeCompra, double precioDeVenta, int stock) {
    this.codigo = codigo;
    this.descripcion = descripcion;
    this.precioDeCompra = precioDeCompra;
    this.precioDeVenta = precioDeVenta;
    this.stock = stock;
  }
  
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioDeCompra() {
    return precioDeCompra;
  }

  public void setPrecioDeCompra(double precioDeCompra) {
    this.precioDeCompra = precioDeCompra;
  }

  public double getPrecioDeVenta() {
    return precioDeVenta;
  }

  public void setPrecioDeVenta(double precioDeVenta) {
    this.precioDeVenta = precioDeVenta;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String toString() {
    String cadena = "------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nDescripción: " + this.descripcion;
    cadena += "\nPrecio de compra: " + this.precioDeCompra;
    cadena += "\nPrecio de venta: " + this.precioDeVenta;
    cadena += "\nStock: " + this.stock + " unidades";
    cadena += "\n------------------------------------------";
    return cadena;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 73 * hash + Objects.hashCode(this.codigo);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Articulo other = (Articulo) obj;
    if (!Objects.equals(this.codigo, other.codigo)) {
      return false;
    }
    return true;
  }

  @Override
  public int compareTo(Articulo t) {
    return (this.codigo).compareTo(t.codigo);
  }
}

