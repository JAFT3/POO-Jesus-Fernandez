package edu.jesus_fdez.reto1.ui;

import edu.jesus_fdez.reto1.process.CalculadoraMasaCorporal;

import java.util.Scanner;

import static edu.jesus_fdez.reto1.process.CalculadoraMasaCorporal.calcularIndiceMasaCorporal;

public class CLI {
    public static double estatura;
    public static int peso;
    public static double imc;

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

        System.out.print("Ingresa tu estatura en centimetros: ");
        estatura = scanner.nextDouble();
        System.out.print("Ingresa tu peso en kilogramos: ");
        peso = scanner.nextInt();

        switch (opcion){
            case 'a':
                System.out.println("Excelente eleccion, a continuacion te proporcionaremos tus datos!");
                double resultado = CalculadoraMasaCorporal.calcularIndiceMasaCorporal(estatura, peso);
                System.out.println(resultado);
                CalculadoraMasaCorporal.clasificarIndiceMasaCorporal(imc);

                break;
            case 'b':
                System.out.println("Tu opcion es b");
                break;
            case 'c':
                System.out.println("Tu opcion es c");
                break;
            case 'd':
                System.out.println("Tu opcion es d");
                break;
        }

        System.out.println("Aplicacion terminada");
    }
}
