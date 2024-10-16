package edu.jesus_fdez.evidencia3_sergio.ui;

import edu.sergio_nolasco.evidencia3.data.Jugador;
import edu.sergio_nolasco.evidencia3.process.Tablero;
import static edu.sergio_nolasco.evidencia3.process.Tablero.*;

import java.util.Random;
import java.util.Scanner;



/**Esta clase es la clase de interfaz donde se imprimirán todas las variables y el usuario seleccionara
 * el idioma y modo de juego*/
public class CLI {
    private static boolean contraComputadora;
    static Scanner scanner = new Scanner(System.in);

    /**Este metodo imprime el menu de idiomas.*/
    public static void mostrarMenuIdiomas() {
        System.out.println("""
                --------------------------------------------------------------------------
                Seleccione su idioma / Select your language / اختر لغتك:
                ESP: Español / Spanish / スペインلغة
                ENG: Inglés / English / إنجليزي
                MAND: Mandarin / Mandarin / الماندرين""");
    }

    /**Este metodo es para que el usuario elija su modo de juego.*/
    public static boolean seleccionarModoJuego(){
        System.out.println(Idiomas.BIENVENIDA);
        System.out.println(Idiomas.SELECCIONE_OPCION);
        System.out.println(Idiomas.PERSONAVPERSONA);
        System.out.println(Idiomas.PERSONAVCOMPUTADORA);

        int opcion = scanner.nextInt();
        scanner.nextLine();

        if (opcion == 1){
            return false;
        } else if (opcion == 2) {
            return true;
        } else {
            System.out.println(Idiomas.OPCION_INVALIDA);
            return seleccionarModoJuego();
        }
    }

