package org.example.ejercicio1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SistemaAlumnos sistemaAlumnos= new SistemaAlumnos();

        //crear 3 alumnos
        sistemaAlumnos.agregarAlumno("jose",16);
        sistemaAlumnos.agregarAlumno("pablo",20);
        sistemaAlumnos.agregarAlumno("josefina",19);

        // se le asigna las calificacione a dos
        sistemaAlumnos.asignarCalificacion("pablo",List.of(5.0, 4.0, 3.5, 3.5, 2.0, 1.0, 2.0));
        sistemaAlumnos.asignarCalificacion("josefina",List.of(4.0,5.0));

        //se muestra el promedio de pablo
        sistemaAlumnos.mostrarPromedio("pablo");

        //mostrar la informacion de 2 alumnos
        sistemaAlumnos.mostrarAlumno("pablo");
        sistemaAlumnos.mostrarAlumno("josefina");

    }
}