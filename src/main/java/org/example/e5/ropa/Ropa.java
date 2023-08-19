package org.example.e5.ropa;

import org.example.e5.Producto;

public abstract class Ropa extends Producto {

    private String talla;
    public Ropa(double valor, String talla) {
        super(valor);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
}
