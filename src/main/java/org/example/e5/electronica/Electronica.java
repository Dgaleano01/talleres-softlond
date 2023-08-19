package org.example.e5.electronica;

import org.example.e5.Producto;

public abstract class Electronica extends Producto {
    private int duracionBateria;
    public Electronica(double valor, int duracionBateria) {
        super(valor);
        this.duracionBateria = duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }
}
