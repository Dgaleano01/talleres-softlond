package org.example.e6;

public abstract class Animal implements HacerSonido{
    private String ruido;

    public Animal(String ruido) {
        this.ruido = ruido;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }
}
