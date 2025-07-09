package Ejercicio1.animales;

import Ejercicio1.tipoAnimal.Oviparo;

public class Cocodrilo extends Oviparo {

    public Cocodrilo(String nombre, double size) {
        super(nombre, size);
    }

    public void nadar(){
        System.out.println("El cocodirlo esta nadando");
    }
}
