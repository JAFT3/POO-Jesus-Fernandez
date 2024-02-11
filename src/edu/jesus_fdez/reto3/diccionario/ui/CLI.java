package edu.jesus_fdez.reto3.diccionario.ui;

import edu.jesus_fdez.reto3.diccionario.process.Diccionario;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        System.out.println("------------------Diccionario------------------");
        System.out.println("a. Mostrar lista de palabras del diccionario. ");
        System.out.println("b. Buscar significado de la palabra.  ");
        System.out.println("c. Detalle del diccionario. ");
        System.out.println("d. Finalizar programa. ");
        System.out.println("-----------------------------------------------");
    }

    public static void launchApp(Diccionario diccionario) {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Opción deseada: ");
        char opcion = scanner.next().charAt(0);

        do {
            switch (opcion) {
                case 'a':
                    diccionario.printList();
                    break;
                case 'b':
                    diccionario.printList();
                    System.out.println("¿Qué palabra quiere conocer?");
                    // Consumir el carácter de nueva línea
                    scanner.nextLine();
                    String palabra = scanner.nextLine();
                    String definicion = diccionario.buscarDefinicion(palabra);
                    System.out.println("Palabra a mostrar significado: " + palabra);
                    System.out.println("Significado: " + definicion);
                    break;
                case 'c':
                    diccionario.mostrarCaracteres();
                    break;
                default:
                    System.out.println("Error ocurrido.");
            }

            // Volver a solicitar la opción
            showMenu();
            System.out.println("Opción deseada: ");
            opcion = scanner.next().charAt(0);

        } while (opcion != 'd');
        System.out.println("Muchas gracias por usar nuestra aplicación.");
    }
}
