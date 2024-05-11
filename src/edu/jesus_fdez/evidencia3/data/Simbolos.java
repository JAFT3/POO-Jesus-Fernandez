package edu.jesus_fdez.evidencia3.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Simbolos {
    /**Simbolos Basicos**/
    public static final String TACHA = "\u2717";
    public static final String CIRCULO = "\u25CB";

    /**Simbolos adicionales**/
    public static final String ESTRELLA = "\u2605";
    public static final String SOL = "\u263C";
    public static final String PICA = "\u2660";
    public static final String DIAMANTE = "\u2666";
    public static final String TREBOL = "\u2663";
    public static final String CORAZON = "\u2764";
    public static final String PAZ = "\u262E";
    public static final String SONRIENTE = "\u263A";
    public static final String ANCLA = "\u2693";
    public static final String PARAGUAS = "\u2602";
    public static final String ROBOT = "\uD83E\uDD16";

    public static final List<String> listaSimbolos = new ArrayList<>();
    public static final Map<String, Integer> simbolosConValor = new HashMap<>();

    static {
        simbolosConValor.put(TACHA, 8);
        simbolosConValor.put(CIRCULO, 10);
        simbolosConValor.put(ESTRELLA, 6);
        simbolosConValor.put(SOL, 11);
        simbolosConValor.put(PICA, 1);
        simbolosConValor.put(DIAMANTE, 7);
        simbolosConValor.put(TREBOL, 3);
        simbolosConValor.put(CORAZON, 5);
        simbolosConValor.put(PAZ, 12);
        simbolosConValor.put(SONRIENTE, 9);
        simbolosConValor.put(ANCLA, 4);
        simbolosConValor.put(PARAGUAS, 2);

        listaSimbolos.addAll(simbolosConValor.keySet());
        listaSimbolos.remove("\uD83E\uDD16");
        listaSimbolos.stream().sorted();
    }
    public List<String> getListaSimbolos(){
        return listaSimbolos;
    }
}
