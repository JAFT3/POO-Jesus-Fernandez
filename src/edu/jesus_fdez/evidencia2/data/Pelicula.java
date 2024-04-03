package edu.jesus_fdez.evidencia2.data;

public class Pelicula extends Producto{
    public Pelicula(String nombre, String tipo, double precioBase, boolean estreno) {
        super(nombre, "Pelicula", 5, estreno);
    }

    @Override
    public double calcularPrecio() {
        if(estreno){
            return 15;
        }else {
            return 7;
        }
    }
}
