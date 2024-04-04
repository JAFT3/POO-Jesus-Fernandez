package edu.jesus_fdez.evidencia2.data;

public class Pelicula extends Producto {
    // Constructor de la clase Pelicula
    public Pelicula(String nombre, String tipo, double precioBase, boolean estreno) {
        super(nombre, tipo, precioBase, "", estreno); // Llama al constructor de la clase base Producto
    }

    // Método para calcular el precio de la película
    @Override
    public double calcularPrecio() {
        // Calcula el precio de la película
        if (estreno) {
            return 15; // Devuelve 15 si es un estreno
        } else {
            return 7; // Devuelve 7 si no es un estreno
        }
    }
}
