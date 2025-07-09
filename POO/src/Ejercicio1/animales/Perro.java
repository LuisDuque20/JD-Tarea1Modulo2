package Ejercicio1.animales;

import Ejercicio1.tipoAnimal.Mamifero;

public class Perro extends Mamifero {
    public Perro(String nombre, double size) {
        super(nombre, size);
    }

    public void ladradar(){
        System.out.println("Woof!");
    }
}
