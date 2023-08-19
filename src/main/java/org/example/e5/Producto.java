package org.example.e5;

public abstract class Producto implements IProducto {
    private double valor;

    public Producto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
