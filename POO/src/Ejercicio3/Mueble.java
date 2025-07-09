package Ejercicio3;

public class Mueble extends Producto {
    private String material;

    public Mueble(String nombre, double precio, int stock, String material) {
        super(nombre, precio, stock);
        this.material = material;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Material: " + material);
    }
}
