package org.example.ejercicios;

import java.util.Scanner;

public class E11 {
    public static void e11(){
        System.out.println("Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón. El usuario debe ingresar las longitudes de los tres lados.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el lado 1: ");
        float l1 = scan.nextFloat();
        System.out.println("Ingresa el lado 2: ");
        float l2 = scan.nextFloat();
        System.out.println("Ingresa el lado 3: ");
        float l3 = scan.nextFloat();
        scan.close();
        float s = (l1+l2+l3)/2;
        double areaTriangulo= Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        System.out.println("El area del triangulo es: "+ areaTriangulo);

    }
}
