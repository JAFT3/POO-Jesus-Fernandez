package edu.jesus_fdez.reto7.ui;

import edu.jesus_fdez.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static final Scanner sc = new Scanner(System.in);
    private static double numero1;
    private static double numero2;

    private static Idiomas idiomas = new ESP();

    public static void showMenu() {
        System.out.println("---Calculator---");
        System.out.println("Select a language (Selecciona el idioma): ");
        System.out.println("A. English (Ingles)");
        System.out.println("B. Spanish (Español)");
        String idioma = sc.next().charAt(0);
        switch (idioma){
            case 'a':
                idiomas = new ENG();
                break;
            case 'b':
                idiomas = new ESP();
                break;
        }
        System.out.println(idiomas.MENU);
    }

    public static void launchCalculadora() {
        showMenu();
        int opcion = sc.next().charAt(0);
        Operacion operacion = null;
        switch (opcion) {
            case 'a':
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                numero1 = sc.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                numero2 = sc.nextDouble();
                operacion = new Suma();
                break;
            case 'b':
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                numero1 = sc.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                numero2 = sc.nextDouble();
                operacion = new Resta();
                break;
            case 'c':
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                numero1 = sc.nextDouble();

                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                numero2 = sc.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 'd':
                System.out.println(idiomas.INGRESAR_DIVIDIENDO);
                numero1 = sc.nextDouble();

                System.out.println(idiomas.INGRESAR_DIVISOR);
                numero2 = sc.nextDouble();
                operacion = new Division();
                break;
            case 'e':
                System.out.println(idiomas.INGRESAR_DIVIDIENDO);
                numero1 = sc.nextDouble();

                System.out.println(idiomas.INGRESAR_DIVISOR);
                numero2 = sc.nextDouble();
                operacion = new Modulo();
                break;
            case 'f':
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                numero1 = sc.nextDouble();
                System.out.println(idiomas.INGRESAR_POTENCIA);
                numero2 = sc.nextDouble();
                operacion = new Potencia();
            case 'g':
                System.out.println(idiomas.INGRESAR_PRIMERNUMERO);
                numero1 = sc.nextDouble();
                System.out.println(idiomas.INGRESAR_SEGUNDONUMERO);
                numero2 = sc.nextDouble();
                operacion = new Logaritmo();
                break;
            default:
                System.out.println(idiomas.OPCION_INVALIDA);
        }
        if (operacion != null) {
            imprimirResultado()
            System.out.println(idiomas.FINAL);
        } else {
            System.out.println(idiomas.OPCION_INVALIDA);
        }

    }
    public static void imprimirResultado(Operacion operacion, double numero1, double numero2){
        System.out.println(idiomas.RESULTADO_UNO + operacion.getClass().getSimpleName() + idiomas.RESULTADO_DOS
                + operacion.calcular(numero1,numero2));
    }
}
