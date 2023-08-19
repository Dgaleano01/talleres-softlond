package org.example.e9;

public abstract class Instrumento implements IMusica{
    private String sonido;

    public Instrumento(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
