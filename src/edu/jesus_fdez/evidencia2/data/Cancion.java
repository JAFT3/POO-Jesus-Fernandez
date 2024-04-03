package edu.jesus_fdez.evidencia2.data;

public class Cancion extends Producto {
    // Constructor de la clase Cancion
    public Cancion(String nombre, String tipo, double precioBase, boolean estreno) {
        super(nombre, tipo, precioBase, "", estreno); // Llama al constructor de la clase base Producto
    }

    // Método para calcular el precio de la canción
    @Override
    public double calcularPrecio() {
        // Calcula el precio total de la canción
        if (estreno) {
            precioTotal = precioBase + 1.5; // Suma 1.5 al precio base si es un estreno
        } else {
            precioTotal = precioBase + 0.5; // Suma 0.5 al precio base si no es un estreno
        }
        return precioTotal; // Devuelve el precio total calculado
    }
}
