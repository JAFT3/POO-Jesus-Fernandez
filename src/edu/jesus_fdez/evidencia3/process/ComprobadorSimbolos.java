package edu.jesus_fdez.evidencia3.process;

import edu.jesus_fdez.evidencia3.data.Simbolos;

import java.util.Map;

import static edu.jesus_fdez.evidencia3.data.Simbolos.listaSimbolos;
import static edu.jesus_fdez.evidencia3.data.Simbolos.simbolosConValor;

public class ComprobadorSimbolos {
    public static String imprimirSimbolos() {
        //StringBuilder resultado = new StringBuilder();
        //for (String simbolo : listaSimbolos) {
          //  resultado.append(simbolo).append(": ").append(simbolosConValor.get(simbolo)).append("\n");
        //}
        //return resultado.toString();
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Integer> entry : simbolosConValor.entrySet()) {
            resultado.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return resultado.toString();
    }
    /**public static boolean esSimboloDisponible(String simbolo1) {
        return simbolosConValor.containsKey(simbolo1);
    }**/

    public static String obtenerSimbolo(int numero) {
        for (Map.Entry<String, Integer> entry : simbolosConValor.entrySet()) {
            if (entry.getValue() == numero) {
                return entry.getKey();
            }
        }
        return null; // Devuelve null si no se encuentra el símbolo correspondiente al número
    }
}
