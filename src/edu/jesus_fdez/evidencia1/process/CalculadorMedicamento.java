package edu.jesus_fdez.evidencia1.process;

import edu.jesus_fdez.evidencia1.data.Medicamento;
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
