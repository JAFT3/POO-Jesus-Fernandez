package edu.jesus_fdez.reto2.venta_cajas.ui;

import edu.jesus_fdez.reto2.venta_cajas.process.CalculadorCompraVenta;
import java.util.Scanner;

public class CLI {
    /** **/
    public static void login(){
        String user = "admin";
        String password = "admin";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el usuario: ");
        String usuario = scanner.next();
        System.out.println("Ingresa la contraseña: ");
        String contraseña = scanner.next();
        if (usuario.equals(user) && contraseña.equals(password)) {
            System.out.println("Inicio de sesión exitoso. ¡Bienvenido!");
            launchApp();
        } else {
            System.out.println("Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.");
        }
    }
    public static int cantidad;
    public static double precio;

    public static void showMenu() {
        System.out.println("Bienvenido al punto de venta, selecciona la opcion deseada: ");
        System.out.println("a. Comprar cajas de papel.  ");
        System.out.println("b. Vender cajas de papel.  ");
        System.out.println("c. Mostrar reporte.  ");
        System.out.println("d. Salir");


    }

    public static void launchApp() {
        Scanner scanner = new Scanner(System.in);
        char opcion;
        do {
            showMenu();
            opcion = scanner.next().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("Excelente eleccion,has seleccionado la opcion de comprar cajas!");
                    System.out.print("Para comenzar ocuparemos la cantidad de cajas por comprar: ");
                    cantidad = scanner.nextInt();
                    System.out.print("Costo por unidad: ");
                    precio = scanner.nextDouble();
                    double resultado = CalculadorCompraVenta.comprarCajas(cantidad, precio);
                    System.out.println("La venta realizada por " + cantidad + " cajas al costo " + precio + " es igual a " + resultado + ".");

                    break;

                case 'b':
                    System.out.println("Excelente eleccion,has seleccionado la opcion de vender cajas!");
                    System.out.print("Para comenzar ocuparemos la cantidad de cajas por vender: ");
                    cantidad = scanner.nextInt();
                    System.out.print("Costo por unidad: ");
                    precio = scanner.nextDouble();
                    resultado = CalculadorCompraVenta.venderCajas(cantidad, precio);
                    System.out.println("La venta realizada por " + cantidad + " cajas al costo " + precio + " es igual a " + resultado + ".");
                    break;
                case 'c':
                    CalculadorCompraVenta.mostrarReporte();
                    break;
                default:
                    System.out.println("Opcion No valida");
            }
        }while (opcion != 'd') ;
        System.out.println("Muchas gracias por usar nuestra aplicacion. ");
        CalculadorCompraVenta.mostrarDespedida();
    }
}