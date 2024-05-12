package edu.jesus_fdez.evidencia3.process;

import edu.jesus_fdez.evidencia3.data.Humano;

import edu.jesus_fdez.evidencia3.ui.Idiomas;

import java.util.Random;

public class TicTacToe {
    private static Tablero tablero;
    private Humano jugador1;
    private Humano jugador2;

    public TicTacToe(Tablero tablero, Humano jugador1, Humano jugador2) {
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }


    public static void generarTurnoPersona(Humano jugador1, Humano jugador2) {
        Random random = new Random();
        boolean turnoJugador = random.nextBoolean();
        boolean juegoActivo = true;
        while (juegoActivo) {
            if (turnoJugador) {
                System.out.println(Idiomas.COMIENZA + " " + jugador1.getNombre() + " (" + jugador1.getSimbolo() + ").");
                if (jugador1.realizarMovimiento(tablero)) juegoActivo = true;
                else juegoActivo = false;
                System.out.println(Idiomas.TERMINA_TURNO);
                turnoJugador = false;
            } else {
                System.out.println(Idiomas.COMIENZA + " " + jugador2.getNombre() + " (" + jugador2.getSimbolo() + ").");
                juegoActivo = jugador2.realizarMovimiento(tablero);
                System.out.println(Idiomas.TERMINA_TURNO);
                turnoJugador = true;
            }
        }
        // Mostrar el tablero final
        tablero.mostrarTablero();
    }
}

