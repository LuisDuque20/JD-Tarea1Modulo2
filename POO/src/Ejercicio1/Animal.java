package Ejercicio1;

public class Animal {
    public String nombre;
    public double size;

    public Animal(String nombre, double size) {
        this.nombre = nombre;
        this.size = size;
    }

    public void moverse(){
        System.out.println(nombre + " se esta moviendo");
    }

    public void hacerSonido(){
        System.out.println("El animal hizo su sonido caracteristico");
    }
}
