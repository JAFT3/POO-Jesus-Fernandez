package edu.jesus_fdez.reto7.ui;

import edu.jesus_fdez.reto7.process.*;

import java.util.Scanner;

public class CLI {
    private static final Scanner sc = new Scanner(System.in);
    private static double numero1;
    private static double numero2;

    public static void showMenu() {
        System.out.println("---Calculadora---");

        System.out.println("Elige una opción: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Logaritmo");
        System.out.println("Ingrese el numero de la opción deseada: ");

    }

    public static void launchCalculadora() {
        showMenu();
        int opcion = sc.next().charAt(0);
        ();
        Operacion operacion = null;
        switch (opcion) {
            case 'a':
                System.out.println("Ingrese el primer número:");
                numero1 = sc.nextDouble();

                System.out.println("Ingrese el segundo número:");
                numero2 = sc.nextDouble();
                operacion = new Suma();
                break;
            case 'b':
                System.out.println("Ingrese el primer número:");
                numero1 = sc.nextDouble();

                System.out.println("Ingrese el segundo número:");
                numero2 = sc.nextDouble();
                operacion = new Resta();
                break;
            case 'c':
                System.out.println("Ingrese el primer número:");
                numero1 = sc.nextDouble();

                System.out.println("Ingrese el segundo número:");
                numero2 = sc.nextDouble();
                operacion = new Multiplicacion();
                break;
            case 'd':
                System.out.println("Ingrese el dividendo:");
                numero1 = sc.nextDouble();

                System.out.println("Ingrese el divisor:");
                numero2 = sc.nextDouble();
                operacion = new Division();
                break;
            case 'e':
                System.out.println("Ingrese el dividendo:");
                numero1 = sc.nextDouble();

                System.out.println("Ingrese el divisor:");
                numero2 = sc.nextDouble();
                operacion = new Modulo();
                break;
            case 'f':
                System.out.println("Ingrese el numero: ");
                numero1 = sc.nextDouble();
                System.out.println("Ingrese a que potencia lo desea elevar: ");
                numero2 = sc.nextDouble();
                operacion = new Potencia();
            case 'g':
                System.out.println("Ingresa el primer numero: ");
                numero1 = sc.nextDouble();
                System.out.println("Ingrese el segundo numero: ");
                numero2 = sc.nextDouble();
                operacion = new Logaritmo();
                break;
            default:
                System.out.println("Opcion no valida");
        }
        if (operacion != null) {
            System.out.println("El resultado es: " + operacion.calcular(numero1, numero2));
            System.out.println("\nGracias por usar el programa.");
        } else {
            System.out.println("Opcion no valida");
        }
    }
}
