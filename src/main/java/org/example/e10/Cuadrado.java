package org.example.e10;

public class Cuadrado extends Figura {

    @Override
    public void dibujar() {
        System.out.println("Cuadrado: \n");
        for (int i=0;i<3;i++){
            for (int k=0;k<6;k++){
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}
