package edu.jesus_fdez.evidencia3.ui;
import edu.jesus_fdez.evidencia3.process.ComprobadorSimbolos;
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
            System.out.println(idiomas.MENU);
            String gamemode = sc.next();
            switch (gamemode) {
                case "1":
                    // Jugador vs Jugador
                    System.out.println(idiomas.NOMBRE1);
                    String nombre1 = sc.next();
                    System.out.println("Tu nombre es: " + nombre1);
                    System.out.println(idiomas.SIMBOLO1);
                    System.out.println(ComprobadorSimbolos.imprimirSimbolos());
                    int simbolo1 = 0;
                    boolean simboloValido = false;
                    do {
                        try {
                            System.out.print("Elige un símbolo: ");
                            simbolo1 = sc.nextInt();
                            String simboloSeleccionado = ComprobadorSimbolos.obtenerSimbolo(simbolo1);
                            if (simboloSeleccionado != null) {
                                System.out.println("Tu símbolo favorito es: " + simboloSeleccionado);
                                simboloValido = true;
                            } else {
                                System.out.println("El símbolo ingresado no está disponible. Por favor, elige uno de la lista.");
                            }
                            /**if (ComprobadorSimbolos.esSimboloDisponible(String.valueOf(simbolo1))) {
                             simboloValido = true;
                             } else {
                             System.out.println("El símbolo ingresado no está disponible. Por favor, elige uno de la lista.");
                             }*/

                        } catch (InputMismatchException e) {
                            System.out.println("Entrada no válida. Por favor, ingresa un símbolo válido.");
                            sc.next(); // Limpiar el búfer de entrada
                        }
                    } while (!simboloValido);

                    System.out.println("Tu símbolo favorito es: " + simbolo1);

                    Tablero tablero = new Tablero();
                    tablero.mostrarTablero();
                    modoValido = true;
                    break;

                case "2":
                    System.out.println(idiomas.NOMBRE1);
                    String nombre = sc.next();
                    System.out.println("Tu nombre es: " + nombre);
                    System.out.println(idiomas.SIMBOLO1);
                    System.out.println(ComprobadorSimbolos.imprimirSimbolos());
                    int simbolo = 0;
                    boolean simboloValido1 = false;
                    do {
                        try {
                            System.out.print("Elige un símbolo: ");
                            simbolo = sc.nextInt();
                            String simboloSeleccionado = ComprobadorSimbolos.obtenerSimbolo(simbolo);
                            if (simboloSeleccionado != null) {
                                System.out.println("Tu símbolo favorito es: " + simboloSeleccionado);
                                simboloValido1 = true;
                            } else {
                                System.out.println("El símbolo ingresado no está disponible. Por favor, elige uno de la lista.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada no válida. Por favor, ingresa un símbolo válido.");
                            sc.next();
                        }
                    } while (!simboloValido1);

                    System.out.println("Tu símbolo favorito es: " + simbolo);

                    tablero = new Tablero();
                    tablero.mostrarTablero();
                    modoValido = true;
                    break;

                case "3":
                    // Salir
                    modoValido = true;
                    break;

                default:
                    System.out.println(idiomas.ERROR_GAMEMODE);
                    break;
            }
        } while (!modoValido);
    }
}