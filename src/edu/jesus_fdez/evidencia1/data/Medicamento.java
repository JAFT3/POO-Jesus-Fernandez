package edu.jesus_fdez.evidencia1.data;

import edu.jesus_fdez.evidencia1.process.CalculadorMedicamento;

public class Medicamento {
    String nombreQuimico;
    String nombreGenerico;
    String nombreRegistrado;
    double precioVenta;
    double precioPublico;
    String tipoPresentacion;

    public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, String tipoPresentacion,
                       double precioPublico, double precioVenta){
        this.nombreGenerico;
        this.nombreQuimico;
        this.nombreRegistrado;
        this.precioPublico;
        this.tipoPresentacion;
        this.precioVenta = CalculadorMedicamento.calcularPrecio(precioPublico, tipoPresentacion);
    }
}
