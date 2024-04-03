package edu.jesus_fdez.evidencia2.process;

import edu.jesus_fdez.evidencia2.data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculadoraCostos {
    public static List<Producto> generadorAleatorio(){
        List<Producto> productos = new ArrayList<>();
        Random random = new Random();

        String[] tipos = {"Cancion", "Videojuego", "Libro", "Pelicula"};
        String[] generos = {"Corrido", "Balada","Accion","Terror","Sci-fi", "Tecnologia", "Novela"};
        boolean[] estrenos = {true, false};

        for (int i = 0; i < 20; i++){
            String tipo = tipos[random.nextInt(tipos.length)];
            String genero = generos[random.nextInt(generos.length)];
            boolean estreno = estrenos[random.nextInt(estrenos.length)];

            Producto producto;

            switch (tipo){
                case "Cancion":
                    producto = new Cancion("Cancion" + i, genero, estreno);
                    break;
                case "Videojuego":
                    producto = new Videojuego("Videojuego" + i, genero, estreno);
                    break;
                case "Libro":
                    producto = new Libro("Libro" + i, genero, estreno);
                    break;
                case "Pelicula":
                    producto = new Pelicula("Pelicula" + i, genero, estreno);
                    break;
                default:
                    producto = new Producto("Producto" + i, genero, estreno);
            }
            productos.add(Producto);
        }
        return productos;
    }
    public static double calcuclarPrecioTotal(List<Producto> productos){
        double precioTotal = 0;
        for (Producto producto : productos){
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal;
    }
}
