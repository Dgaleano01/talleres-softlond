package org.example.ejercicios;

import java.util.Scanner;

public class E5 {
    public static void e5(){
        System.out.println("Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int n1 = scan.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int n2 = scan.nextInt();
        scan.close();
        if(n1>n2){
            System.out.println(n1 + " es mayor a "+ n2);
        }else {
            System.out.println(n2 + " es mayor a "+ n1);
        }
    }
}
