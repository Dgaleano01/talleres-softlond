package org.example.ejercicios;

import java.util.Scanner;

public class E6 {
    public static void e6(){
        System.out.println("Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero: ");
        int n = scan.nextInt();
        scan.close();
        if(n>0){
            System.out.println("El numero " + n + " es positivo");
        }else if(n<0){
            System.out.println("El numero " + n + " es negativo");
        }else {
            System.out.println("El numero " + n + " es cero");
        }
    }
}
