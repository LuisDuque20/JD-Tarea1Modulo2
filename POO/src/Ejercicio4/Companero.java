package Ejercicio4;

public class Companero extends Contacto {
    private String empresa;

    public Companero(String nombre, String telefono, String empresa) {
        super(nombre, telefono);
        this.empresa = empresa;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " (Compañero en " + empresa + ") - Tel: " + telefono);
    }
}
