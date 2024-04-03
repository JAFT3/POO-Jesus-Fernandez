package edu.jesus_fdez.reto6.data;

public class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double horasExtra;
    private Categoria categoria;

    private int numeroTelefonico;
    /**
     * Constructor del empleado
     * @param nombre del empleado
     * @param horasTrabajadas
     * @param horasExtra
     * @param numeroTelefonico del empleado
     * @param categoria
     */
    public Empleado(String nombre, int horasTrabajadas, double horasExtra, Categoria categoria, int numeroTelefonico){
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtra = horasExtra;
        this.categoria = categoria;
        this.numeroTelefonico = numeroTelefonico;
    }

    public Empleado(String nombre, int horasTrabajadas, int horasExtras, Categoria categoria) {
    }

    /*Metodo para mostrar los datos del usuario*/
    @Override
    public String toString() {
        return "-----Datos Empleado-----" +
                "\nNombre: " + this.nombre +
                "\nNumero telefonico: " + this.numeroTelefonico +
                "\nHoras Trabajadas: " + this.horasTrabajadas +
                "\nHoras Extra: " + this.horasExtra +
                "\nCategoria: " + this.categoria.getNombre();
    }

    public int getNumeroTelefonico(){
        return numeroTelefonico;
    }
    public void setNumeroTelefonico(int numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(double horasExtra) {
        this.horasExtra = horasExtra;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
