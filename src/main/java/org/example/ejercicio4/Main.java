package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creamos algunos hoteles nota:las habitaciones se crean automaticamente
        // con base a la cantidad de habitaciones del hotel
        List<Hotel> hoteles= List.of(
                new Hotel("Trivago",5),
                new Hotel("Luna",2),
                new Hotel("Delmar",6)
        );

        //Crearemos algunos clientes para asignar a los hoteles
        List <Cliente> clientes=List.of(
                new Cliente("Softlond","Diana Galeano","103597888"),
                new Cliente("Softlond","Eider","119203211"),
                new Cliente("Mercado Libre","Juan Jose","1023123123"),
                new Cliente("Mercado Libre","Karen Cortes","1020304783"),
                new Cliente ("Google","Juan Pablo Avedaño","91231230")
        );

        //Realizamos reservas a cada uno de los clientes en diferentes hoteles
        Reserva.realizarReserva(clientes.get(0),hoteles.get(0));
        Reserva.realizarReserva(clientes.get(1),hoteles.get(0));
        Reserva.realizarReserva(clientes.get(2),hoteles.get(1));
        Reserva.realizarReserva(clientes.get(3),hoteles.get(2));
        Reserva.realizarReserva(clientes.get(4),hoteles.get(1));

        //Cancelamos la reserva de algun cliente
        Reserva.cancelarReserva(clientes.get(2),hoteles.get(1));

        //Imprimimos en pantalla las habitaciones disponibles de cada hotel

        for(Hotel hotel:hoteles){
            System.out.println("El hotel"+hotel.getNombreHotel()+" Tiene disponibles las habitaciones: \n"
                    +hotel.retornarHabitacionesDisponibles()+"\n");
        }


        //Se imprime el detalle de todas las reservas categorizadas por empresa
        Reserva.mostrarReservasPorEmpresa(hoteles);



    }
}
