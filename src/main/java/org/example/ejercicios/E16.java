package org.example.ejercicios;

import java.util.Scanner;

public class E16 {
    public static void e16(){
        System.out.println("Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = scan.nextInt();
        scan.close();
        int n1=0;
        System.out.println(n1);
        int n2=1;
        int temp=1;//almacenara temporalmente el numero 1
        System.out.println(n2);
        for(int i=2;i<n;i++){
            n1=n1+n2;
            n2=temp;
            temp=n1;
            System.out.println(n1);
        }
    }
}
