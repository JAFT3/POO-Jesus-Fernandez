package edu.jesus_fdez.evidencia3.data;

public class PuntosJugador {
    private String nombre;
    private char simbolo;
    private int puntos;

    public PuntosJugador(String nombre, char simbolo, int puntos) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Puntos del Jugador" +
                "nombre:'" + nombre + '\'' +
                ",simbolo:'" + simbolo + '\'' +
                ",puntuacion:" + puntos ;
    }
}