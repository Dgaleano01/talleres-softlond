package org.example.ejercicios;

import java.util.Scanner;

public class E23 {
    public static void e23(){
        System.out.println("Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String oracion = scan.nextLine();
        scan.close();
        String[] palabras=oracion.split(" ");
        System.out.println("Esta oracion tiene " + palabras.length + " palabras");
    }
}
