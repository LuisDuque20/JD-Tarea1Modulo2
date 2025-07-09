package Ejercicio3;

public class Electrodomestico extends Producto {
    private int potenciaWatts;

    public Electrodomestico(String nombre, double precio, int stock, int potenciaWatts) {
        super(nombre, precio, stock);
        this.potenciaWatts = potenciaWatts;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Potencia: " + potenciaWatts + "W");
    }
}
