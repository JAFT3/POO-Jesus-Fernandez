package edu.jesus_fdez.reto6.process;

import edu.jesus_fdez.reto6.data.Categoria;
import edu.jesus_fdez.reto6.data.Empleado;

import java.util.ArrayList;

public class CalculadorSueldos {
    /**
     * Metodo para generar el total de los sueldos
     * **/
    public static void calcularSueldo(ArrayList<Empleado> empleados, int cantEmpleados){
        double totalNomina = 0;
        double totalSueldoNormal = 0;
        double totalHorasExtras = 0;
        int totalPersonasHorasExtra = 0;
        double totalHorasTrabajadas = 0;

        for(Empleado empleado : empleados){
            int horasTrabajadas = empleado.getHorasTrabajadas();
            double horasExtras = empleado.getHorasExtra();
            Categoria categoria = empleado.getCategoria();

            double sueldoNormal = horasTrabajadas * categoria.getSueldoBase();
            double pagoHorasExtras = horasExtras * categoria.getHoraExtra();
            totalHorasTrabajadas += horasTrabajadas + horasExtras;

            totalNomina += sueldoNormal + pagoHorasExtras;
            totalSueldoNormal += sueldoNormal;
            totalHorasExtras += pagoHorasExtras;

            if (horasExtras>0){
                totalPersonasHorasExtra++;
            }
        }
        int totalPersonasSinHorasExtras = cantEmpleados - totalPersonasHorasExtra;

        mostrarReporteFinal(totalNomina,totalSueldoNormal,totalHorasExtras,totalPersonasHorasExtra,
                totalPersonasSinHorasExtras,totalHorasTrabajadas);
    }

    public static void mostrarReporteFinal(double totalNomina,double totalSueldoNormal,double totalHorasExtras,
                                           int totalPersonasHorasExtra, int totalPersonasSinHorasExtras,double totalHorasTrabajadas){
        System.out.println("\n--- Reporte de Nómina ---" +
                "\nTotal de la nómina de la empresa: $" + totalNomina +
                "\nTotal a pagar por sueldo normal: $" + totalSueldoNormal +
                "\nTotal a pagar por horas extras: $" + totalHorasExtras +
                "\nTotal de horas laboradas en la empresa: " + totalHorasTrabajadas +
                "\nTotal de personas que tienen horas extras: " + totalPersonasHorasExtra +
                "\nTotal de personas que no tienen horas extras: " + totalPersonasSinHorasExtras);

    }

}
