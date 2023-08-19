package org.example.e5.electronica;

public class Celular extends Electronica{
    private String modelo;
    public Celular(double valor, int duracionBateria, String modelo) {
        super(valor, duracionBateria);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double calcularPrecio() {
        return getValor();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular modelo "+ modelo + " con una duracion de bateria de "+ getDuracionBateria() + " horas");
    }
}
