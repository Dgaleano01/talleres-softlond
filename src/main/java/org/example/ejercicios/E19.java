package org.example.ejercicios;

import java.util.Scanner;

public class E19 {
    public static void e19(){
        System.out.println("Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa su nombre: ");
        String nombre = scan.nextLine();
        scan.close();
        System.out.println("Su nombre en mayusculas es: "+ nombre.toUpperCase()+
                "\n Su nombre en minusculas es: "+ nombre.toLowerCase());

    }

}
