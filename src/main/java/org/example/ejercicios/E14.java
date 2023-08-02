
package org.example.ejercicios;

import java.util.Scanner;

public class E14 {
    public static void e14(){
        System.out.println("Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo: ");
        int n = scan.nextInt();
        scan.close();
        if (n<0) {
            System.out.println("El numero debe ser positivo");
            return;
        }
        int acum=0;
        for(int i =0; i<(n-1);i++){
            if(n%(i+1)==0){
                acum+=(i+1);
            }
        }
        if(acum==n){
            System.out.println("El numero " + n + " es perfecto");
        }else {
            System.out.println("El numero " + n + " no es perfecto");
        }

    }
}
