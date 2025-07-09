package Ejercicio4;

public class Cita {
    private Contacto contacto;
    private String fecha;
    private String descripcion;

    public Cita(Contacto contacto, String fecha, String descripcion) {
        this.contacto = contacto;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public void mostrarCita() {
        System.out.println("Cita con: " + contacto.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Motivo: " + descripcion);
    }
}

