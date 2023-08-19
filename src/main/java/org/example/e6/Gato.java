package org.example.e6;

public class Gato extends Animal{

    public Gato(String ruido) {
        super(ruido);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato hace " + getRuido());
    }
}
