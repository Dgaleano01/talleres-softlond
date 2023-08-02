
package org.example.ejercicios;

import java.util.Scanner;

public class E9 {
    public static void e9(){
        System.out.println("Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo: ");
        int n = scan.nextInt();
        scan.close();
        if (n<0) {
            System.out.println("El numero debe ser positivo");
            return;
        }
        int fact=1;
        for(int i=0;i<n;i++){
            fact*=(i+1);
        }
        System.out.println("El factorial de " + n + " es: "+ fact);
    }
}
