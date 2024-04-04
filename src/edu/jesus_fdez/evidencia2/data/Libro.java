package edu.jesus_fdez.evidencia2.data;

public class Libro extends Producto {
    // Constructor de la clase Libro
    public Libro(String nombre, String tipo, double precioBase, boolean estreno, String genero) {
        super(nombre, tipo, precioBase, genero, estreno); // Llama al constructor de la clase base Producto
    }

    // Método para calcular el precio del libro
    @Override
    public double calcularPrecio() {
        // Calcula el precio total del libro
        if (estreno) {
            precioTotal += 0.5; // Suma 0.5 al precio total si es un estreno
        }
        switch (genero) {
            case "Novela":
                precioTotal += 2; // Suma 2 al precio total si el género es "Novela"
                break;
            case "Tecnologia":
                precioTotal += 3; // Suma 3 al precio total si el género es "Tecnologia"
                break;
            default:
                precioTotal += 1; // Suma 1 al precio total por defecto
                break;
        }
        return precioTotal; // Devuelve el precio total calculado
    }
}
