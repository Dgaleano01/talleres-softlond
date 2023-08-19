package org.example.e10;

public class Circulo extends Figura{
    @Override
    public void dibujar() {
        System.out.println("Circulo: \n");
        for (int i=0;i<3;i++){
            for (int k=0;k<6;k++){
                if (i==0&&k==0) System.out.print(" ");
                else if(i==0&&k==5) System.out.print(" ");
                else if(i==2&&k==0) System.out.print(" ");
                else if(i==2&&k==5) System.out.print(" ");
                else System.out.print("x");
            }
            System.out.println("");
        }
    }
}
