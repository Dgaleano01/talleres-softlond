package org.example.ejercicios;

import java.util.Arrays;
import java.util.HashSet;

public class E33 {
    public static void e33(){
        System.out.println("Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo.");
        Integer[] numeros = {56, 56, 3, 4, 56, 2, 4, 6, 3};
        System.out.println("El arreglo es: " + Arrays.toString(numeros));
        HashSet<Integer> elementosSinDuplicados = new HashSet<>(Arrays.asList(numeros));
        Integer[] numerosSinRepetir=elementosSinDuplicados.toArray(new Integer[0]);
        for (int i=0;i<numerosSinRepetir.length;i++){
            int cont=0;
            for(int k=0;k<numeros.length;k++){
                if (numerosSinRepetir[i]==numeros[k]){
                    cont++;
                }
            }
            System.out.println("El numero " + numerosSinRepetir[i] + " tiene una frecuencia de: " + cont);
        }
    }
}
