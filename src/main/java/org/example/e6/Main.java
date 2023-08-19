package org.example.e6;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animales= List.of(
                new Pajaro("pio pio"),
                new Perro("guau guau"),
                new Gato("miauuuu")
        );

        for (Animal animal:animales){
            animal.hacerSonido();
        }
    }
}
