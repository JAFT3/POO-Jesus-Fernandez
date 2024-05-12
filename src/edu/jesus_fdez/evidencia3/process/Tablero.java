package edu.jesus_fdez.evidencia3.process;

public class Tablero {
    private char[][] tablero;

    public Tablero() {
        inicializarTablero();
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

    public boolean colocarSimbolo(int fila, int columna, char simbolo){
        if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3) {
            throw new IllegalArgumentException("Los índices de fila y columna están fuera de los límites del tablero.");
        }

        if (tablero[fila][columna] == ' ') {
            tablero[fila][columna] = simbolo;
            return true;
        } else {
            return false;
        }
    }

}