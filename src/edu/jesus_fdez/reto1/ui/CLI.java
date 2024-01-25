package edu.jesus_fdez.reto1.ui;

import edu.jesus_fdez.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

public class CLI {
    public static void showMenu(){
        System.out.println("Bienvenido a la calculadora de Jesus, selecciona la opcion deseada: ");
        System.out.println("a. Calculo de masa corporal. ");
        System.out.println("b. Calculo de masa corporal magra. ");
        System.out.println("c. Calculo de metabolismo basal. ");
        System.out.println("d. Salir");

    }
    public static void launchApp(){
        Scanner scanner = new Scanner(System.in);
        showMenu();
        char opcion = scanner.next().charAt(0);
        switch (opcion){
            case 'a':

                break;
            case 'b':

                break;
            case 'c':

                break;
            case 'd':

                break;
        }
    }
}
