package edu.jesus_fdez.reto1.ui;

import edu.jesus_fdez.reto1.process.CalculadoraMasaCorporal;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class CLI {
    public static double estatura;
    public static double peso;
    public static String sexo;
    public static int edad;

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
                System.out.println("Excelente eleccion, a continuacion te proporcionaremos tus datos!");
                System.out.println("Para realizar la operacion, necesitaremos los siguientes datos base.");
                System.out.print("Ingresa tu estatura en centimetros: ");
                estatura = scanner.nextDouble();
                System.out.print("Ingresa tu peso en kilogramos: ");
                peso = scanner.nextInt();
                double resultado = CalculadoraMasaCorporal.calcularIndiceMasaCorporal(estatura, peso);
                System.out.println("Tu IMC es: "+ resultado);
                String clasificacion = CalculadoraMasaCorporal.clasificarIndiceMasaCorporal(resultado);
                System.out.println("Tu clasifiacion es: " + clasificacion);
                break;
            case 'b':
                System.out.println("Excelente eleccion, en esta ocasion ocuparemos que proporciones los siguiente datos: ");
                System.out.println("Para realizar la operacion, necesitaremos los siguientes datos base.");
                System.out.print("Ingresa tu estatura en centimetros: ");
                estatura = scanner.nextDouble();
                System.out.print("Ingresa tu peso en kilogramos: ");
                peso = scanner.nextInt();
                System.out.println("Ingresa tu sexo: (M - Masculino , F - Femenino)");
                sexo = scanner.next().toUpperCase();
                short resultado2 = (short) CalculadoraMasaCorporal.calcularMasaCorporalMagra(estatura, peso, sexo);
                System.out.println("Tu masa corporal magra es de: " + resultado2 + "kg");
                break;
            case 'c':
                System.out.println("Excelente eleccion, en esta ocasion ocuparemos que proporciones los siguiente datos: ");
                System.out.println("Para realizar cualquier operacion, necesitaremos los siguientes datos base.");
                System.out.print("Ingresa tu estatura en centimetros: ");
                estatura = scanner.nextDouble();
                System.out.print("Ingresa tu peso en kilogramos: ");
                peso = scanner.nextInt();
                System.out.println("Ingresa tu sexo: (M - Masculino , F - Femenino)");
                sexo = scanner.next().toUpperCase();
                System.out.println("Ingresa tu edad: ");
                edad = scanner.nextInt();
                double resultado3 = CalculadoraMasaCorporal.calcularMetabolismoBasal(estatura, peso, sexo, edad);
                System.out.println("Tu gasto de energia basal es de: " + resultado3);
                break;
            case 'd':
                System.out.println("Muchas gracias por usar la calculadora de Jesus!");
                break;
        }

        System.out.println("Aplicacion terminada");
    }
}