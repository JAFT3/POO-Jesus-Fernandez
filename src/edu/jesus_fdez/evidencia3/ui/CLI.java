package edu.jesus_fdez.evidencia3.ui;

import edu.jesus_fdez.evidencia3.data.Jugador;
import edu.jesus_fdez.evidencia3.process.Tablero;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static edu.jesus_fdez.evidencia3.process.Tablero.*;


/**Esta clase es la clase de interfaz donde se imprimirán todas las variables y el usuario seleccionara
 * el idioma y modo de juego*/
public class CLI {
    private static boolean contraComputadora;
    static Scanner scanner = new Scanner(System.in);

    /**Este metodo imprime el menu de idiomas.*/
    public static void menuIdiomas() {
        System.out.println("""
                --------------------------------------------------------------------------
                Seleccione su idioma / Select your language / 选择您使用的语言:
                ESP: Español / Spanish / スペイン語
                ENG: Inglés / English / 英語
                MAND: Mandarin / Mandarin / 普通话""");
    }

    /**Este metodo es el que nos permite iniciar
     *  toda la aplicacion.*/
    public static void launchApp() {
        String idiomaSeleccionado;

        do {
            menuIdiomas();
            idiomaSeleccionado = scanner.nextLine().toUpperCase();
        } while (!idiomaSeleccionado.equals("ESP") && !idiomaSeleccionado.equals("ENG")&&!idiomaSeleccionado.equals("MAND"));

        Idiomas.getInstance(idiomaSeleccionado);

        contraComputadora = seleccionarModoJuego(); // Obtener el valor del modo de juego
        Tablero juego = new Tablero(contraComputadora); // Crear una instancia de Juego con el modo de juego seleccionado

        startGame();
    }

    /**Este metodo es para que el usuario elija su modo de juego.*/
    public static boolean seleccionarModoJuego(){
        int opcion;

        do {
            System.out.println(Idiomas.BIENVENIDA);
            System.out.println(Idiomas.SELECCIONE_OPCION);
            System.out.println(Idiomas.PERSONAVPERSONA);
            System.out.println(Idiomas.PERSONAVCOMPUTADORA);

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 1){
                    return false;
                } else if (opcion == 2) {
                    return true;
                } else {
                    System.out.println(Idiomas.OPCION_INVALIDA);
                }
            } catch (InputMismatchException e) {
                System.out.println(Idiomas.OPCION_INVALIDA);
                scanner.nextLine(); // Limpiar el buffer del scanner
            }
        } while (true);
    }


/**Este metodo nos permite iniciar el juego con un bucle en el que se define el modo de juego y que,
     * si el usuario desea, puede jugar otra partida.*/
    public static void startGame() {

        do {
            if (!contraComputadora) {
                jugarContraJugador();
            } else {
                jugarContraCPU();
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

            // Reiniciar el tablero para iniciar una nueva partida
            Tablero.reiniciarTablero();

        } while (true);
        // Mostrar el salón de la fama al finalizar el juego
        salonDeLaFama.imprimirSalonFama();
    }

    /**Este metodo es el que nos permite jugar contra otro jugador, contiene validaciones de ingreso de datos.*/
    private static void jugarContraJugador() {
        // Elegir aleatoriamente quién empieza
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

        imprimirTablero(); // Imprimir el tablero antes de solicitar la siguiente jugada

        while (true) {
            if (turnoJugador1) {
                turnoJugador(jugador1);
            } else {
                turnoJugador(jugador2);
            }

            if (comprobarGanador()) {
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

        // Actualizar el salón de la fama
        if (comprobarGanador()) {
            salonDeLaFama.refrescarSalonFama(turnoJugador1 ? jugador1.getNombre() : jugador2.getNombre());
        }

        // Imprimir el salón de la fama al final de la partida
        salonDeLaFama.imprimirSalonFama();
    }

    /**Este metodo nos permite jugar contra la computadora*/
    public static void jugarContraCPU(){
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
                turnoCPU();
            }

            if (comprobarGanador()) {
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

        // Actualizar el salón de la fama
        if (comprobarGanador()) {
            salonDeLaFama.refrescarSalonFama(jugador1.getNombre());
        }
    }

    /**Este metodo se ejecuta en cada turno de jugador, para poder saber si el movimiento es correcto.*/
    public static void turnoJugador(Jugador jugador) {
        System.out.println(Idiomas.TURNO + jugador.getNombre() + " (" + jugador.getSimbolo() + ")");

        // Solicitar la fila
        int fila;
        do {
            System.out.print(Idiomas.FILA);
            String inputFila = scanner.nextLine();
            try {
                fila = Integer.parseInt(inputFila) - 1; // Ajustar la fila ingresada a la indexación del arreglo
            } catch (NumberFormatException e) {
                System.out.println(Idiomas.NUMERO_INVALIDO);
                fila = -1; // Valor inválido para continuar el bucle
            }
            if (fila < 0 || fila > 2 || filaLlena(fila)) {
                System.out.println(Idiomas.FILA_NO_VALIDA);
            }
        } while (fila < 0 || fila > 2 || filaLlena(fila));

        // Solicitar la columna
        int columna;
        do {
            System.out.print(Idiomas.COLUMNA);
            String inputColumna = scanner.nextLine();
            try {
                columna = Integer.parseInt(inputColumna) - 1; // Ajustar la columna ingresada a la indexación del arreglo
            } catch (NumberFormatException e) {
                System.out.println(Idiomas.NUMERO_INVALIDO);
                columna = -1; // Valor inválido para continuar el bucle
            }
            if (columna < 0 || columna > 2 || columnaLlena(columna)) {
                System.out.println(Idiomas.COLUMNA_NO_VALIDA);
            }
        } while (columna < 0 || columna > 2 || columnaLlena(columna));

        // Verificar si la casilla está ocupada
        if (tablero[fila][columna] != '-') {
            System.out.println(Idiomas.CASILLA_OCUPADA);
            turnoJugador(jugador); // Solicitar una nueva jugada
        } else {
            // Colocar el símbolo en el tablero
            tablero[fila][columna] = jugador.getSimbolo().charAt(0);
            imprimirTablero();
        }
    }

}
