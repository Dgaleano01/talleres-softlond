package org.example.ejercicios;

import java.util.Scanner;

public class E4 {
    public static void e4(){
        System.out.println("Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = scan.nextInt();
        scan.close();
        String mayorOMenor = (edad>=18?"mayor":"menor");
        System.out.println("Eres " + mayorOMenor +" de edad");
    }
}
