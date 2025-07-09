package Ejercicio4;

public class Amigo extends Contacto {
    private String apodo;

    public Amigo(String nombre, String telefono, String apodo) {
        super(nombre, telefono);
        this.apodo = apodo;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " (Amigo - '" + apodo + "') - Tel: " + telefono);
    }
}
