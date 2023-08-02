package org.example.ejercicios;

import java.util.Scanner;

public class E15 {
    public static void e15(){
        System.out.println("Crea un programa que pida al usuario un número entero y determine si es un número capicúa. Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = scan.nextInt();
        scan.close();
        String numero=String.valueOf(n);
        String numeroInvertido = "";
        for (int i = numero.length() - 1; i >= 0; i--) {
            numeroInvertido += numero.charAt(i);
        }
        if(numero.equals(numeroInvertido)){
            System.out.println("El numero "+ n + " es capicua");
        }else {
            System.out.println("El numero "+ n + " no es capicua");

        }

    }
}
