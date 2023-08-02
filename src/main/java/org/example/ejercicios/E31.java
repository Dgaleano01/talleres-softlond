package org.example.ejercicios;

import java.util.Arrays;

public class E31 {
    public static void e31(){
        System.out.println("Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros de manera ascendente.");
        Integer[] elementos = {56, 3, 4, 89, 2, 1, 6, 9};
        System.out.println("El arreglo " + Arrays.toString(elementos));

        for(int i=0; i<elementos.length;i++){
            for(int k=0; k<elementos.length-1;k++){
                int posicion1=elementos[k];
                int pocision2=elementos[k+1];
                if (posicion1 > pocision2){
                    elementos[k]=pocision2;
                    elementos[k+1]=posicion1;
                }
            }
        }
        System.out.println("ordenado: " + Arrays.toString(elementos));
    }
}
