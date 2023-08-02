package org.example.ejercicios;

import java.util.Scanner;

public class E12 {
    public static void e12() {
        System.out.println("Realiza un programa que pida al usuario un número entero y determine si es un número primo o no");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        int n = scan.nextInt();
        scan.close();
        if (n<=1) {
            System.out.println("El numero " + n + " no es primo");
            return;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                System.out.println("El numero " + n + " no es primo");
                return;
            }
        }
        System.out.println("El numero "+ n +" es primo");
    }

}
