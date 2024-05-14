package edu.jesus_fdez.evidencia3_sergio.data;

import java.util.HashMap;
import java.util.Map;

/**Esta clase nos permite crear una lista de los mejores puntajes*/
public class SalondeLaFama {
    private static final int MAX_JUGADORES = 5;
    private Map<String, Integer> jugadores;

    /**Definimos el constructor del salon de la fama*/
    public SalondeLaFama(){
        this.jugadores = new HashMap<>();
    }

    /**Este metodo nos permite actualizar el salon de la fama.*/
    public void actualizar(String nombreGanador){
        if (!jugadores.containsKey(nombreGanador)) {
            if (jugadores.size() < MAX_JUGADORES) {
                jugadores.put(nombreGanador, 1);
            } else {
                String ultimoJugador = jugadores.entrySet().stream()
                        .min(Map.Entry.comparingByValue())
                        .orElseThrow()
                        .getKey();
                jugadores.remove(ultimoJugador);
                jugadores.put(nombreGanador, 1);
            }
        } else {
            jugadores.put(nombreGanador, jugadores.get(nombreGanador) + 1);
        }
    }

    /**Este metodo sirve para imprimir el salon de la fama.*/
    public void mostrar() {
        System.out.println("Salón de la Fama:");
        jugadores.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " victorias"));
    }
}