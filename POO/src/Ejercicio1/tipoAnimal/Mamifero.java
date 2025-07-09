package Ejercicio1.tipoAnimal;

import Ejercicio1.Animal;

public class Mamifero extends Animal {

    public Mamifero(String nombre, double size) {
        super(nombre, size);
    }

    public void alimentarCria(){
        System.out.println(nombre + " esta alimentando a su cria");
    }

}
