package edu.jesus_fdez.evidencia3.data;

import edu.jesus_fdez.evidencia3.process.Tablero;

public class Jugador {
    private String nombre;
    private char simbolo;

    public Jugador(String nombre, char simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSimbolo() {
        return simbolo;
    }

    // Método para que un jugador realice un movimiento
    public void realizarMovimiento(Tablero tablero, int fila, String columna) {
        // Lógica para que el jugador realice un movimiento
        tablero.colocarSimbolo(fila, Integer.parseInt(columna), simbolo);
    }
}