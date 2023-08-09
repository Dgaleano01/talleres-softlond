package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Reserva {

    public static void realizarReserva(Cliente cliente, Hotel hotel){
        hotel.asignarHabitacionDisponible(cliente);
    }

    public static void cancelarReserva(Cliente cliente,Hotel hotel){
        hotel.cancelarHabitacion(cliente);
    }

    public static void mostrarReservasPorEmpresa(List<Hotel> hoteles){
        Map<String, List<Habitacion>> reservasPorEmpresa = new HashMap<>();
        for (Hotel hotel : hoteles) {
            for (Habitacion habitacion : hotel.getHabitaciones()) {
                if (!habitacion.isDisponible()) {
                    String nombreEmpresa = habitacion.getCliente().getNombreEmpresa();
                    if (!reservasPorEmpresa.containsKey(nombreEmpresa)) {
                        reservasPorEmpresa.put(nombreEmpresa, new ArrayList<>());
                    }
                    reservasPorEmpresa.get(nombreEmpresa).add(habitacion);
                }
            }
        }

        for (String empresa : reservasPorEmpresa.keySet()) {
            System.out.println("Empresa: " + empresa);
            List<Habitacion> habitaciones = reservasPorEmpresa.get(empresa);
            for (Habitacion habitacion : habitaciones) {
                System.out.println("Habitación: " + habitacion.getNumeroHabitacion());
                System.out.println("Cliente: " + habitacion.getCliente().getNombreCliente());
                System.out.println("Cédula: " + habitacion.getCliente().getCedulaCliente());
                System.out.println();
            }
        }


    }

}
