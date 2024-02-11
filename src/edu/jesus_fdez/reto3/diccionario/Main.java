package edu.jesus_fdez.reto3.diccionario;

import edu.jesus_fdez.reto3.diccionario.process.Diccionario;
import edu.jesus_fdez.reto3.diccionario.ui.CLI;

public class Main {
    public static void main(String[] args) {
        /**Definimos los arreglos con las palabras y signicafods para ser usados en el codigo. **/
        String palabras[] = {"Esmeralda", "Efimero", "Pulcro", "Oblicuo", "Inefable", //
                            "Placido", "Nebuloso", "Quimera", "Sutil", "Uberrimo"};
        String definicion[] = {"Piedra preciosa verde brillante.", "Breve y de corta duración.", "Meticulosamente limpio y ordenado.",
                "Inclinado u orientado en ángulo.", "Incapaz de ser expresado con palabras.", "Tranquilo, sereno y apacible.",
                "Que carece de claridad o definición.", "Ilusión o idea irrealizable.", "Delicado y tenue, difícil de percibir.",
                "Muy fértil y productivo."};
        Diccionario diccionario = new Diccionario(palabras, definicion);
        CLI.launchApp(diccionario);
    }
}
