package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombreHotel;
    private List<Habitacion> habitaciones;

    public Hotel(String nombreHotel, int cantidadHabitaciones) {
        habitaciones= new ArrayList<>();
        this.nombreHotel = nombreHotel;
        for(int i=0;i<cantidadHabitaciones;i++){//generamos habitaciones a cada hotel con base a la cantidad de habitaciones
            habitaciones.add(new Habitacion(i+1));
        }
    }

    public List<Integer> retornarHabitacionesDisponibles(){
        List<Integer> habitacionesDisponibles = new ArrayList<>();
        for(Habitacion habitacion:habitaciones){
            if(habitacion.isDisponible()){
                habitacionesDisponibles.add(habitacion.getNumeroHabitacion());
            }
        }
        return habitacionesDisponibles;
    }

    public void asignarHabitacionDisponible(Cliente cliente){
        List<Integer> habitacionesDisponibles= retornarHabitacionesDisponibles();
        for (Habitacion habitacion:habitaciones){
            if(habitacionesDisponibles.get(0).equals(habitacion.getNumeroHabitacion())) {
                habitacion.reservarHabitacion(cliente);
                return;
            }
        }
    }

    public void cancelarHabitacion(Cliente cliente){
        for(Habitacion habitacion:habitaciones){
            if (habitacion.getCliente().equals(cliente)){
                habitacion.desocuparHabitacion();
                return;
            }
        }

    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }
}
