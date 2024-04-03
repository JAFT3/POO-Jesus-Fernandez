package edu.jesus_fdez.evidencia2.data;

public class Libro extends Producto{
    public Libro(String nombre, String tipo, double precioBase, boolean estreno) {
        super(nombre, "Libro", 5, estreno);
    }

    @Override
    public double calcularPrecio() {
        if(estreno){
            precioTotal +=0.5;
        }
        switch (genero){
            case "Novela":
                precioTotal +=2;
                break;
            case "Tecnologia":
                precioTotal +=3;
                break;
            default:
                precioTotal +=1;
                break;
        }
        return precioTotal;
    }
}
