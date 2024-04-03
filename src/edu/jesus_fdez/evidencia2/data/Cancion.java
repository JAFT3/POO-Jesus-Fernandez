package edu.jesus_fdez.evidencia2.data;

public class Cancion extends Producto{
    public Cancion(String nombre, String tipo, double precioBase, boolean estreno) {
        super(nombre, "Cancion", 5, estreno);
    }

    @Override
    public double calcularPrecio() {
        if(estreno){
            precioTotal += 1.5;
        }else {
            precioTotal += 0.5;
        }
        return precioTotal;
    }
}
