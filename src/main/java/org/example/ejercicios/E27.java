package org.example.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E27 {
    public static void e27(){
        System.out.println("Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String oracion = scan.nextLine();
        scan.close();
        String[] oracionOrdenada=oracion.toLowerCase().split(" ");
        Arrays.sort(oracionOrdenada);
        System.out.println("La oracion ordenada es: ");
        for (String palabra: oracionOrdenada){
            System.out.println(palabra);
        }
    }
}
