package org.example.e9;

public class Violin extends Instrumento{
    public Violin(String sonido) {
        super(sonido);
    }

    @Override
    public void tocar() {
        System.out.println("Violin: " + getSonido());
    }
}
