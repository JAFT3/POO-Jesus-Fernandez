package edu.jesus_fdez.reto4.data;

import java.util.ArrayList;

public class Boleto {
    public String pasajero;
    public int boleto;

    public ArrayList<String> pasajeros;

    public Boleto(String pasajero, int boleto, ArrayList<String> pasajeros){
        this.pasajero = pasajero;
        this.boleto = boleto;
        this.pasajeros = pasajeros;
    }
    public double calcularTotal(){
        return 1205.5 + boleto * 1250.5;
    }
}
