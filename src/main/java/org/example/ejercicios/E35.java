package org.example.ejercicios;
public class E35 {
    public static void e35(){
        System.out.println("Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al  10. Usa para esto una matriz");
        int [] [] tablas=new int[10][10];
        for(int i = 0; i< tablas.length;i++){
            for(int k=0;k<tablas[i].length;k++){
                tablas[i][k]=(i+1)*(k+1);
            }
        }
        for(int i = 0; i< tablas.length;i++){
            System.out.println("Tabla del "+ (i+1));
            for(int k=0;k<tablas[i].length;k++){
                System.out.println((i+1) + " * " + (k+1) + " = " + tablas[i][k]);
            }
            System.out.println("");
        }
    }
}
