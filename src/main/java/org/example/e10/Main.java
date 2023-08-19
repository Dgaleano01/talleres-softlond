package org.example.e10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras= List.of(
                new Cuadrado(),
                new Circulo(),
                new Rectangulo()
        );
        for(Figura figura:figuras){
            figura.dibujar();
            System.out.println("");
        }
    }
}
