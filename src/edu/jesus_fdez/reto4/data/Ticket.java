package edu.jesus_fdez.reto4.data;

public class Ticket {
    public static void crearTicket(Boleto boleto){
        System.out.println("--Ticket--");
        int totalBoletos = boleto.boleto + 1;
        System.out.println("Cantidad de boletos: " + totalBoletos);
        System.out.println("Importe de venta: $" + boleto.calcularTotal());
        System.out.println("Nombre del comprador: " + boleto.pasajero);
        System.out.println("Pasajeros adicionales: " + boleto.boleto);
    }
}
