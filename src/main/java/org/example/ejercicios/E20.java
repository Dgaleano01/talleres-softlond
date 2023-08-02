package org.example.ejercicios;

import java.util.Scanner;

public class E20 {
    public static void e20(){
        System.out.println("Realiza un programa que solicite al usuario una cadena y luego invierta su orden ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String palabra = scan.nextLine();
        scan.close();
        StringBuilder stringBuilder = new StringBuilder(palabra);
        stringBuilder.reverse();
        String palabraInvertida = stringBuilder.toString();
        System.out.println("Su cadena invertida es: "+ palabraInvertida);
    }
}
