package org.example.e5;

import org.example.e5.electronica.Celular;
import org.example.e5.libro.Diccionario;
import org.example.e5.ropa.Zapatos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos=List.of(
                new Zapatos(12000d,"XL","alemana"),
                new Diccionario(10000d,1000,3),
                new Celular(100000d,5,"Samsung xs"));

        for (Producto producto: productos){
            System.out.println(producto.getClass().getSimpleName());
            producto.mostrarDetalles();
            System.out.println("El valor real del producto es: "+ producto.calcularPrecio());
            System.out.println("");
        }

    }
}
