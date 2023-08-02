package org.example.ejercicios;

import java.util.Arrays;

public class E29 {
    public static void e29(){
        System.out.println("Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros.");
        int[] numeros = {5,12,56,745,123,12,78,23};
        int numeroMayor=0;
        for(int numero:numeros){
            if(numero>numeroMayor){
                numeroMayor=numero;
            }
        }
        System.out.println("El numero mayor del arreglo "+ Arrays.toString(numeros)+ " es: "+ numeroMayor);
    }
}
