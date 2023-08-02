package org.example.ejercicios;

import java.util.Arrays;

public class E28 {
    public static void e28(){
        System.out.println("Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros.");
        int[] enteros={1,2,3,4,5,6,7,8,9,10};
        int cont=0;
        for(int numero:enteros){
            cont+=numero;
        }
        System.out.println("La suma del array "+ Arrays.toString(enteros)+ " es: "+ cont);
    }
}
