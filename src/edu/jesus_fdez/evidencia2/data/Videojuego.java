package edu.jesus_fdez.evidencia2.data;

public class Videojuego extends Producto {
    public Videojuego(String nombre, String tipo, double precioBase, boolean estreno) {
        super(nombre, "Videojuego", 5, estreno);
    }

    @Override
    public double calcularPrecio() {
        if(estreno){
            return precioBase + 10;
        }else {
            return precioBase;
        }
    }
}
