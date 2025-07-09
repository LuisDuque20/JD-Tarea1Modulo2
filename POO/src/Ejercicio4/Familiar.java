package Ejercicio4;

public class Familiar extends Contacto {
    private String parentesco;

    public Familiar(String nombre, String telefono, String parentesco) {
        super(nombre, telefono);
        this.parentesco = parentesco;
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " (Familiar - " + parentesco + ") - Tel: " + telefono);
    }
}

