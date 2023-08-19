package org.example.e1;

public class Cuadrado implements IFiguraGeometrica{

    double ladoCM;

    public Cuadrado(double ladoCM) {
        this.ladoCM = ladoCM;
    }

    @Override
    public Double calcularPerimetro() {
        return ladoCM*4;
    }

    @Override
    public Double calcularArea() {
        return Math.pow(ladoCM,2);
    }
}
