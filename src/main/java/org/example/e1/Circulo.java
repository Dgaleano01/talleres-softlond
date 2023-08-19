package org.example.e1;

public class Circulo implements IFiguraGeometrica{

    private Double radio;

    public Circulo(Double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }
}
