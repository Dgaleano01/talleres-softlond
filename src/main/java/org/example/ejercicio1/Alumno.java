package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;
    private int edad;
    private List<Double> calificaciones = new ArrayList<>();


    public Alumno(String nombre, int edad, List<Double> calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(List<Double> calificaciones) {
        this.calificaciones = calificaciones;
    }
}
