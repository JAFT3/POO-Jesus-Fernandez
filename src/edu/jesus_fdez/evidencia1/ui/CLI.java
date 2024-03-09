package edu.jesus_fdez.evidencia1.ui;

import edu.jesus_fdez.evidencia1.data.Medicamento;
import edu.jesus_fdez.evidencia1.process.CalculadorMedicamento;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    static double precioPublico = 0;
    static String nombreGenerico;
    static String nombreRegistrado;
    static String formaFarmaceutica;
    static String nombreQuimico;
    public static Scanner scanner = new Scanner(System.in);

    public static void launchApp(ArrayList<Medicamento> medicamentos) {
        CalculadorMedicamento.login();
        System.out.println("---------BIENVENIDO AL CONTROL DE DATOS DE LA FARMACIA-----------");
        System.out.println("(----Digite la opcion salir en cualquier momento para salir.----)");
        while (true) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Ingrese el nombre químico del medicamento (o 'salir' para terminar):");
            nombreQuimico = scanner.nextLine();

            if (nombreQuimico.equalsIgnoreCase("salir")) {
<<<<<<< HEAD
                CalculadorMedicamento.generarReporte(medicamentos);
                break; // Sale del bucle si el usuario decide salir.
            } else {
                /**
                 * Resto del código para ingresar datos del medicamento
                 */

=======
                System.out.println("Has salido con éxito.");
                break; // Sale del bucle si el usuario decide salir.

            } else {
                // Resto del código para ingresar datos del medicamento
>>>>>>> evidencia1
                System.out.println("Ingrese el nombre genérico:");
                nombreGenerico = scanner.nextLine();

                System.out.println("Ingrese el nombre registrado:");
                nombreRegistrado = scanner.nextLine();

<<<<<<< HEAD
                while (true) {
                    System.out.println("Ingrese el precio al público:");

                    try {
                        precioPublico = Double.parseDouble(scanner.nextLine());
                        break;
=======

                while (true) {
                    System.out.println("Ingrese el precio al público:");

                    try {
                        precioPublico = Double.parseDouble(scanner.nextLine());
                        break;

>>>>>>> evidencia1
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un valor numérico válido.");
                    }
                }

                System.out.println("Ingrese el tipo de presentación (solido/semisolido/liquido):");
                formaFarmaceutica = scanner.nextLine();

<<<<<<< HEAD
                /**
                 * Resto del código para manejar la información del medicamento.
                 */

                // Agregar el medicamento a la lista
                Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado, formaFarmaceutica, precioPublico);
                medicamentos.add(medicamento);
            }
        }
    }
}
=======
                // Resto del código para manejar la información del medicamento.
            }
        }
            //ingresa las variables al ArrayList
        Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado, formaFarmaceutica, precioPublico);
        medicamentos.add(medicamento);

        }
    }
>>>>>>> evidencia1
