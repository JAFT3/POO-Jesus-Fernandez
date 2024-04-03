package edu.jesus_fdez.evidencia2.data;

public class Producto {
    private String nombre;
    private String tipo;
    protected double precioBase;
    private String genero;
    protected boolean estreno;
    double precioTotal = precioBase;

    public Producto(String nombre, String tipo, double precioBase String genero, boolean estreno) {
        this.nombre = nombre;

        this.precioBase = precioBase;
        this.genero = genero;
        this.estreno = estreno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstreno(boolean estreno) {
        this.estreno = estreno;
    }
    public double calcularPrecio(){
        return precioBase;
    }
}
