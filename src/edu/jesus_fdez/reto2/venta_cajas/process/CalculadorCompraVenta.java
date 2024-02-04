package edu.jesus_fdez.reto2.venta_cajas.process;

public class CalculadorCompraVenta {
/**Declaramos las variables que usaremos en varios de los metodos*/
    static int transacciones = 0;
    static int ventasTotales = 0;
    static int comprasTotales = 0;
    static double fondos = 0; /**Esta variable guarda el monto total del dinero disponible.**/

    static double dineroVenta = 0;
    static double dineroCompra = 0;

    /**Este metodo lo utilizamos para calcular la cantidad de cajas vendidas.
     * Despues el resultado lo agregamos al dinero de fondos y al dinero de ventas,
     * incrementamos por 1 el numero de transacciones y agregamos la cantidad de cajas vendidas.*/
    public static double venderCajas(int cantidad, double precio){
        fondos += cantidad*precio;
        dineroVenta += cantidad*precio;
        ventasTotales +=cantidad;
        transacciones ++;
        return cantidad*precio;
    }
    /**Este metodo lo utilizamos para calcular la cantidad de cajas compradas.
     * Despues el resultado lo restamos al dinero de fondos y lo agregamos al dinero de compras,
     * incrementamos por 1 el numero de transacciones y agregamos la cantidad de cajas compradas.*/
    public static double comprarCajas(int cantidad, double precio){
        fondos -= cantidad*precio;
        dineroCompra += precio*cantidad;
        comprasTotales += cantidad;
        transacciones++;
        return cantidad*precio;
    }
    /**Juntamos toda la estadistica recabada y la desglosamos de la manera presentada**/
    public static void mostrarReporte(){
        System.out.println("Total de ventas: " + ventasTotales);
        System.out.println("Total de compras: " + comprasTotales);
        System.out.println("Ingresos generados por ventas: " + dineroVenta);
        System.out.println("Egresos generados por compras: " + dineroCompra);
        System.out.println("Fondos en la caja: " + fondos);
    }
    /**Este metodo es similar al anterior, pero aqui agregamos el total de transacciones*/
    public static void mostrarDespedida(){
        System.out.println("\nResumen de actividades:" +
                "\nCantidad total de transacciones realizadas: " + transacciones +
                "\nCantidad total de ventas: " + ventasTotales +
                "\nCantidad total de compras: " + comprasTotales +
                "\nMonto en la caja: " + fondos +
                "\nIngresos generados por ventas: " + dineroVenta +
                "\nEgresos generados por compras: " + dineroCompra +
                "\nGracias por comprar y vender cajas con nosotros.");

    }
}