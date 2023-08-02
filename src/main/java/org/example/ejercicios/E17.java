package org.example.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E17 {
    public static void e17() {
        List<Integer> primos = new ArrayList<>();
        System.out.println("Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa el numero 1: ");
        int n1 = scan.nextInt();

        System.out.println("Ingresa el numero 2: ");
        int n2 = scan.nextInt();
        scan.close();
        exteriorLoop:
        for (int i= n1;i<n2;i++){
            if (i<=1) {
                continue exteriorLoop;
            }
            for (int k=2;k<=Math.sqrt(i);k++){
                if (i%k==0){
                    continue exteriorLoop;
                }
            }
            primos.add(i);
        }


        System.out.println("Los numeros primos entre "+ n1 + " y "+ n2 + " son: ");
        for(int i =0; i<primos.size();i++){
            System.out.print(primos.get(i));
            if (i < primos.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
