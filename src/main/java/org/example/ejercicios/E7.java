package org.example.ejercicios;

import java.util.Scanner;

public class E7 {
    public static void e7(){
        System.out.println("Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo: ");
        int n = scan.nextInt();
        scan.close();
        if (n<0) {
            System.out.println("El numero debe ser positivo");
            return;
        }
        System.out.println("Tabla de multiplicar del 10");
        for (int i=0; i<10;i++){
            System.out.println(n+" * "+(i+1)+" = " + (n*(i+1)));
        }
    }
}
