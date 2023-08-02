package org.example.ejercicios;

import java.util.Scanner;

public class E21 {
    public static void e21(){
        System.out.println("Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String palabra = scan.nextLine();
        System.out.println("Ingresa la letra a buscar: ");
        String letraABuscar = scan.next();
        scan.close();
        palabra.toLowerCase();
        letraABuscar.toLowerCase();
        int cont=0;
        for (char letra: palabra.toCharArray()) {
            if (letraABuscar.equals(String.valueOf(letra))) cont ++;
        }
        System.out.println("En la cadena esta "+ cont +" veces " + " la letra: "+ letraABuscar);
    }
}
