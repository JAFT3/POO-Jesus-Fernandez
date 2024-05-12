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
    public static final String ROBOT = "U+1F916";


    public static final List<String> listaSimbolos = new ArrayList<>();
    public static final Map<String, Character> simbolosConValor = new HashMap<>();

    static {
        simbolosConValor.put(TACHA, '7');
        simbolosConValor.put(CIRCULO, '9');
        simbolosConValor.put(ESTRELLA, '5');
        simbolosConValor.put(PICA, '0');
        simbolosConValor.put(DIAMANTE, '6');
        simbolosConValor.put(TREBOL, '2');
        simbolosConValor.put(CORAZON, '4');
        simbolosConValor.put(SONRIENTE, '8');
        simbolosConValor.put(ANCLA, '3');
        simbolosConValor.put(PARAGUAS, '1');

        listaSimbolos.addAll(simbolosConValor.keySet());
        listaSimbolos.remove(ROBOT);
        listaSimbolos.stream().sorted();
    }
    public List<String> getListaSimbolos(){
        return listaSimbolos;
    }
}
