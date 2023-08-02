package org.example.ejercicios;

import java.util.Scanner;

public class E3 {
    public static void e3(){
        System.out.println("Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el radio en cm: ");
        int r = scan.nextInt();
        scan.close();
        System.out.println("El area del circulo es:  "+ (Math.PI*(r*r))+" cm");
        System.out.println("El perimetro del circulo es: "+ (2*Math.PI*r)+" cm");
    }
}
