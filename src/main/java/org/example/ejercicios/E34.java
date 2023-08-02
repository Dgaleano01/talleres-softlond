package org.example.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E34 {
    public static void e34(){
        System.out.println("Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.");
        Integer[] elementos = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("El arreglo es: " + Arrays.toString(elementos));
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de movimientos que quieres (escribe el numero en positivo si quieres a la derecha o negativo si quieres a la izquierda): ");
        int cantMovida = scan.nextInt();
        scan.close();
        Integer[] elementosRotados = new Integer[elementos.length];

        for(int i =0;i<elementos.length;i++){
            if(i+cantMovida>=elementos.length){
                int cant=i+cantMovida-elementos.length;
                elementosRotados[cant]=elementos[i];
            }else if(i+cantMovida<0){
                System.out.println(i);
                int cant=(elementos.length+i)+cantMovida;
                System.out.println(cant);
                elementosRotados[cant]=elementos[i];
            }else {
                elementosRotados[i+cantMovida]=elementos[i];
            }
        }
        System.out.println("El arreglo con las posiciones movidas es: " + Arrays.toString(elementosRotados));
    }
}
