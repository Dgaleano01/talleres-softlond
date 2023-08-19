package org.example.e9;

public class Piano extends Instrumento{


    public Piano(String sonido) {
        super(sonido);
    }

    @Override
    public void tocar() {
        System.out.println("Piano: " + getSonido());
    }
}
