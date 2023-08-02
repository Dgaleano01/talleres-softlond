package org.example.ejercicios;

import java.util.Scanner;

public class E1 {
    public static void e1(){
        System.out.println("Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int n1 = scan.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int n2 = scan.nextInt();
        scan.close();
        System.out.println("Su suma es: "+(n1+n2)+
                "\nSu resta es: "+ (n1-n2)+
                "\nSu multiplicación es: "+(n1*n2)+
                "\nSu división es: "+ (((float)n1/n2)));
    }
}
