package Ejercicio1.tipoAnimal;

import Ejercicio1.Animal;

public class Oviparo extends Animal {

    public Oviparo(String nombre, double size) {
        super(nombre, size);
    }

    public void ponerHuevos(){
        System.out.println(nombre + " esta poniendo huevos");
    }
}
