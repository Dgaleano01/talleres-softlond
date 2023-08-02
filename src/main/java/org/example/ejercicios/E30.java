package org.example.ejercicios;

import java.util.Arrays;
import java.util.HashSet;

public class E30 {
    public static void e30(){
        System.out.println("Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.");
        Integer[] elementos = {56, 56, 3, 4, 56, 2, 4, 6, 3};
        HashSet<Integer> elementosSinDuplicados = new HashSet<>(Arrays.asList(elementos));
        System.out.println("El arreglo "+ Arrays.toString(elementos) +"\nsin repetidos: " + Arrays.toString(elementosSinDuplicados.toArray()));
    }
}
