package edu.jesus_fdez.evidencia3.ui;

import edu.jesus_fdez.evidencia3.data.Jugador;
import edu.jesus_fdez.evidencia3.data.Simbolos;
import edu.jesus_fdez.evidencia3.process.VerificadorDeDatos;
import edu.jesus_fdez.evidencia3.process.Tablero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {
    public static Idiomas idiomas = new ESP(); // Idioma por defecto

    public static void showMenuIdiomas() {
        System.out.println(idiomas.MENU_IDIOMA);

    }

    public static void launchApp() {
        Scanner sc = new Scanner(System.in);
        boolean idiomaValido = false;

        do {
            showMenuIdiomas();
            String idioma = sc.next();
            switch (idioma.toUpperCase()) {
                case "ESP":
                    idiomas = new ESP();
                    idiomaValido = true;
                    break;
                case "ENG":
                    idiomas = new ENG();
                    idiomaValido = true;
                    break;
                case "MAND":
                    idiomas = new MAND();
                    idiomaValido = true;
                    break;
                default:
                    System.out.println(idiomas.ERROR_IDIOMA);
                    break;
            }
        } while (!idiomaValido);

        boolean modoValido = false;
        do {
            System.out.println(Idiomas.MENU);
            String gamemode = sc.next();
            switch (gamemode) {
                case "1":
                    // Jugador vs Jugador
                    // Jugador 1
                    System.out.print(Idiomas.NOMBRE1);
                    String nombre1 = sc.next();
                    System.out.println(Idiomas.SIMBOLO);
                    System.out.println(VerificadorDeDatos.imprimirSimbolos());
                    char simbolo1 = 0;
                    boolean simboloValido = false;
                    do {
                        try {
                            System.out.print(Idiomas.ELEGIR_SIMBOLO);
                            simbolo1 = sc.next().charAt(0);
                            String simboloSeleccionado = VerificadorDeDatos.obtenerSimbolo(simbolo1);
                            if (simboloSeleccionado != null) {
                                System.out.println(Idiomas.SIMBOLO_FAV + simboloSeleccionado);
                                simboloValido = true;
                            } else {
                                System.out.println(Idiomas.ERROR_SIMBOLO);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(Idiomas.ERROR_GAMEMODE);
                            sc.next();
                        }
                    } while (!simboloValido);

                    // Crear instancia del Jugador 1 con el símbolo seleccionado
                    Jugador jugador1 = new Jugador(nombre1, VerificadorDeDatos.obtenerSimbolo(simbolo1).charAt(0));

                    // Jugador 2
                    System.out.print(Idiomas.NOMBRE2);
                    String nombre2;
                    boolean nombresIguales;
                    do {
                        nombre2 = sc.next();
                        nombresIguales = VerificadorDeDatos.validarNombres(nombre1, nombre2);
                        if (!nombresIguales) {
                            System.out.println(Idiomas.ERROR_NOMBRES_IGUALES); // Añadir un salto de línea después del mensaje
                        }
                    } while (!nombresIguales);

                    System.out.println(Idiomas.SIMBOLO);
                    System.out.println(VerificadorDeDatos.imprimirSimbolos());
                    char simbolo2 = 0; // Eliminar la inicialización
                    simboloValido = false; // Inicializar la bandera de símbolo válido
                    while (!simboloValido) {
                        try {
                            System.out.print(Idiomas.ELEGIR_SIMBOLO);
                            simbolo2 = sc.next().charAt(0);
                            String simboloSeleccionado = VerificadorDeDatos.obtenerSimbolo(simbolo2);
                            if (simboloSeleccionado != null && VerificadorDeDatos.validarSimbolos(simbolo1, simbolo2)) {
                                System.out.println(Idiomas.SIMBOLO_FAV + simboloSeleccionado);
                                simboloValido = true;
                            } else {
                                System.out.println(Idiomas.ERROR_SIMBOLO);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(Idiomas.ERROR_GAMEMODE);
                            sc.next();
                        }
                    }

                    Tablero tablero = new Tablero();
                    tablero.mostrarTablero();
                    modoValido = true;
                    char simboloJugador1 = jugador1.getSimbolo();
                    String simboloJugador2 = VerificadorDeDatos.obtenerSimbolo(simbolo2);// Obtener el símbolo del jugador 2


                    break;
                case "2":
                    // Jugador vs Maquina
                    System.out.print(Idiomas.NOMBRE1);
                    String nombre = sc.next();
                    System.out.print(Idiomas.SIMBOLO);
                    System.out.println(VerificadorDeDatos.imprimirSimbolos());
                    int simbolo = 0;
                    boolean simboloValido1 = false;
                    do {
                        try {
                            System.out.print(Idiomas.ELEGIR_SIMBOLO);
                            simbolo = sc.nextInt();
                            String simboloSeleccionado = VerificadorDeDatos.obtenerSimbolo(simbolo);
                            if (simboloSeleccionado != null) {
                                System.out.println(Idiomas.SIMBOLO_FAV + simboloSeleccionado);
                                simboloValido1 = true;
                            } else {
                                System.out.println(Idiomas.ERROR_SIMBOLO);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(Idiomas.ERROR_GAMEMODE);
                            sc.next();
                        }
                    } while (!simboloValido1);

                    System.out.println(Idiomas.SIMBOLO_FAV + simbolo);

                    tablero = new Tablero();
                    tablero.mostrarTablero();
                    modoValido = true;
                    break;

                case "3":
                    // Salir
                    modoValido = true;
                    break;

                default:
                    System.out.println(Idiomas.ERROR_GAMEMODE);
                    break;
            }

        } while (!modoValido);
    }
}