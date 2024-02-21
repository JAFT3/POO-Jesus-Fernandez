package edu.jesus_fdez.evidencia1.ui;

import edu.jesus_fdez.evidencia1.process.CalculadorMedicamento;

import java.util.Scanner;

public class CLI {
    public static Scanner scanner = new Scanner(System.in);
    public static void login(){
        String user = "admin";
        String password = "admin";
        boolean loginExitoso = false;
        do {
            System.out.println("Ingresa el usuario: ");
            String usuario = scanner.next();
            System.out.println("Ingresa la contraseña: ");
            String contraseña = scanner.next();
            if (usuario.equals(user) && contraseña.equals(password)) {
                System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
                loginExitoso = true;
                launchApp();
            } else {
                System.out.println("Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.");
            }
        }while (!loginExitoso);

    }

    public static void launchApp(){
        CLI.login();
        System.out.println("---------BIENVENIDO AL CONTROL DE DATOS DE LA FARMACIA-----------");
        System.out.println("(----Digite la opcion salir en cualquier momento para salir.----)");
        System.out.println("Ingrese el nombre químico del medicamento (o 'salir' para terminar):");
        String nombreQuimico = scanner.nextLine();

        if (nombreQuimico.equalsIgnoreCase("salir")) {
            CalculadorMedicamento.generarReporte(medicamentos);

        } else {
            // Resto del código para ingresar datos del medicamento
            System.out.println("Ingrese el nombre genérico:");
            String nombreGenerico = scanner.nextLine();

            System.out.println("Ingrese el nombre registrado:");
            String nombreRegistrado = scanner.nextLine();

            System.out.println("Ingrese el precio al público:");
            double precioPublico = Double.parseDouble(scanner.nextLine());

            System.out.println("Ingrese el tipo de presentación (solido/solido semisolido/solido liquido):");
            String formaFarmaceutica = scanner.nextLine();

            //ingresa las variables al ArrayList
            Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado,
                    formaFarmaceutica, precioPublico);
            medicamentos.add(medicamento);
    }
}
