package org.example.e1;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        IFiguraGeometrica triangulo = new Triangulo(3.0,4.0,5.0);
        IFiguraGeometrica cuadrado = new Cuadrado(12.0);
        IFiguraGeometrica circulo = new Circulo(3.0);

        System.out.println("El area del "+ triangulo.getClass().getSimpleName()+" es: "+ triangulo.calcularArea()+"cm2"+
                "\nY su perimetro es: " + triangulo.calcularPerimetro()+"cm\n");

        System.out.println("El area del "+ cuadrado.getClass().getSimpleName()+" es: "+ cuadrado.calcularArea()+"cm2"+
                "\nY su perimetro es: " + cuadrado.calcularPerimetro()+"cm\n");

        System.out.println("El area del "+ circulo.getClass().getSimpleName()+" es: "+ circulo.calcularArea()+"cm2"+
                "\nY su perimetro es: " + circulo.calcularPerimetro()+"cm\n");

    }
}