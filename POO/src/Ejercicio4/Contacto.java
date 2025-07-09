package Ejercicio4;

public class Contacto {
    protected String nombre;
    protected String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " - Tel: " + telefono);
    }
}
