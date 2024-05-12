package edu.jesus_fdez.evidencia3.process;

import java.util.Objects;

public class Tablero {
    private char[][] tablero;

    public Tablero() {
        inicializarTablero();
        reiniciarTablero();
    }

    private void inicializarTablero() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void reiniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void mostrarTablero() {
        if (tablero == null) {
            System.out.println("El tablero no ha sido inicializado correctamente.");
            return;
        }

        System.out.println("Tablero:");
        System.out.println("   A   B   C");
        System.out.println(" ╔═══╦═══╦═══╗");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "║");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tablero[i][j] + " ║");
            }
            System.out.println();
            if (i < 2) {
                System.out.println(" ╠═══╬═══╬═══╣");
            }
        }
        System.out.println(" ╚═══╩═══╩═══╝");
    }
    public int convertirColumna(char columna) {
        switch (columna) {
            case 'A':
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            default:
                return -1; // Devolver -1 si la columna no es válida
        }
    }
    public boolean colocarSimbolo(int fila, char columna, char simbolo) {
        if (tablero == null) {
            System.out.println("El tablero no ha sido inicializado correctamente.");
            return false;
        }

        int columnaIndex = convertirColumna(columna);
        if (fila < 0 || fila >= 3 || columnaIndex < 0 || columnaIndex >= 3) {
            throw new IllegalArgumentException("Los índices de fila y columna están fuera de los límites del tablero.");
        }

        if (tablero[fila][columnaIndex] == ' ') {
            tablero[fila][columnaIndex] = simbolo;
            return true;
        } else {
            return false;
        }
    }
    public boolean comprobarGanador(char simbolo) {
        if (tablero == null) {
            System.out.println("El tablero no ha sido inicializado correctamente.");
            return false;
        }

        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] == simbolo && tablero[1][j] == simbolo && tablero[2][j] == simbolo) {
                return true;
            }
        }

        // Comprobar diagonales
        if ((tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) ||
                (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo)) {
            return true;
        }

        return false;
    }

    public boolean tableroLLeno() {
        if (tablero == null) {
            System.out.println("El tablero no ha sido inicializado correctamente.");
            return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Todavía hay celdas vacías, el tablero no está lleno
                }
            }
        }
        return true;
    }

    private boolean tableroLLeno(char simbolo) {
        return comprobarGanador(simbolo);
    }
    public boolean casillaVacia(int fila, int columna) {
        return tablero[fila][columna] == ' ';
    }
}