package org.example.ejercicios;

import java.util.Scanner;

public class E22 {
    public static void e22(){
        System.out.println("Escribe un programa que solicite al usuario una frase y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String palabra = scan.nextLine();
        scan.close();
        String palabra2=palabra.toLowerCase().replaceAll("\\s+", "");
        StringBuilder stringBuilder = new StringBuilder(palabra2);
        stringBuilder.reverse();
        String palabraInvertida = stringBuilder.toString();
        if(palabraInvertida.equals(palabra2)){
            System.out.println("La frase es un palindromo");
        }else {
            System.out.println("La frase no es un palindromo");
        }
    }
}
