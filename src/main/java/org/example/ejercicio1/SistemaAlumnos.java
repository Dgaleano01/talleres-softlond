package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class SistemaAlumnos {

    List<Alumno> alumnos= new ArrayList<>();

    public void agregarAlumno(String nombre, Integer edad){
        List<Double> calificaciones= new ArrayList<>();
        Alumno alumno= new Alumno(nombre,edad,calificaciones);
        alumnos.add(alumno);
    }

    public void asignarCalificacion(String nombreAlumno, List<Double> calificaciones){
        for (Alumno alumno: alumnos){
            if (alumno.getNombre().equals(nombreAlumno)){
                alumno.setCalificaciones(calificaciones);
                break;
            }
        };
    }

    public void mostrarPromedio(String nombreAlumno){
        for (Alumno alumno: alumnos){
            if (alumno.getNombre().equals(nombreAlumno)){
                List<Double> notas= alumno.getCalificaciones();
                Double suma =0.0;
                for (Double nota: notas){
                    suma += nota;
                }
                Double promedio = suma/notas.size();
                System.out.println("El promedio de "+nombreAlumno + " es = " + promedio);
                System.out.println("");

                break;
            }
        };
    }

    public void mostrarAlumno(String nombreAlumno){
        for (Alumno alumno : alumnos){
            if (alumno.getNombre().equals(nombreAlumno)){
                System.out.println("Informacion del alumno: ");
                System.out.println("Alumno: "+alumno.getNombre());
                System.out.println("Edad: "+alumno.getEdad());
                System.out.println("Con las siguientes calificaciones: "+alumno.getCalificaciones());
                System.out.println();
            }
        }

    }




}
