package edu.jesus_fdez.reto6.data;

public class Categoria {
    private String nombre;
    private String clave;
    private double sueldoBase;
    private double horaExtra;

    /**
     * Constructor de la categoria
     * @param nombre de la categoría
     * @param clave unica
     * @param sueldoBase de cada categoria
     * @param horaExtra de cada categoría
     */

    public Categoria(String nombre, String clave, double sueldoBase, double horaExtra) {
        this.nombre = nombre;
        this.clave = clave;
        this.sueldoBase = sueldoBase;
        this.horaExtra = horaExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }
}
