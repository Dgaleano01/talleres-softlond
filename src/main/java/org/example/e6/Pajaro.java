package org.example.e6;

public class Pajaro extends Animal{

    public Pajaro(String ruido) {
        super(ruido);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pajaro hace " + getRuido());
    }
}
