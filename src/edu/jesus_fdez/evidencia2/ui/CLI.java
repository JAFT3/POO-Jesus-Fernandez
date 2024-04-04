package edu.jesus_fdez.evidencia2.ui;

import edu.jesus_fdez.evidencia2.process.CalculadoraCostos;
import edu.jesus_fdez.evidencia2.data.Producto;

import java.util.List;
import java.util.Scanner;

public class CLI {
    public static Idiomas idiomas = new ESP();

    public static void showMenu(){
        System.out.println("------------------Idioma------------------" +
                "\nDigite el idioma (Type the language)" +
                "\n1- Español (ESP)" +
                "\n2- English (ENG)" +
                "\n------------------------------------------");
    }

    public static void launchApp(){
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
        System.out.println();
        System.out.println(idiomas.INICIO_SESION);
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "admin";
        boolean credencialesCorrectas = false;

        while (!credencialesCorrectas) {
            System.out.println(idiomas.USUARIO);
            sc.nextLine();
            String usuario = sc.nextLine();
            System.out.println(idiomas.CONTRASENA);
            String contrasena = sc.nextLine();

            if(usuario.equals(usuarioCorrecto) && contrasena.equals(contrasenaCorrecta)){
                credencialesCorrectas = true;
            } else {
                System.out.println(idiomas.DATOS_INCORRECTOS);
            }
        }

        System.out.println();
        System.out.println(idiomas.INICIO_EXITOSO);

        List<Producto> productosConsumidos = CalculadoraCostos.generadorAleatorio();
        double precioTotal = CalculadoraCostos.calcularPrecioTotal(productosConsumidos);

        System.out.println();
        System.out.println(idiomas.SALDO_PAGAR + precioTotal);
    }
}
