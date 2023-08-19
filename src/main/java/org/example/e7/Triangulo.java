package org.example.e7;

public class Triangulo implements IFiguraGeometrica {
    private double ladoUnoCM;
    private double ladoDosCM;
    private double ladoTresCm;

    public Triangulo(double ladoUnoCM, double ladoDosCM, double ladoTresCm) {
        this.ladoUnoCM = ladoUnoCM;
        this.ladoDosCM = ladoDosCM;
        this.ladoTresCm = ladoTresCm;
    }

    @Override
    public Double calcularPerimetro() {
        return ladoUnoCM+ladoDosCM+ladoTresCm;
    }

    @Override
    public Double calcularArea() {
        Double s = (ladoUnoCM + ladoDosCM + ladoTresCm)/2;
        return Math.sqrt(s*(s-ladoUnoCM)*(s-ladoDosCM)*(s-ladoTresCm));
    }
}
