package edu.jesus_fdez.evidencia2.process;

import edu.jesus_fdez.evidencia2.data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculadoraCostos { // Define la clase CalculadoraCostos

    // Método para generar una lista de productos aleatorios
    public static List<Producto> generadorAleatorio() {
        List<Producto> productos = new ArrayList<>(); // Crea una nueva lista para almacenar productos
        Random random = new Random(); // Crea una instancia de la clase Random para generar números aleatorios

        // Definición de arrays con tipos, géneros y valores booleanos para los productos
        String[] tipos = {"Cancion", "Videojuego", "Libro", "Pelicula"};
        String[] generos = {"Corrido", "Balada","Accion","Terror","Sci-fi", "Tecnologia", "Novela"};
        boolean[] estrenos = {true, false};

        // Bucle para generar 20 productos aleatorios
        for (int i = 0; i < 20; i++) {
            String tipo = tipos[random.nextInt(tipos.length)];
            String genero = generos[random.nextInt(generos.length)];
            boolean estreno = estrenos[random.nextInt(estrenos.length)];

            Producto producto; // Declara una variable para almacenar el producto generado

            // Switch para crear un objeto de acuerdo al tipo de producto aleatorio
            switch (tipo) {
                case "Cancion":
                    producto = new Cancion("Cancion" + i, tipo, 5.0, estreno);
                    break;
                case "Videojuego":
                    producto = new Videojuego("Videojuego" + i, tipo, 5.0, estreno);
                    break;
                case "Libro":
                    producto = new Libro("Libro" + i, tipo, 5.0, estreno, genero); // Se agregó el parámetro genero
                    break;
                case "Pelicula":
                    producto = new Pelicula("Pelicula" + i, tipo, 5.0, estreno);
                    break;
                default:
                    producto = new Producto("Producto" + i, tipo, 5.0, genero, estreno);
            }
            productos.add(producto);
        }
        return productos;
    }

    // Método para calcular el precio total de una lista de productos
    public static double calcularPrecioTotal(List<Producto> productos) {
        double precioTotal = 0;
        for (Producto producto : productos) {
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal;
    }
}
