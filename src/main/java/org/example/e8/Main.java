package org.example.e8;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados= List.of(
                new EmpleadoAsalariado("Santiago","administrador",1160000d,4d,4d),
                new EmpleadoPorHoras("Francisco","vigilante",5,20000)
        );


        for (Empleado empleado:empleados){
            empleado.calcularSalario();
        }
    }
}
