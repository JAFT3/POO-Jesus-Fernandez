package edu.jesus_fdez.evidencia3.process;

import edu.jesus_fdez.evidencia3.ui.Idiomas;

import java.util.Map;
import java.util.Scanner;

import static edu.jesus_fdez.evidencia3.data.Simbolos.simbolosConValor;

public class VerificadorDeDatos {
    public static String imprimirSimbolos() {
        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<String, Integer> entry : simbolosConValor.entrySet()) {
            resultado.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return resultado.toString();
    }


    public static String obtenerSimbolo(int numero) {
        for (Map.Entry<String, Integer> entry : simbolosConValor.entrySet()) {
            if (entry.getValue() == numero) {
                return entry.getKey();
            }
        }
        return null; // Devuelve null si no se encuentra el símbolo correspondiente al número
    }
    public static boolean validarNombres(String nombre1, String nombre2) {
        return !nombre1.equals(nombre2);
    }
    public static boolean validarSimbolos(int simbolo1, int simbolo2) {
        return simbolo1 != simbolo2;
    }
    public static boolean seleccionarSimbolo(Scanner sc, int simbolo1) {
        boolean simboloValido = false;
        System.out.print(Idiomas.ELEGIR_SIMBOLO);
        int simbolo2 = sc.nextInt();
        String simboloSeleccionado = VerificadorDeDatos.obtenerSimbolo(simbolo2);
        if (simboloSeleccionado != null && VerificadorDeDatos.validarSimbolos(simbolo1, simbolo2)) {
            System.out.println(Idiomas.SIMBOLO_FAV + simboloSeleccionado);
            simboloValido = true;
        } else if (simbolo2 == simbolo1) {
            System.out.println(Idiomas.ERROR_SIMBOLO);
        } else {
            System.out.println(Idiomas.ERROR_SIMBOLO);
        }
        return simboloValido;
    }
}
