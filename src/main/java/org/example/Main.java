package org.example;
import org.example.ejercicios.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("------MENU------");
        System.out.println("Del 1 al 35, Ingresa el ejercicio que quieres ver: ");
        System.out.println("Presiona 0 para salir");
        int opcion = scanner.nextInt();
        ejecutarEjercicio(opcion);
    }






    public static void ejecutarEjercicio(int opcion) {
        switch (opcion) {
            case 1:
                E1.e1();
                break;
            case 2:
                E2.e2();
                break;
            case 3:
                E3.e3();
                break;
            case 4:
                E4.e4();
                break;
            case 5:
                E5.e5();
                break;
            case 6:
                E6.e6();
                break;
            case 7:
                E7.e7();
                break;
            case 8:
                E8.e8();
                break;
            case 9:
                E9.e9();
                break;
            case 10:
                E10.e10();
                break;
            case 11:
                E11.e11();
                break;
            case 12:
                E12.e12();
                break;
            case 13:
                E13.e13();
                break;
            case 14:
                E14.e14();
                break;
            case 15:
                E15.e15();
                break;
            case 16:
                E16.e16();
                break;
            case 17:
                E17.e17();
                break;
            case 18:
                E18.e18();
                break;
            case 19:
                E19.e19();
                break;
            case 20:
                E20.e20();
                break;
            case 21:
                E21.e21();
                break;
            case 22:
                E22.e22();
                break;
            case 23:
                E23.e23();
                break;
            case 24:
                E24.e24();
                break;
            case 25:
                E25.e25();
                break;
            case 26:
                E26.e26();
                break;
            case 27:
                E27.e27();
                break;
            case 28:
                E28.e28();
                break;
            case 29:
                E29.e29();
                break;
            case 30:
                E30.e30();
                break;
            case 31:
                E31.e31();
                break;
            case 32:
                E32.e32();
                break;
            case 33:
                E33.e33();
                break;
            case 34:
                E34.e34();
                break;
            case 35:
                E35.e35();
                break;
            case 0:
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida. Intente de nuevo.");
                break;
        }
    }
}