    /**Este metodo nos permite iniciar el juego con un bucle en el que se define el modo de juego y que,
     * si el usuario desea, puede jugar otra partida.*/
    public static void iniciarJuego() {

        do {
            if (!contraComputadora) {
                jugarContraJugador();
            } else {
                jugarContraComputadora();
            }

            System.out.println(Idiomas.JUGAR_DE_NUEVO);
            String respuesta = scanner.nextLine().toLowerCase();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println(Idiomas.RESPUESTA_INVALIDA);
                respuesta = scanner.nextLine().toLowerCase();
            }

            if (respuesta.equals("no")) {
                System.out.println(Idiomas.GRACIAS_POR_JUGAR);
                break;
            }

            Tablero.reiniciarTablero();

        } while (true);
        salonDeLaFama.mostrar();
    }

    /**Este metodo es el que nos permite jugar contra otro jugador, contiene validaciones de ingreso de datos.*/
    private static void jugarContraJugador() {
        turnoJugador1 = new Random().nextBoolean();
        System.out.println(Idiomas.NUEVA_PARTIDA);

        System.out.print(Idiomas.NOMBRE_JUGADOR1);
        String nombreJugador1 = scanner.nextLine();
        while (cadenaVacia(nombreJugador1)) {
            System.out.println(Idiomas.NOMBRE_VACIO);
            System.out.print(Idiomas.NOMBRE_JUGADOR1);
            nombreJugador1 = scanner.nextLine();
        }
        System.out.print(Idiomas.SIMBOLO_JUGADOR1);
        String simboloJugador1 = scanner.nextLine().toUpperCase();

        while (cadenaVacia(simboloJugador1) || simboloJugador1.length() != 1 ||
                !simbolosValidos.contains(simboloJugador1)) {
            System.out.println(Idiomas.SIMBOLO_NO_VALIDO);
            System.out.print(Idiomas.INGRESE_SIMBOLO);
            simboloJugador1 = scanner.nextLine().toUpperCase();
        }

        jugador1 = new Jugador(nombreJugador1, simboloJugador1);


        String nombreJugador2;
        do {
            System.out.print(Idiomas.NOMBRE_JUGADOR2);
            nombreJugador2 = scanner.nextLine();
            if (nombreJugador2.equalsIgnoreCase(nombreJugador1)) {
                System.out.println(Idiomas.NOMBRE_JUGADOR2_DIFERENTE);
            }
        } while (nombreJugador2.equalsIgnoreCase(nombreJugador1));

        String simboloJugador2;
        System.out.print(Idiomas.SIMBOLO_JUGADOR2 + simboloJugador1 + "): ");
        simboloJugador2 = scanner.nextLine().toUpperCase();

        while (simboloJugador2.equals(simboloJugador1) || cadenaVacia(simboloJugador2) ||
                simboloJugador2.length() != 1 || !simbolosValidos.contains(simboloJugador2)) {
            System.out.println(Idiomas.SIMBOLO_DIFERENTE + simboloJugador1);
            System.out.print(Idiomas.SIMBOLO_JUGADOR2 + simboloJugador1 + "): ");
            simboloJugador2 = scanner.nextLine().toUpperCase();
        }
        jugador2 = new Jugador(nombreJugador2, simboloJugador2);

        imprimirTablero();

        while (true) {
            if (turnoJugador1) {
                turnoJugador(jugador1);
            } else {
                turnoJugador(jugador2);
            }

            if (verificarVictoria()) {
                System.out.println("¡" + (turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre()) +
                        Idiomas.HA_GANADO);
                break;
            }
            if (tableroLleno()) {
                System.out.println(Idiomas.EMPATE);
                break;
            }

            turnoJugador1 = !turnoJugador1;
        }

        if (verificarVictoria()) {
            salonDeLaFama.actualizar(turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre());
        }

        salonDeLaFama.mostrar();
    }

    /**Este metodo nos permite jugar contra la computadora*/
    public static void jugarContraComputadora(){
        System.out.println(Idiomas.NUEVA_PARTIDA);
        System.out.print(Idiomas.NOMBRE);
        String nombreJugador1 = scanner.nextLine();
        while (cadenaVacia(nombreJugador1)) {
            System.out.println(Idiomas.NOMBRE_VACIO);
            System.out.print(Idiomas.NOMBRE);
            nombreJugador1 = scanner.nextLine();
        }
        System.out.print(Idiomas.INGRESE_SIMBOLO);
        String simboloJugador1 = scanner.nextLine().toUpperCase();

        while (cadenaVacia(simboloJugador1) || simboloJugador1.length() != 1 ||
                !simbolosValidos.contains(simboloJugador1)) {
            System.out.println(Idiomas.SIMBOLO_NO_VALIDO);
            System.out.print(Idiomas.INGRESE_SIMBOLO);
            simboloJugador1 = scanner.nextLine().toUpperCase();
        }
        jugador1 = new Jugador(nombreJugador1, simboloJugador1);
        jugador2 = new Jugador("Computadora", simboloJugador1.equals("X") ? "O" : "X");

        imprimirTablero();

        while (true) {
            if (turnoJugador1) {
                turnoJugador(jugador1);
            } else {
                turnoComputadora();
            }

            if (verificarVictoria()) {
                System.out.println("¡" + (turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre()) +
                        Idiomas.HA_GANADO);
                break;
            }
            if (tableroLleno()) {
                System.out.println(Idiomas.EMPATE);
                break;
            }

            turnoJugador1 = !turnoJugador1;
        }

        if (verificarVictoria()) {
            salonDeLaFama.actualizar(jugador1.getNombre());
        }
    }

    /**Este metodo se ejecuta en cada turno de jugador, para poder saber si el movimiento es correcto.*/
    public static void turnoJugador(Jugador jugador) {
        System.out.println(Idiomas.TURNO + jugador.getNombre() + " (" + jugador.getSimbolo() + ")");

        int fila;
        do {
            System.out.print(Idiomas.FILA);
            String inputFila = scanner.nextLine();
            try {
                fila = Integer.parseInt(inputFila) - 1;
            } catch (NumberFormatException e) {
                System.out.println(Idiomas.NUMERO_INVALIDO);
                fila = -1;
            }
            if (fila < 0 || fila > 2 || filaLlena(fila)) {
                System.out.println(Idiomas.FILA_INVALIDA);
            }
        } while (fila < 0 || fila > 2 || filaLlena(fila));

        int columna;
        do {
            System.out.print(Idiomas.COLUMNA);
            String inputColumna = scanner.nextLine();
            try {
                columna = Integer.parseInt(inputColumna) - 1;
            } catch (NumberFormatException e) {
                System.out.println(Idiomas.NUMERO_INVALIDO);
                columna = -1;
            }
            if (columna < 0 || columna > 2 || columnaLlena(columna)) {
                System.out.println(Idiomas.COLUMNA_INVALIDA);
            }
        } while (columna < 0 || columna > 2 || columnaLlena(columna));

        if (tablero[fila][columna] != '-') {
            System.out.println(Idiomas.CASILLA_OCUPADA);
            turnoJugador(jugador);
        } else {
            tablero[fila][columna] = jugador.getSimbolo().charAt(0);
            imprimirTablero();
        }
    }

    /**Este metodo es el que nos permite iniciar
     *  toda la aplicacion.*/
    public static void launchGame() {
        mostrarMenuIdiomas();
        String idiomaSeleccionado = scanner.nextLine().toUpperCase();
        Idiomas.getInstance(idiomaSeleccionado);

        contraComputadora = seleccionarModoJuego();
        Tablero juego = new Tablero(contraComputadora);

        iniciarJuego();
    }
}
