package edu.jesus_fdez.evidencia3.data;

import edu.jesus_fdez.evidencia3.process.Tablero;
import edu.jesus_fdez.evidencia3.ui.Idiomas;

import java.util.Scanner;

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

}
