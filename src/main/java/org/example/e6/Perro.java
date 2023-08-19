package org.example.e6;

public class Perro extends Animal{


    public Perro(String ruido) {
        super(ruido);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace " + getRuido());
    }
}
