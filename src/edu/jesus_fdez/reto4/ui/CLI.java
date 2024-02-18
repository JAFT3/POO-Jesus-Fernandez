package edu.jesus_fdez.reto4.ui;

import edu.jesus_fdez.reto2.venta_cajas.process.CalculadorCompraVenta;

import java.util.Scanner;

public class CLI {

    public static void showMenu(){
        System.out.println("--Sistema de registro de ventas--");
        System.out.println("a. Realizar venta de boleto. ");
        System.out.println("b. Mostrar datos de la lista de ventas. ");
        System.out.println("c. Finalizar programa. ");
    }
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);
        char opcion;
        do {
            showMenu();
            System.out.print("Opcion a elegir: ");
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a':
                    break;

                case 'b':
                    break;

                default:
                    System.out.println("Opcion No valida");
            }
        }while (opcion != 'c') ;
        System.out.println("Muchas gracias por usar nuestra aplicacion. ");
    }
}
