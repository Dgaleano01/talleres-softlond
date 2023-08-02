package org.example.ejercicios;

import java.util.Scanner;

public class E2 {
    public static void e2(){
        System.out.println("Escribe un programa que pida al usuario un número entero y determine si es par o impar.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = scan.nextInt();
        scan.close();
        String parOImpar = (n%2==0?"par":"impar");
        System.out.println("El numero "+ n + " es "+parOImpar);
    }
}
