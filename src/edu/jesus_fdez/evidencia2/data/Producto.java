package edu.jesus_fdez.evidencia2.data;

public class Producto {
    // Atributos de la clase
    private String nombre;
    private String tipo;
    protected double precioBase;
    protected String genero;
    protected boolean estreno;
    double precioTotal = precioBase;

    // Constructor de la clase Producto
    public Producto(String nombre, String tipo, double precioBase, String genero, boolean estreno) {
        // Inicializa los atributos con los valores proporcionados
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipo = tipo;
        this.genero = genero;
        this.estreno = estreno;
    }

    // Metodo para visualizar el producto
    @Override
    public String toString() {
        return nombre + "(" + tipo + ")";
    }

    public double calcularPrecio() {
        return precioBase; // Devuelve el precio base del producto
    }
}

