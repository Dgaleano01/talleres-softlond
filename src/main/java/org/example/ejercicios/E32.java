package org.example.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class E32 {
    public static void e32(){
        System.out.println("Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra).");
        Integer[] elementos = {56, 3, 4, 89, 2, 1, 6, 9};
        System.out.println("El arreglo es: " + Arrays.toString(elementos));
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero que quieres buscar: ");
        int numeroBuscado = scan.nextInt();
        scan.close();
        for(int i=0;i<elementos.length;i++){
            if(elementos[i]==numeroBuscado){
                System.out.println("El numero buscado se encuentra en la posición "+ i + " del arreglo");
                return;
            }
        }
        System.out.println("El numero buscado no se encuentra en el arreglo");
    }
}
