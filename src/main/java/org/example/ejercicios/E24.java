package org.example.ejercicios;

import java.util.Scanner;

public class E24 {
    public static void e24(){
        System.out.println("Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String oracion = scan.nextLine();
        System.out.println("Ingresa la letra que quieres reemplazar: ");
        String letraReemplazar = scan.next();
        System.out.println("Ingresa la letra que vas a usar para reemplazar: ");
        String letraUsada = scan.next();
        scan.close();
        oracion=oracion.toLowerCase();
        letraReemplazar=letraReemplazar.toLowerCase();
        letraUsada=letraUsada.toLowerCase();
        String palabra= oracion.replaceAll(letraReemplazar,letraUsada);
        System.out.println("La oracion con las letras reemplazadas queda asi: \n"+ palabra);
    }
}
