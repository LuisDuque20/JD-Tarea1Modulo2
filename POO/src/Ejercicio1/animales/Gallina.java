package Ejercicio1.animales;

import Ejercicio1.tipoAnimal.Oviparo;

public class Gallina extends Oviparo {
    public Gallina(String nombre, double size) {
        super(nombre, size);
    }

    public void cacarear(){
        System.out.println("quiquiriqui");
    }
}
