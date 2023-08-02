package org.example.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class E8 {
    public static void e8(){
        System.out.println("Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.");

        Random random= new Random();
        int numeroSecreto= random.nextInt(100)+1;
        System.out.println(numeroSecreto);//se imprime el numero secreto para probar que funcione bien
        int n=0;
        while (numeroSecreto!=n){
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingresa un numero entero: ");
            n = scan.nextInt();
            if (n>numeroSecreto){
                System.out.println("El numero que digitaste es mayor al numero secreto");
            } else if (n<numeroSecreto) {
                System.out.println("El numero que digitaste es menor al numero secreto");
            }else {
                System.out.println("Haz adivinado el numero secreto!!!!!!");
            }
        };
    }
}
