package edu.jesus_fdez.reto9.process;

import edu.jesus_fdez.reto9.ui.Idiomas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContadorDePalabras {
    private static final HashMap<String, String> librosDisponibles = new HashMap<>(); /** HashMap que almacena los libros disponibles**/

    static {
        librosDisponibles.put("1", "src/edu/jesus_fdez/reto9/resource/libro1.txt");
        librosDisponibles.put("2", "src/edu/jesus_fdez/reto9/resource/libro2.txt");
        librosDisponibles.put("3", "src/edu/jesus_fdez/reto9/resource/libro3.txt");
        librosDisponibles.put("4", "src/edu/jesus_fdez/reto9/resource/libro4.txt");
        librosDisponibles.put("5", "src/edu/jesus_fdez/reto9/resource/libro5.txt");
    }


    public static void setLibrosDisponibles(String libroSeleccionado) {
        /** Obtener la ruta del archivo del libro seleccionado**/
        String filePath = librosDisponibles.get(libroSeleccionado);

        /** Obtener las palabras del libro, limpiarlas, contarlas y mostrar el top 10**/
        List<String> palabras = LimpiadorDeTexto.obtenerPalabras(filePath); /**Obtener palabras del libro**/
        Map<String, Integer> frecuenciaPalabras = contarPalabras(palabras); /** Contar la frecuencia de las palabras**/
        List<Map.Entry<String, Integer>> listaOrdenada = ordenarFrecuencia(frecuenciaPalabras); /** Ordenar por frecuencia**/

        /**Mostrar las 10 palabras más comunes**/
        int contador = 0;
        for (Map.Entry<String, Integer> entrada : listaOrdenada) {
            System.out.println(entrada.getKey() + ": " + entrada.getValue() + " "+ Idiomas.VECES); /**Mostrar palabra y frecuencia**/
            contador++;
            if (contador == 10) break; /**Salir del bucle después de mostrar las primeras 10 palabras**/
        }
    }

    /** Método para contar la frecuencia de las palabras**/
    public static Map<String, Integer> contarPalabras(List<String> palabras){
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String palabra : palabras){
            frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0)+1); /** Incrementar la frecuencia de la palabra**/
        }
        return frecuencia;
    }

    /** Método para ordenar las palabras por frecuencia**/
    public static List<Map.Entry<String, Integer>> ordenarFrecuencia(Map<String, Integer> frecuencia){
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(frecuencia.entrySet());
        listaOrdenada.sort((a, b) -> b.getValue().compareTo(a.getValue())); /**Ordenar por frecuencia descendente**/
        return listaOrdenada;
    }
    public static void contarVocales(List<String> palabras){
        /**Metodo para contar vocales con lambda**/
        long totalVocales = palabras.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c ->(char) c)
                .filter(c ->"aeiouAEIOU".indexOf(c)!=-1)
                .count();
        System.out.println(Idiomas.TOTAL_VOCALES + totalVocales);
    }
    public static void situacionVocales(List<String> palabras){
        boolean situacion = palabras.stream()
                .anyMatch(p->p.matches("^[aeiouAEIOU].*[aeiouAEIOU]$")&& p.length()>=5);
        System.out.println(Idiomas.SITUACION_VOCALES+situacion);
    }
    public static void imprimirPalabrasVocales(List<String> palabras){
        palabras.stream()
                .filter(p->p.length() > 0 && "aeiouAEIOU".indexOf(p.charAt(0))!=-1)
                .sorted()
                .distinct()
                .forEach(System.out::println);
    }

}
