package edu.jesus_fdez.reto6.ui;

import edu.jesus_fdez.reto6.data.Categoria;
import edu.jesus_fdez.reto6.data.Empleado;
import edu.jesus_fdez.reto6.process.CalculadorSueldos;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {
    public static void launchApp(ArrayList<Empleado> empleados, Categoria empleadoVentas, Categoria administrador, Categoria gerente) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Registro de Empleados----" +
                "\nIngrese la cantidad de Empleados a capturar: ");
        int cantEmpleados = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente después de leer el entero

        for (int i = 0; i < cantEmpleados; i++) {
            System.out.println("\nEmpleado #" + (i + 1));
            System.out.print("Nombre completo: ");
            String nombre = sc.nextLine();
            System.out.print("Numero Telefonico: ");
            int horasTrabajadas = sc.nextInt();
            System.out.print("Horas trabajadas: ");
            int horasTrabajadas = sc.nextInt();
            System.out.print("Horas extras trabajadas: ");
            int horasExtras = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea pendiente después de leer el entero

            System.out.println("Seleccione la categoría (ingrese el número):" +
                    "\nA. Empleado Ventas" +
                    "\nB. Administrador" +
                    "\nC. Gerente");
            char categoriaSeleccionada = sc.nextLine().toLowerCase().charAt(0);

            Categoria categoria;

            switch (categoriaSeleccionada) {
                case 'a':
                    categoria = empleadoVentas;
                    break;
                case 'b':
                    categoria = administrador;
                    break;
                case 'c':
                    categoria = gerente;
                    break;
                default:
                    System.out.println("Opción inválida, se asignará la categoría por defecto.");
                    categoria = empleadoVentas;
                    break;
            }

            empleados.add(new Empleado(nombre, horasTrabajadas, horasExtras, categoria));
        }

        mostrarDatos(empleados, empleadoVentas, administrador, gerente, cantEmpleados);
    }

    public static void mostrarDatos(ArrayList<Empleado> empleados,
                                    Categoria empleadoVentas, Categoria administrador, Categoria gerente,
                                    int cantEmpleados) {
        // Mostrar datos de empleado
        for (Empleado empleado : empleados) {
            System.out.println(empleado.toString());
        }

        CalculadorSueldos.calcularSueldo(empleados, cantEmpleados);
    }
}

