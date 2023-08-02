package org.example.ejercicios;
public class E10 {
    public static void e10(){
        System.out.println("Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …");

        int n1=0;
        System.out.println(n1);
        int n2=1;
        System.out.println(n2);
        for(int i=0;i<9;i++){
            n1=n1+n2;
            System.out.println(n1);
            n2=n1+n2;
            System.out.println(n2);
        }
    }
}
