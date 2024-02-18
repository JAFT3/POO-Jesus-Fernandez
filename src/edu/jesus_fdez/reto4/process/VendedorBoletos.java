package edu.jesus_fdez.reto4.process;

import edu.jesus_fdez.reto4.data.Boleto;
import edu.jesus_fdez.reto4.data.Ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class VendedorBoletos {
    public static ArrayList<Boleto> listaPasajeros = new ArrayList<>();

    public static void realizarVenta(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del comprador: ");
        String nombre = scanner.nextLine();
        System.out.print("Cantidad de boletos extra: ");
        int cantidadBoletos = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> pasajeros = new ArrayList<>();
        for (int i = 1; i <= cantidadBoletos ; i++) {
            System.out.println("Ingrese el nombre completo del pasajero adicional " + i + ":");
            pasajeros.add(scanner.nextLine());
        }
        generarVenta(nombre,cantidadBoletos,pasajeros,listaPasajeros);
    }

    public static void generarVenta(String nombre, int cantidadBoletos, ArrayList<String> pasajeros, ArrayList<Boleto> listaPasajeros){
        Boleto boleto = new Boleto(nombre, cantidadBoletos, pasajeros);
        listaPasajeros.add(boleto);
        Ticket.crearTicket(boleto);
    }

    public static void mostrarListaPasajeros(){
        System.out.println("--Lista Pasajeros--");
        for (Boleto boleto : listaPasajeros){
            System.out.println("Pasajero 1 (Comprador): " + boleto.pasajero);
            System.out.println("Pasajeros adicionales: " + boleto.pasajeros);
            int boletosTotales = boleto.boleto + 1;
            System.out.println("Cantidad de boletos: " + boletosTotales);
            System.out.println("Monto total de ventas: " + boleto.calcularTotal());
        }
    }
}
