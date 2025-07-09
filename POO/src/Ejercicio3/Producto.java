package Ejercicio3;

public class Producto {
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - $" + precio + " - Stock: " + stock);
    }

    public boolean vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada de " + cantidad + " " + nombre);
            return true;
        } else {
            System.out.println("Stock insuficiente para vender " + nombre);
            return false;
        }
    }

    public void devolver(int cantidad) {
        stock += cantidad;
        System.out.println("Devolución de " + cantidad + " " + nombre);
    }
}
