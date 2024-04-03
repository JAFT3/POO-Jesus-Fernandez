package edu.jesus_fdez.evidencia1.process;

import edu.jesus_fdez.evidencia1.data.Medicamento;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadorMedicamento {
    static String userCorrecto = "admin";
    static String passwordCorrecto = "admin";

    public static void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el usuario");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña");
        String password = scanner.next();

        if(!(usuario.equals(userCorrecto) && password.equals(passwordCorrecto))) {
            System.out.println("Usuario o contraseña incorrectos, intente de nuevo");
            login();
        }
    }

    public static String calcularEstado(int formaFarmaceutica) {
        if (formaFarmaceutica > 0 && formaFarmaceutica < 10) {
            return "solido";
        } else if (formaFarmaceutica > 9 && formaFarmaceutica < 14) {
            return "semisolido";
        } else {
            return "liquido";
        }
    }

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

    public static void generarReporte(ArrayList<Medicamento> medicamentos){
        // Implementación del método para generar el reporte
    }
}
