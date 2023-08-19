package org.example.e7;

import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<IFiguraGeometrica> figuras= List.of(
                new Triangulo(3.0,4.0,5.0),
                new Cuadrado(12.0),
                new Circulo(3.0)
        );

        for(IFiguraGeometrica figuraGeometrica: figuras){
            String nombre=figuraGeometrica.getClass().getSimpleName();
            System.out.println("El area del "+nombre+" es: "+ figuraGeometrica.calcularArea()+"cm2"+
                    "\nY su perimetro es: " + figuraGeometrica.calcularPerimetro()+"cm\n");
        }
    }
}