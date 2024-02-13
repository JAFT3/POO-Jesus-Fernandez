package edu.jesus_fdez.reto3.lista_pares_impares.process;

public class ContadorNumeros {
    public static int tabla [][];

    /**
     * Llena la tabla con números aleatorios entre 0 y 99.
     * @param filas Número de filas en la tabla.
     * @param columnas Número de columnas en la tabla.
     */
    public static void llenarTabla(int filas, int columnas){
        for (int f = 0; f < filas; f++){
            for (int c = 0; c < columnas; c++){
                tabla[f][c] = (int)(Math.random()*100);
            }
        }
    }
    /**
     * Muestra la tabla en formato de matriz, separando cada elemento con tabulación.
     * @param filas Número de filas en la tabla.
     * @param columnas Número de columnas en la tabla.
     */
    public static void mostrarTabla(int filas, int columnas){
        for (int f = 0; f < filas; f++){
            for (int c = 0; c < columnas; c++){
                System.out.print(tabla[f][c] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * Cuenta la cantidad de números pares e impares en cada fila y columna, y muestra los resultados.
     * @param filas Número de filas en la tabla.
     * @param columnas Número de columnas en la tabla.
     */
    public static void contarParesImpares(int filas, int columnas){
        System.out.println("------------------------------------------------------");
        for (int f = 0; f < filas; f++){
            int paresFila = 0;
            int imparesFila = 0;
            for (int c = 0; c < columnas; c++){
                if (tabla[f][c] % 2 == 0){
                    paresFila++;
                }else {
                    imparesFila++;
                }
            }
            System.out.println("Cantidad de pares: " + paresFila + ", impares: " + imparesFila +
                    " en la fila " + (f+1));
        }
        System.out.println("------------------------------------------------------");
        for (int c = 0; c < filas; c++){
            int paresColumna = 0;
            int imparesColumna = 0;
            for (int f = 0; f < filas; f++){
                if (tabla[f][c] % 2 == 0){
                    paresColumna++;
                }else {
                    imparesColumna++;
                }
            }
            System.out.println("Cantidad de pares: " + paresColumna + ", impares: " + imparesColumna +
                    " en la fila " + (c+1));
        }
    }
    /**
     * Muestra la suma total de todos los valores en la tabla.
     * @param filas Número de filas en la tabla.
     * @param columnas Número de columnas en la tabla.
     */
    public static void mostrarTotal(int filas, int columnas){
        int sumaTotal = 0;
        for (int f = 0; f<filas; f++){
            for (int c = 0; c < columnas; c++){
                sumaTotal += tabla[f][c];
            }
        }
        System.out.println("La suma total de los valores del vector es: " + sumaTotal);
    }
    /**
     * Llena la tabla, la muestra, cuenta pares e impares, y muestra la suma total.
     * @param filas Número de filas en la tabla.
     * @param columnas Número de columnas en la tabla.
     */
    public static void tablaCompleta(int filas, int columnas){
        tabla = new int[filas][columnas];
        llenarTabla(filas,columnas);
        mostrarTabla(filas,columnas);
        contarParesImpares(filas,columnas);
        mostrarTotal(filas,columnas);
    }
}
