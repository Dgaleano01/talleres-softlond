package org.example.ejercicios;

import java.util.Scanner;

public class E25 {
    public static void e25(){
        System.out.println("Pide al usuario una frase y muestra cada palabra por separado");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String oracion = scan.nextLine();
        scan.close();
        String[] palabras=oracion.split(" ");
        for (String palabra: palabras){
            System.out.println(palabra);
        }
    }
}
