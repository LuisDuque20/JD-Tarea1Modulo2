package Ejercicio1;

import Ejercicio1.animales.Cocodrilo;
import Ejercicio1.animales.Gallina;
import Ejercicio1.animales.Gato;
import Ejercicio1.animales.Perro;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Mike", 80);
        Gato gato = new Gato("Cotton", 40);
        Gallina gallina = new Gallina("Sofia", 10);
        Cocodrilo cocodrilo = new Cocodrilo("Coco", 200);

        //Para los mamiferos
        perro.moverse();
        perro.ladradar();
        perro.hacerSonido();
        perro.alimentarCria();

        gato.moverse();
        gato.maullar();
        gato.hacerSonido();
        gato.alimentarCria();

        //Para los oviparos
        gallina.moverse();
        gallina.ponerHuevos();
        gallina.hacerSonido();
        gallina.cacarear();

        cocodrilo.ponerHuevos();
        cocodrilo.moverse();
        cocodrilo.nadar();
        cocodrilo.hacerSonido();
    }
}
