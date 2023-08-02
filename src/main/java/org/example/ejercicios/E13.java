package org.example.ejercicios;

import java.util.Scanner;

public class E13 {
    public static void e13(){
        System.out.println("Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero decimal (debe ser escrito con coma): ");
        double n = scan.nextDouble();
        System.out.println("Ingresa la cantidad de decimales: ");
        int cant = scan.nextInt();
        scan.close();
        System.out.println(String.format("%."+cant+"f", n));

    }
}
