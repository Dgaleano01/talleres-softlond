package org.example.e5.libro;

import org.example.e5.Producto;

public abstract class Libro extends Producto {
    private int cantidadHojas;

    public Libro(double valor, int cantidadHojas) {
        super(valor);
        this.cantidadHojas = cantidadHojas;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }
}
