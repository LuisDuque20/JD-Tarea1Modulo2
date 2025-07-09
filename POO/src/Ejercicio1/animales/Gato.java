package Ejercicio1.animales;

import Ejercicio1.tipoAnimal.Mamifero;

public class Gato extends Mamifero {
    public Gato(String nombre, double size) {
        super(nombre, size);
    }

    public void maullar(){
        System.out.println("Miau!");
    }
}
