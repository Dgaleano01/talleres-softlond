package org.example.e9;

public class Guitarra extends Instrumento{

    public Guitarra(String sonido) {
        super(sonido);
    }

    @Override
    public void tocar() {
        System.out.println("Guitarra: " + getSonido());
    }
}
