package edu.jesus_fdez.reto9.ui;

import java.util.Scanner;

public class CLI {
    public static Idiomas idiomas = new ESP();

    public static void showMenu() {
        System.out.println("------------------Idioma------------------" +
                "\nDigite el idioma (Type the language)" +
                "\n1- Español (ESP)" +
                "\n2- English (ENG)" +
                "\n------------------------------------------");
    }

    public static void launchApp() {
        Scanner sc = new Scanner(System.in);
        showMenu();
        String idioma = sc.next();

        switch (idioma.toUpperCase()) {
            case "ESP":
                idiomas = new ESP();
                break;
            case "ENG":
                idiomas = new ENG();
                break;
        }
        System.out.println(idiomas.MENU);
        System.out.println("Seleccione el libro deseado (Select the desired book):");
        String libroSeleccionado = sc.next(); // Cambiado a next() para evitar el salto de línea no deseado
        switch (libroSeleccionado) {
            case "1":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO1);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "2":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO2);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "3":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO3);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "4":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO4);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            case "5":
                System.out.println(Idiomas.LIBRO_SELECCIONADO + Idiomas.LIBRO5);
                System.out.println(Idiomas.LISTA_PALABRAS);
                break;
            default:
                System.out.println(Idiomas.ERROR_LIBRO);
        }
    }
}
