package org.example.e10;

public class Rectangulo extends Figura{
    @Override
    public void dibujar() {
        System.out.println("Rectangulo: \n");
        for (int i=0;i<6;i++){
            for (int k=0;k<9;k++){
                System.out.print("x");
            }
            System.out.println("");
        }
    }
}
