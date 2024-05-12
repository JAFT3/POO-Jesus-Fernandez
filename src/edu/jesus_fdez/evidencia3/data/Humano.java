package edu.jesus_fdez.evidencia3.data;

import edu.jesus_fdez.evidencia3.process.Tablero;
import edu.jesus_fdez.evidencia3.ui.Idiomas;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Humano extends Jugador {
    private int victorias; // Ahora es una variable de instancia en lugar de estática

    public Humano(String nombre, char simbolo) {
        super(nombre, simbolo);
        this.victorias = 0; // Inicializa la variable de instancia
    }

    public void sumarVictoria() {
        this.victorias++; // Incrementa las victorias de esta instancia
    }

    // Método para que un jugador realice un movimiento
    public boolean realizarMovimiento(@NotNull Tablero tablero) {
        // Lógica para que el jugador realice un movimiento
        Scanner sc = new Scanner(System.in);
        tablero.mostrarTablero();
        System.out.println(Idiomas.SIGUIENTE_TURNO + this.getNombre());
        System.out.println(Idiomas.FILA);
        int fila = sc.nextInt();
        System.out.println(Idiomas.COLUMNA);
        char columnaChar = sc.next().toUpperCase().charAt(0); // Convertir a mayúsculas para manejar minúsculas
        int columna = tablero.convertirColumna(columnaChar);

        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            if (tablero.colocarSimbolo(fila, (char) columna, this.getSimbolo())) {
                if (tablero.comprobarGanador(this.getSimbolo())) {
                    tablero.mostrarTablero();
                    this.sumarVictoria(); // Incrementa las victorias de esta instancia
                    System.out.println(Idiomas.FELICITACION + this.getNombre());
                    return false;
                } else if (tablero.tableroLLeno()) {
                    tablero.mostrarTablero();
                    System.out.println(Idiomas.EMPATE);
                    return false;
                }
            } else {
                System.out.println(Idiomas.ERROR_POSICION);
            }
        } else {
            System.out.println(Idiomas.ERROR_MOVIMIENTO);
        }
        return true;
    }
}
