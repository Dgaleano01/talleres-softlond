package org.example.ejercicios;

import java.util.Scanner;

public class E26 {
    public static void e26(){
        System.out.println("Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco");
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa la cadena: ");
        String oracion = scan.nextLine();
        scan.close();
        String palabra2=oracion.replaceAll("\\s+", "");
        System.out.println("La cadena tiene "+palabra2.length()+" caracteres");
    }
}
