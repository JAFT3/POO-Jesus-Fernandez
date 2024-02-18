package edu.jesus_fdez.reto4.process;

import edu.jesus_fdez.reto4.data.Boleto;
import edu.jesus_fdez.reto4.data.Ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class VendedorBoletos {

    //Declara una lista estática de objetos Boleto llamada listaPasajeros,
    // que almacena información sobre los boletos vendidos.
    public static ArrayList<Boleto> listaPasajeros = new ArrayList<>();

    //Este método se encarga de solicitar información al usuario para realizar una venta.
    //Lee el nombre del comprador y la cantidad de boletos extra.
    //Utiliza un bucle para recoger los nombres de los pasajeros adicionales.
    //Llama al método generarVenta() para procesar la información ingresada.
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
    //Este método crea un objeto Boleto con la información proporcionada y lo agrega a la lista listaPasajeros.
    //Llama al método crearTicket(boleto) de la clase Ticket
    public static void generarVenta(String nombre, int cantidadBoletos, ArrayList<String> pasajeros, ArrayList<Boleto> listaPasajeros){
        Boleto boleto = new Boleto(nombre, cantidadBoletos, pasajeros);
        listaPasajeros.add(boleto);
        Ticket.crearTicket(boleto);
    }

    //Este método imprime la información de la lista de pasajeros, incluyendo el comprador,
    // los pasajeros adicionales, la cantidad total de boletos y el monto total de ventas.
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
