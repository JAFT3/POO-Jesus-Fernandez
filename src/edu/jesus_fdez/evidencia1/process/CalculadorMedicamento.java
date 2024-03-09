package edu.jesus_fdez.evidencia1.process;

import edu.jesus_fdez.evidencia1.data.Medicamento;
<<<<<<< HEAD

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase para crear los procedimientos requeridos para los medicamentos
 * incluye los metodos de: login, calcular el estado del medicamento,
 * calcular el precio de venta y generar reporte final
 */
public class CalculadorMedicamento {
    static String userCorrecto = "admin";
    static String passwordCorrecto = "admin";

    /**
     *     Metodo para hacer el login de usuario
     */

    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el usuario");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña");
        String password = scanner.next();

        /**
         * Verificar si el usuario y contraseña son los correctos
         */

        if(!(usuario.equals(userCorrecto) && password.equals(passwordCorrecto))) {
            System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
            login(); // Llamada para volver a solicitar credenciales
        }
    }

    /**
     * Metodp para calcular el estado del medicamento ingresado por el usuario
     * @param formaFarmaceutica en numero entero
     * @return Forma farmaceutica
     */

    public static String calcularEstado(int formaFarmaceutica) {
        if (formaFarmaceutica > 0 && formaFarmaceutica < 10) {
            return "solido";
        } else if (formaFarmaceutica > 9 && formaFarmaceutica < 14) {
            return "semisolido";
        } else {
            return "liquido";
        }
    }
    /**
     * Metodo para calcular el precio de venta del medicamento
     * @param precioPublico double
     * @param formaFarmaceutica string
     * @return el precio de Venta a farmacias
     */
    public static double calcularPrecio(double precioPublico, String formaFarmaceutica) {
        double precioVenta = 0.0;
        if (formaFarmaceutica.equalsIgnoreCase("solido")) {
            precioVenta = precioPublico * 1.09;
        } else if (formaFarmaceutica.equalsIgnoreCase("semisolido")) {
            precioVenta = precioPublico * 1.12;
        } else if (formaFarmaceutica.equalsIgnoreCase("liquido")) {
            precioVenta = precioPublico * 1.13;
        }
        return precioVenta;
    }

    /**
     * Metodo para generar el reporte final
     * @param medicamentos arrayList
     */
    public static void generarReporte(ArrayList<Medicamento> medicamentos){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("---Reporte Final---");
        System.out.println("Reporte generado por: " + userCorrecto);
        System.out.println("Fecha de generación de reporte: " + dtf.format(now));
        System.out.println("Cantidad de productos en la lista: " + medicamentos.size());

        if (medicamentos.isEmpty()) {
            System.out.println("No hay medicamentos registrados.");
        } else {
            System.out.println("Lista de medicamentos:");
            for (Medicamento medicamento : medicamentos) {
                System.out.println(medicamento.toString());
            }
        }

    }
}
=======
import edu.jesus_fdez.evidencia1.ui.CLI;

import java.util.Scanner;

public class CalculadorMedicamento {
    public static Scanner scanner = new Scanner(System.in);
    public static void login() {
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
            } else {
                System.out.println("Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.");
            }
        } while (!loginExitoso);

    }
    public static double calcularPrecio(double precioPublico, String formaFarmaceutica){
        double precioVenta = 0;
        switch (formaFarmaceutica){
            case "solido":
                precioVenta = precioPublico * 1.09;
                return precioVenta;
            case "semisolido":
                precioVenta = precioPublico * 1.12;
                return precioVenta;
            case "liquido":
                precioVenta = precioPublico * 1.13;
                return precioVenta;
            default:
                throw new IllegalStateException("Unexpected value: " + formaFarmaceutica);
        }
    }
}
>>>>>>> evidencia1
